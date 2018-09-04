package com.king.studykotlin.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.king.studykotlin.R


@Suppress("UNREACHABLE_CODE")
class MainAdapter(var list: ArrayList<String>, var context: Context) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var holder: TestViewHolder
        var view: View
        if (convertView == null) {
            view = View.inflate(context, R.layout.list_item, null)
            holder = TestViewHolder(view)
            view.setTag(holder)
        } else {
            view = convertView
            holder = view.tag as TestViewHolder
        }
        holder.tvItem.text = list[position]
        return view
    }

    override fun getItem(position: Int): Any {
        return list.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

}

class TestViewHolder(var view: View) {
    var tvItem: TextView = view.findViewById(R.id.tvItem)
}