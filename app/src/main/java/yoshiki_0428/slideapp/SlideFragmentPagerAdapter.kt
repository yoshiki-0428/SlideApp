package yoshiki_0428.slideapp

import android.support.annotation.DrawableRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class SlideFragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 -> SlideFragment().newInstance(SlidePageEnum.Page1)
            1 -> SlideFragment().newInstance(SlidePageEnum.Page2)
            2 -> SlideFragment().newInstance(SlidePageEnum.Page3)
            3 -> SlideFragment().newInstance(SlidePageEnum.Page4)

            else -> null
        }
    }

    override fun getCount(): Int {
        return SlidePageEnum.values().size
    }
}

enum class SlidePageEnum(val title: String, @field:DrawableRes val imageId: Int, val description: String) {
    Page1("アプリの紹介1", 100, "このアプリの機能の説明1"),
    Page2("アプリの紹介2", 100, "このアプリの機能の説明2"),
    Page3("アプリの紹介3", 100, "このアプリの機能の説明3"),
    Page4("アプリの紹介4", 100, "このアプリの機能の説明4")
}