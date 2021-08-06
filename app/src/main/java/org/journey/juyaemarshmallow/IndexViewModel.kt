package org.journey.juyaemarshmallow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.journey.juyaemarshmallow.repository.HwahaeRepository

class IndexViewModel: ViewModel() {

//    fun setSearchKeyword(searchKeyword: String) {
//        HwahaeRepository.setSearchKeyword(searchKeyword)
//    }

    fun setIsSearchKeywordSet(aBoolean: Boolean) {
        HwahaeRepository.setIsSearchKeywordSet(aBoolean)
    }

    fun getIsSearchKeywordSet() = HwahaeRepository.getIsSearchKeywordSet()

//    fun setSkinType(skinType: String) {
//        HwahaeRepository.setSkinType(skinType)
//    }

    fun setIsSkinTypeSet(aBoolean: Boolean) {
        HwahaeRepository.setIsSkinTypeSet(aBoolean)
    }


    fun getIsSkinTypeSet() = HwahaeRepository.getIsSkinTypeSet()


    //fun getProductList(): LiveData<PagedList<IndexViewItem>> = HwahaeRepository.getProductList()


    //fun getNetworkState(): LiveData<NetworkStatus.State> = HwahaeRepository.getState()


    fun getIsUpdatedProductDetail(): MutableLiveData<Boolean> = HwahaeRepository.getIsUpdatedProductDetail()


    fun setIsUpdatedProductDetail(flag: Boolean) {
        HwahaeRepository.setIsUpdatedProductDetail(flag)
    }

    //fun fetchProductList() { HwahaeRepository.fetchProductList() }
}