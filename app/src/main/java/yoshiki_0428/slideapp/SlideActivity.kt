package yoshiki_0428.slideapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_slide.*

class SlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide)
        activity_slide_view_pager.adapter = SlideFragmentPagerAdapter(supportFragmentManager)
        activity_slide_view_pager.setCurrentItem(0, true)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun setViewPages(no : Int) {
        activity_slide_view_pager.setCurrentItem(activity_slide_view_pager.currentItem + no, true)
    }
}