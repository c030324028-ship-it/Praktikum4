package com.example.praktikum4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val daftarMatakuliah = listOf(
            Matakuliah("P01", "Pemrograman Berorientasi Objek", 3, "Wanvy Arifha Saputra", "Senin, 13:00 - 16:00", "Lab RPL"),
            Matakuliah("P02", "Matematika", 2, "Isna Wardiah", "Senin, 08:00 - 10:00", "H-101"),
            Matakuliah("P03", "Basisdata", 3, "M. Helmy Noor", "Selasa, 08:00 - 11:00", "Lab RPL"),
            Matakuliah("P04", "Rekayasa Perangkat Lunak", 3, "Rahimi Fitri", "Selasa, 13:00 - 16:00", "Lab RPL"),
            Matakuliah("P05", "Bahasa Inggris", 2, "Siti Kustini", "Rabu, 08:00 - 10:00", "H-101"),
            Matakuliah("P06", "Struktur Data", 3, "Saberan", "Rabu, 13:00 - 16:00", "Lab RPL"),
            Matakuliah("P07", "Jaringan Lanjut", 3, "Arifin Noor Asyikin", "Kamis, 08:00 - 11:00", "Lab Jarkom"),
            Matakuliah("P08", "Interaksi Manusia dan Komputer", 2, "Ahmad Yusuf", "Kamis, 13:00 - 15:00", "H-101")
        )

        val rvMatakuliah = view.findViewById<RecyclerView>(R.id.rvMatakuliah)
        rvMatakuliah.layoutManager = LinearLayoutManager(context)
        rvMatakuliah.adapter = MatakuliahAdapter(daftarMatakuliah)

        return view
    }
}