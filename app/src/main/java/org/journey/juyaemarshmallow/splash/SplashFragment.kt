package org.journey.juyaemarshmallow.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.coroutines.*
import org.journey.juyaemarshmallow.R
import org.journey.juyaemarshmallow.base.BaseFragment
import org.journey.juyaemarshmallow.databinding.FragmentSplashBinding
import kotlin.coroutines.CoroutineContext


class SplashFragment : BaseFragment<FragmentSplashBinding>(), CoroutineScope {
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + Job()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        launch {
            delay(2000)
            withContext(Dispatchers.Main){
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_splashFragment_to_loginFragment)
            }
        }
        
    }
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater,container,false)
    }
}