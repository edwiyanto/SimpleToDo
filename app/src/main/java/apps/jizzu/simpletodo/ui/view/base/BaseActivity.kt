package apps.jizzu.simpletodo.ui.view.base

import android.os.Build
import android.view.WindowManager
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import apps.jizzu.simpletodo.R
import kotlinx.android.synthetic.main.toolbar.*

abstract class BaseActivity : AppCompatActivity() {

    fun initToolbar(titleText: String, drawable: Int? = R.drawable.round_close_black_24, view: Toolbar? = toolbar) {
        title = ""
        toolbarTitle.text = titleText

        if (toolbar != null) {
            if (Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP || Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP_MR1) {
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window.statusBarColor = ContextCompat.getColor(this, R.color.greyWhite)
            }
            setSupportActionBar(view)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            if (drawable != null) {
                supportActionBar?.setHomeAsUpIndicator(drawable)
            }
        }
    }
}