package com.example.aps_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aps_app.adapters.AdapterGames
import com.example.aps_app.models.Game

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentoJogos.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentoJogos : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view=  inflater.inflate(R.layout.fragment_fragmento_jogos, container, false)

        val lista = arrayListOf<Game>()
        lista.add(Game("Skyrim", "2011"))
        lista.add(Game("Cyberpunk", "2020"))
        lista.add(Game("Shadow of The Colossus", "2006"))
        lista.add(Game("The Witcher 3", "2014"))
        lista.add(Game("World of Warcraft", "2006"))
        lista.add(Game("Fallout 1", "1997"))
        lista.add(Game("Fallout 2", "1998"))
        lista.add(Game("Fallout 3", "2008"))
        lista.add(Game("Fallout New Vegas", "2010"))
        lista.add(Game("Age of Empires", "1997"))
        lista.add(Game("Age of Empires 2", "1997"))
        lista.add(Game("Age of Empires 2 HD Edition", "2013"))
        lista.add(Game("Age of Empires 2 Definitive Edition", "2019"))


        val recycleGame = view?.findViewById<RecyclerView>(R.id.listagem)
        recycleGame?.layoutManager = LinearLayoutManager(view?.context)
        recycleGame?.adapter = AdapterGames(lista)

        return view

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentoJogos.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentoJogos().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}