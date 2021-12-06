package yvg68.measurer.recyclerview20211130_practica

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DatesViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    private val questionTextView: TextView = itemView.findViewById(R.id.question)
    private val answer1TextView: TextView = itemView.findViewById(R.id.answer1)
    private val answer2TextView: TextView =itemView.findViewById(R.id.answer2)

    fun bind(dateQuestions: DatesQuestioons){
        questionTextView.text = "ВОПРОС: ${dateQuestions.question}"
        answer1TextView.text = "Ответ1: ${dateQuestions.answer1}"
        answer2TextView.text = "Ответ2: ${dateQuestions.answer2}"




    }
}