package com.example.customlistview2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class CustomAdapter(val ctx: Context, val myDataList: List<MyData>): BaseAdapter() {
    override fun getCount(): Int {
        return myDataList.size
    }

    override fun getItem(position: Int): MyData {
        return myDataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
    {
        var myConverterView = convertView
        if (myConverterView == null){
            myConverterView = LayoutInflater.from(ctx).inflate(R.layout.mylistitem,parent,false)
        }
        val currentItem = getItem(position)

        val imageItem = myConverterView?.findViewById<ImageView>(R.id.listitemimage)
        val titleItem = myConverterView?.findViewById<TextView>(R.id.listitemtitle)
        val descItem = myConverterView?.findViewById<TextView>(R.id.listitemdescription)

        imageItem?.setImageResource(currentItem.image)
        titleItem?.text = currentItem.title
        descItem?.text = currentItem.desc

      /*  myConverterView?.tag= position
        myConverterView?.setOnClickListener { view-> }

           val clickedPosition=view.tag as Int
           val clickedItem=getItem(clickedPosition)
        Toast.makeText(ctx, "You have clicked")*/

        return myConverterView!!
    }
}
