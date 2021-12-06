package yvg68.measurer.recyclerview20211130_practica

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DatesAdapter(private val datesQuestionsList: List<DatesQuestioons>): RecyclerView.Adapter<DatesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatesViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.user_list_item,parent, false)
        return DatesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DatesViewHolder, position: Int) {
        val dateQuestions = datesQuestionsList[position]
        holder.bind(dateQuestions)

    }

    override fun getItemCount(): Int {
        return datesQuestionsList.size
        //
    }
}