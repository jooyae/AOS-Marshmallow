package org.journey.juyaemarshmallow.data.datasource

import android.arch.paging.PageKeyedDataSource
import com.google.gson.JsonSyntaxException
import kotlinx.coroutines.*
import org.journey.juyaemarshmallow.IndexViewItem
import org.journey.juyaemarshmallow.data.NetworkStatus
import java.net.SocketTimeoutException

class HwahaeDataSource : PageKeyedDataSource<Int, IndexViewItem>() {

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, IndexViewItem>
    ) {
        val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->

            when (throwable) {

                is SocketTimeoutException -> {
                    NetworkStatus.updateNetworkState(NetworkStatus.State.RETRY)
                    loadInitial(params, callback)
                }

                is JsonSyntaxException -> {
                    NetworkStatus.updateNetworkState(NetworkStatus.State.DONE)
                }

                else -> {
                    NetworkStatus.updateNetworkState(NetworkStatus.State.FAILED)
                    throwable.printStackTrace()
                }
            }
        }
        NetworkStatus.updateNetworkState(NetworkStatus.State.LOADING)
        CoroutineScope(Dispatchers.IO + coroutineExceptionHandler).launch {
//            HwahaeWebService.service.getProductList(IndexViewStatus.currentSkinType, INITIAL_PAGE_KEY, IndexViewStatus.currentSearchKeyword).apply {
//                withContext(Dispatchers.Main) {
//                    callback.onResult(this@apply.body, 0, this@apply.body.size, null, INITIAL_PAGE_KEY+1)
//                    NetworkStatus.updateNetworkState(NetworkStatus.State.DONE)
//                }
//            }
        }
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, IndexViewItem>) {
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, IndexViewItem>) {
        val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
            when (throwable) {
                is SocketTimeoutException -> {
                    NetworkStatus.updateNetworkState(NetworkStatus.State.RETRY)
                    loadAfter(params, callback)
                }
                is JsonSyntaxException -> {
                    NetworkStatus.updateNetworkState(NetworkStatus.State.DONE)
                }
                else -> {
                    NetworkStatus.updateNetworkState(NetworkStatus.State.FAILED)
                    throwable.printStackTrace()
                }
            }
        }

    }

    companion object {
        val INITITAL_PAGE_KEY = 1
    }

}