package yoshiki_0428.slideapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(applicationContext, SlideActivity::class.java))
    }
}
