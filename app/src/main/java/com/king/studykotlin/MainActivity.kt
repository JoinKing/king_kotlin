package com.king.studykotlin
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.king.studykotlin.adapter.MainAdapter
import com.king.studykotlin.activity.GuidePackage
import com.king.studykotlin.activity.LambdaActivity
import com.king.studykotlin.activity.OnClickListenerActivity
import org.jetbrains.anko.toast

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {
    private var itemList = ArrayList<String>()
    private var adapter : MainAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        itemList.getData()
        adapter = MainAdapter(itemList,this)
        mListView.adapter = adapter
        initLisenter()
    }


    private fun initLisenter() {
        mListView.setOnItemClickListener { parent, view, position, id ->
            when(position){
                0->startActivity(Intent(this, GuidePackage::class.java))
                1->startActivity(Intent(this, OnClickListenerActivity::class.java))
                2->startActivity(Intent(this, LambdaActivity::class.java))
                else->toast("1231")
            }
        }
    }

    fun ArrayList<String>.getData(){
        for (i in 0..20){
            when(i){
                0->this.add("导包可以不用findViewById（）")
                1->this.add("点击事件（）")
                2->this.add("Lambda表达式（）")
                else ->this.add("测试数据$i")
            }
        }
    }
}
