package org.journey.juyaemarshmallow.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import org.journey.juyaemarshmallow.R
import org.journey.juyaemarshmallow.base.BaseFragment
import org.journey.juyaemarshmallow.databinding.FragmentLoginBinding


class LoginFragment : BaseFragment<FragmentLoginBinding>() {
    private lateinit var viewPager: ViewPager2
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadIndicator()
    }


    private fun loadIndicator() {
        val imageList = listOf (R.drawable.imagelist1, R.drawable.imagelist2)
        val viewPager = binding.viewpagerLogin
//        viewPager.setPageTransformer { page, position ->
//            page.translationX = position
//        }
        viewPager.adapter = ViewPagerAdapter(imageList)
        binding.indicatorLogin.setViewPager2(viewPager)
        viewPager.offscreenPageLimit = 2
    }



}