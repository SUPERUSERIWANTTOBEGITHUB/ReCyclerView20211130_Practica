package yvg68.measurer.recyclerview20211130_practica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var userRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val datesQuestionsList: List<DatesQuestioons> = listOf(
        DatesQuestioons("Сколько будет 2х2", "3", "4"),
        DatesQuestioons("Какое нарицательное имя было у Русской водки?", "4,12", "3,62"),
        DatesQuestioons("Отчество Леонида Брежнева", "Петрович", "Ильич"),
        DatesQuestioons("Какой штраф был за безбилетный проезд в общественном транспорте, в СССР, в семидесятые годы", "3 рубля", "5 рублей")
        )
    userRecyclerView = findViewById(R.id.user_recycler_view)
    userRecyclerView.layoutManager =
        LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    userRecyclerView.adapter = DatesAdapter(datesQuestionsList)
    userRecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }

}
// for work recyclerView need: RecyclerView <- Adapter <- ViewHolder <- layout
// his (RecyclerView) need two parameters:
// 1. layoutManager - linearLayoutManager, Greed
// 2. Adapter