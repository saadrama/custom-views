package com.example.customlistview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast


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

                myListdata.add(MyData(R.drawable.snapchat,"snapchat","xxxxx"))
                myListdata.add(MyData(R.drawable.tiktok,"tiktok","xxxxx"))
                myListdata.add(MyData(R.drawable.tumblr,"tumblr","xxxxx"))
                myListdata.add(MyData(R.drawable.twitter,"twitter","xxxxx"))
                myListdata.add(MyData(R.drawable.wechat,"wechat","xxxxx"))
                myListdata.add(MyData(R.drawable.weibo,"weibo","xxxxx"))
                myListdata.add(MyData(R.drawable.whatsapp,"whatsapp","xxxxx"))
                myListdata.add(MyData(R.drawable.youtube,"Youtube","xxxxx"))

                val myListView = findViewById<ListView>(R.id.mylistview)
                myListView.adapter = CustomAdapter(this,myListdata)

                myListView.setOnItemClickListener { parent, view, position, id ->

                    if (position==0)
                    {
                        Toast.makeText(this,"Tapped", Toast.LENGTH_LONG).show()
                    }
                }


            }

        }