package com.king.studykotlin.base

import kotlinx.android.synthetic.main.layout_head_title.*
import android.app.Activity
import android.os.Bundle
import android.view.View

abstract class BaseActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initContentView())
        initView()
        initListener()
        initData()
    }

    abstract fun initContentView(): Int
    abstract fun initView()
    abstract fun initListener()
    abstract fun initData()


    fun initTitle(isShow:Boolean,title:String){
        if (isShow){
            tvImgBack.visibility = View.VISIBLE
        }
        tvMid.text = title

        tvImgBack.setOnClickListener(View.OnClickListener {
            finish()
            setResult(RESULT_OK)
        })
    }

}