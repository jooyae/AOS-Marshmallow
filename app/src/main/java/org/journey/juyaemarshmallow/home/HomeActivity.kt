package org.journey.juyaemarshmallow.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.journey.juyaemarshmallow.R
import org.journey.juyaemarshmallow.databinding.ActivityHomeBinding
import org.journey.juyaemarshmallow.mypage.MypageFragment

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    private val fragmentHome by lazy { HomeFragment() }
    private val fragmentSearch by lazy { SearchFragment() }
    private val fragmentShop by lazy { ShopFragment() }
    private val fragmentMypage by lazy { MypageFragment() }

    private val fragments: List<Fragment> =
        listOf(fragmentHome, fragmentSearch, fragmentShop, fragmentMypage)

    private val pagerAdapter: FragmentStateAdapter by lazy {
        FragmentStateAdapter(this, fragments)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initNavigationBar()
        initViewPager()

    }

    private fun initNavigationBar() {
        binding.bottomNavigation.run {
            setOnNavigationItemSelectedListener {
                val page = when (it.itemId) {
                    R.id.homeFragment -> 0
                    R.id.searchFragment -> 1
                    R.id.shopFragment -> 2
                    R.id.mypageFragment -> 3
                    else -> 0
                }
                if (page != binding.viewpagerMain.currentItem) {
                    binding.viewpagerMain.currentItem = page
                }
                true
            }
            selectedItemId = R.id.homeFragment
        }
    }

    private fun initViewPager() {
        binding.viewpagerMain.run {
            adapter = pagerAdapter
            registerOnPageChangeCallback(object :
                ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    val navigation = when (position) {
                        0 -> R.id.homeFragment
                        1 -> R.id.searchFragment
                        2 -> R.id.shopFragment
                        3 -> R.id.mypageFragment
                        else -> R.id.homeFragment
                    }
                    if (binding.bottomNavigation.selectedItemId != navigation) {
                        binding.bottomNavigation.selectedItemId = navigation
                    }
                }
            })
        }
    }


}