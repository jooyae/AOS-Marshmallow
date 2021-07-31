package org.journey.juyaemarshmallow.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.coroutines.*
import org.journey.juyaemarshmallow.R
import org.journey.juyaemarshmallow.base.BaseFragment
import org.journey.juyaemarshmallow.databinding.FragmentOnboardingBinding
import kotlin.coroutines.CoroutineContext

class OnboardingFragment : BaseFragment<FragmentOnboardingBinding>(), CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + Job()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboarding, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        launch{
            delay(2000)
            withContext(Dispatchers.Main){
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_onboardingFragment_to_loginFragment)
            }

        }
    }
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentOnboardingBinding {
        return FragmentOnboardingBinding.inflate(inflater, container, false)
    }




}