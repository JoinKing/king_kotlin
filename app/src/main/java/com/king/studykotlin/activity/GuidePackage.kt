package com.king.studykotlin.activity

import kotlinx.android.synthetic.main.activity_guide_package.*
import com.king.studykotlin.R
import com.king.studykotlin.base.BaseActivity

/**
 * 导包可以不用findViewById
 */
class GuidePackage : BaseActivity() {
    override fun initContentView(): Int {
        return R.layout.activity_guide_package
    }

    override fun initView() {
        initTitle(true, "免导包findViewById")
        tvPackAge.text = getString(R.string.pakageName)
    }

    override fun initListener() {

    }

    override fun initData() {

    }

}
