package com.king.studykotlin.activity

import android.view.View
import com.king.studykotlin.R
import com.king.studykotlin.base.BaseActivity
import kotlinx.android.synthetic.main.activity_on_click_listener.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

/**
 * OnClickListenerActivity 点击事件
 */
class OnClickListenerActivity : BaseActivity() {
    override fun initContentView(): Int {
        return R.layout.activity_on_click_listener
    }

    override fun initView() {
        initTitle(true,"点击事件")
    }

    override fun initListener() {
        tvOnClick.setOnClickListener(View.OnClickListener {
            toast("我被点击了")
        })

        tvOnLongClick.setOnLongClickListener {
            longToast("长按事件"); true
        }
    }

    override fun initData() {

    }

}
