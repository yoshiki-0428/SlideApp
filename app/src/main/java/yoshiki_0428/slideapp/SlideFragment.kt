package yoshiki_0428.slideapp

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_slide.view.*


class SlideFragment : Fragment() {
    fun newInstance(page: SlidePageEnum): Fragment {
        val slideFragment = SlideFragment()
        val b = Bundle()
        b.putSerializable("page", page)
        slideFragment.arguments = b
        return slideFragment
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_slide, container, false)
        val page = arguments.getSerializable("page") as SlidePageEnum
        System.out.print(page.title)

        view.fragment_slide_title.text = page.title
        view.fragment_slide_description.text = page.description
        view.fragment_next_button.setOnClickListener{
            activity.finish()
        }

        return view
    }
}
