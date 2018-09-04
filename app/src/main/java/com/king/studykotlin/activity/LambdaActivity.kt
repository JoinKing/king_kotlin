package com.king.studykotlin.activity

import android.annotation.SuppressLint
import com.king.studykotlin.R
import com.king.studykotlin.base.BaseActivity
import kotlinx.android.synthetic.main.activity_lambda.*

class LambdaActivity : BaseActivity() {
    override fun initContentView(): Int {
        return R.layout.activity_lambda
    }

    override fun initView() {
        initTitle(true,"Lambda表达式")
        tvLambda.text = "Lambda表达式"
    }

    @SuppressLint("SetTextI18n")
    override fun initListener() {
        tvLambda.setOnClickListener {
            tvLambda.text = "tvLambda.setOnClickListener {\n" +
                    "            tvLambda.text = \"Lambda表达式\"\n" +
                    "        }"
        }

    }

    override fun initData() {

    }

}
