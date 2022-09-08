package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: RecyclerAdapter
    private lateinit var manager:LinearLayoutManager
    private lateinit var list:List<ListItem>
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView)
        var spanCount=2
        manager= GridLayoutManager(this,spanCount)
        list= listOf(ListItem(R.drawable.profile,"John"),
                    ListItem(R.drawable.profile,"Jacob"),
                    ListItem(R.drawable.profile,"James"),
                    ListItem(R.drawable.profile,"Johnson"),
                    ListItem(R.drawable.profile,"Jeff"),
                    ListItem(R.drawable.profile,"Jack"),
                    ListItem(R.drawable.profile,"Jim"),
                    ListItem(R.drawable.profile,"Joel"),
                    ListItem(R.drawable.profile,"John"),
                    ListItem(R.drawable.profile,"Jacob"),
                    ListItem(R.drawable.profile,"James"),
                    ListItem(R.drawable.profile,"Johnson"),
                    ListItem(R.drawable.profile,"Jeff"),
                    ListItem(R.drawable.profile,"Jack"),
                    ListItem(R.drawable.profile,"Jim"),
                    ListItem(R.drawable.profile,"Joel"))
        adapter= RecyclerAdapter(list)
        recyclerView.layoutManager=manager
        recyclerView.adapter=adapter
    }
}