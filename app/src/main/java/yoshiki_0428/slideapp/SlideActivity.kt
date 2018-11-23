package yoshiki_0428.slideapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_slide.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.ThreadMode
import org.greenrobot.eventbus.Subscribe
import yoshiki_0428.slideapp.event.SwipeEvent


class SlideActivity : AppCompatActivity() {
    override fun onStart() {
        EventBus.getDefault().register(this)
        super.onStart()
    }

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
        EventBus.getDefault().unregister(this)
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onSwipeEvent(event: SwipeEvent) {
        val currentPage = activity_slide_view_pager.currentItem
        activity_slide_view_pager.currentItem = currentPage + event.page
    }
}