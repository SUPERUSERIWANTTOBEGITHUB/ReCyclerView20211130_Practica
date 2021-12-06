package yvg68.measurer.recyclerview20211130_practica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var userRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    userRecyclerView = findViewById(R.id.user_recycler_view)
    userRecyclerView.layoutManager =
        LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}
// for work recyclerView need: RecyclerView <- Adapter <- ViewHolder <- layout
// his (RecyclerView) need two parameters:
// 1. layoutManager - linearLayoutManager, Greed
// 2. Adapter