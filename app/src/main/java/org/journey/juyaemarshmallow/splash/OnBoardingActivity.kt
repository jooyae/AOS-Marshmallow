package org.journey.juyaemarshmallow.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.journey.juyaemarshmallow.R
import org.journey.juyaemarshmallow.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.onboarding_container_view, OnboardingFragment())
            .commitNow()
    }
}