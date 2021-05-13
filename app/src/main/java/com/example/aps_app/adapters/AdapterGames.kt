package com.example.aps_app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.aps_app.R
import com.example.aps_app.models.Game

class AdapterGames (private val list: ArrayList<Game>) : Adapter<AdapterGames.GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_jogos,parent,false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val jogos = list[position]
        holder.set(jogos)

    }

    override fun getItemCount() = list.size

    class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val textViewTitulo: AppCompatTextView = itemView.findViewById<AppCompatTextView>(R.id.textNome)
        val textViewLancamento = itemView.findViewById<AppCompatTextView>(R.id.textLancamento)

        fun set(jogos: Game) {
            textViewTitulo.text = jogos.nome
            textViewLancamento.text = jogos.lancamento
        }


    }

}
