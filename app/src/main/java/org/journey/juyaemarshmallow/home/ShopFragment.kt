package org.journey.juyaemarshmallow.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.journey.juyaemarshmallow.base.BaseFragment
import org.journey.juyaemarshmallow.databinding.FragmentLoginBinding
import org.journey.juyaemarshmallow.databinding.FragmentShopBinding

class ShopFragment : BaseFragment<FragmentShopBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentShopBinding {
        return FragmentShopBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}