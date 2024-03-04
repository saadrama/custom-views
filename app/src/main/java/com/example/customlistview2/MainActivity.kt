package com.example.customlistview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


        class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val myListdata = mutableListOf<MyData>()

                myListdata.add(MyData(R.drawable.facebook,"Facebook","xxxxxxx"))
                myListdata.add(MyData(R.drawable.cnn,"cnn","xxxxxx"))
                myListdata.add(MyData(R.drawable.fox,"fox","xxxxxx"))
                myListdata.add(MyData(R.drawable.instagram,"instagram","xxxxxx"))
                myListdata.add(MyData(R.drawable.linkedin,"linkedin","xxxxxx"))
                myListdata.add(MyData(R.drawable.messenger,"messenger","xxxxxx"))
                myListdata.add(MyData(R.drawable.pinterest,"pintrest","xxxxx"))
                myListdata.add(MyData(R.drawable.reddit,"reddit","xxxxxx"))

                myListdata.add(MyData(R.drawable.snapchat,"reddit","xxxxx"))
                myListdata.add(MyData(R.drawable.tiktok,"reddit","xxxxx"))
                myListdata.add(MyData(R.drawable.tumblr,"reddit","xxxxx"))
                myListdata.add(MyData(R.drawable.twitter,"reddit","xxxxx"))
                myListdata.add(MyData(R.drawable.wechat,"reddit","xxxxx"))
                myListdata.add(MyData(R.drawable.weibo,"reddit","xxxxx"))
                myListdata.add(MyData(R.drawable.whatsapp,"reddit","xxxxx"))
                myListdata.add(MyData(R.drawable.youtube,"reddit","xxxxx"))

                val myListView = findViewById<ListView>(R.id.mylistview)
                myListView.adapter = CustomAdapter(this,myListdata)



            }

        }