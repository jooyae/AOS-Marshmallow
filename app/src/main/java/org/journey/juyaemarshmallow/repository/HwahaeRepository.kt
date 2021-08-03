package org.journey.juyaemarshmallow.repository

import androidx.lifecycle.MutableLiveData
import java.util.concurrent.Executors

object HwahaeRepository {


    private var mIsUpdatedProductDetail = MutableLiveData<Boolean>()
    private var mIsSkinTypeSet = MutableLiveData<Boolean>()
    private var mIsSearchKeywordSet = MutableLiveData<Boolean>()


    init {
        val executor = Executors.newFixedThreadPool(5)

//        val config = PagedList.Config.Builder()
//            .setPageSize(20)
//            .setPrefetchDistance(2)
//            .setEnablePlaceholders(false)
//            .build()
//
//        mProductList = LivePagedListBuilder<Int, IndexViewItem>(mProductDataSourceFactory , config)
//            .setFetchExecutor(executor)
//            .build()
    }

    /**
     * Set the typed keyword for searching
     */
//    fun setSearchKeyword(searchKeyword: String) {
//        IndexViewStatus.currentSearchKeyword = searchKeyword
//        mIsSearchKeywordSet.postValue(true)
//    }

    fun setIsSearchKeywordSet(aBoolean: Boolean) {
        mIsSearchKeywordSet.postValue(aBoolean)
    }

    fun getIsSearchKeywordSet() = mIsSearchKeywordSet


//    fun setSkinType(skinType: String) {
//        IndexViewStatus.currentSkinType = skinType
//        IndexViewStatus.currentSearchKeyword = null
//        mIsSkinTypeSet.postValue(true)
//    }


    fun setIsSkinTypeSet(aBoolean: Boolean) {
        mIsSkinTypeSet.postValue(aBoolean)
    }

    fun getIsSkinTypeSet() = mIsSkinTypeSet

//    fun getProductList(): LiveData<PagedList<IndexViewItem>> = mProductList


//    fun getState(): LiveData<NetworkStatus.State> = NetworkStatus.mState


    fun getIsUpdatedProductDetail(): MutableLiveData<Boolean> = mIsUpdatedProductDetail


    fun setIsUpdatedProductDetail(flag: Boolean) {
        mIsUpdatedProductDetail.postValue(flag)
    }

//    fun fetchProductDetail(productId: Int?): LiveData<DetailViewItem> {
//
//        var productDetail = MutableLiveData<DetailViewItem>()
//
//        NetworkStatus.updateNetworkState(NetworkStatus.State.LOADING)
//        CoroutineScope(Dispatchers.IO).launch {
//            try {
//                HwahaeWebService.service.getProductDetail(productId).apply {
//                    withContext(Dispatchers.Main) {
//                        NetworkStatus.updateNetworkState(NetworkStatus.State.DONE)
//                        productDetail.value = this@apply.body
//                    }
//                }
//            } catch (throwable: Throwable) {
//                throwable.printStackTrace()
//                NetworkStatus.updateNetworkState(NetworkStatus.State.FAILED)
//            }
//        }
//
//        return productDetail
//    }

//     fun fetchProductList() { mProductList.value?.dataSource?.invalidate() }
}
