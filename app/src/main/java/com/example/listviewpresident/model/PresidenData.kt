package com.example.listviewpresident.model

import com.example.listviewpresident.R

object PresidenData {
    private val presidenName = arrayOf(
        "SUKARNO",
        "SUHARTO",
        "BJ.HABIBIE",
        "ABDURAHMAN WAHID",
        "MEGAWATI",
        "SUSILO BAMBANG YUDHOYONO",
        "JOKOWI"
    )

    private val detail = arrayOf(
        "Lahir : 6 Juni 1901, Surabaya",
        "Lahir : 8 Juni 1921, Bantul",
        "Lahir : 25 Juni 1936, Pare - Pare",
        "Lahir : 7 September 1940, Jombang",
        "Lahir : 23 Januari 1947, Yogyakarta",
        "Lahir : 9 September 1949, Pacitan",
        "Lahir : 21 Juni 1961, Surakarta"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.sukarno,
        R.drawable.suharto,
        R.drawable.habibi,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi

    )

    val listPresident: ArrayList<Presiden>
        get() {
            val list = arrayListOf<Presiden>()
            for (position in presidenName.indices) {
                val presiden = Presiden()
                presiden.name = presidenName[position]
                presiden.detail = detail[position]
                presiden.poster = presidenPoster[position]
                list.add(presiden)
            }
            return list
        }
}