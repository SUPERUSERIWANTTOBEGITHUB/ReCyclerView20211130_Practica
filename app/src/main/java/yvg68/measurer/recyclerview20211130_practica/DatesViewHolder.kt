package yvg68.measurer.recyclerview20211130_practica
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DatesViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    lateinit var trueAnswer: TextView
    lateinit var falseAnswer: TextView
    private val questionTextView: TextView = itemView.findViewById(R.id.question)
    private val answer1TextView: TextView = itemView.findViewById(R.id.answer1)
    private val answer2TextView: TextView =itemView.findViewById(R.id.answer2)

    fun bind(dateQuestions: DatesQuestioons){
        questionTextView.text = "ВОПРОС: ${dateQuestions.question}"
        answer1TextView.text = " ${dateQuestions.answer1}"
        answer2TextView.text = " ${dateQuestions.answer2}"
        answer1TextView.setOnClickListener{
            Toast.makeText(itemView.context, "ответ неверный", Toast.LENGTH_SHORT).show()
        }
        answer2TextView.setOnClickListener{
            Toast.makeText(itemView.context, "ответ верный", Toast.LENGTH_SHORT).show()
        }
    }


    /*fun onClickTrue(view: RecyclerView){
        //trueAnswer = findViewById(R.id.answer2)
        trueAnswer.text = "Ответ верный"
    }
    fun onClickFalse(view: RecyclerView){
        //falseAnswer = findViewById(R.id.answer1)
        falseAnswer.text = "Ответ неверный"
    }*/
}