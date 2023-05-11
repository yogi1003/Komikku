package com.yogi.komikku.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yogi.komikku.Komik
import com.yogi.komikku.R
import com.yogi.komikku.detailKomikActivity
import com.yogi.komikku.komikAdapter

public class UntukmuFragment : Fragment() {

    public lateinit var adapter:komikAdapter
    public lateinit var recyclerView: RecyclerView
    public lateinit var komikArrayList: ArrayList<Komik>

    lateinit var image: Array<Int>
    lateinit var detailimage: Array<Int>
    lateinit var title: Array<String>
    lateinit var description: Array<String>
    lateinit var chapter: Array<Int>
    lateinit var rate: Array<String>


    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"

    }
    public override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_untukmu, container, false)
    }

    public override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_komik)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = context?.let {
            komikAdapter(it, komikArrayList){
                val intent = Intent(context, detailKomikActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)
            }
        }

    }
    public fun dataInitialize(){
        komikArrayList = arrayListOf<Komik>()

        detailimage = arrayOf(
            R.drawable.detailbadguy,
            R.drawable.detailmaybe,
            R.drawable.detailhighschool,
            R.drawable.detailmoney,
            R.drawable.detailopm,
            R.drawable.detailsf,
            R.drawable.detailticket,
            R.drawable.detailtnd,
            R.drawable.detailwb,
            R.drawable.detailweakhero,
        )

        image = arrayOf(
            R.drawable.badguy,
            R.drawable.maybe,
            R.drawable.mercenary,
            R.drawable.money,
            R.drawable.opm,
            R.drawable.spyxfamily,
            R.drawable.tickethero,
            R.drawable.tnd,
            R.drawable.wb,
            R.drawable.weakhero,
        )

        title = arrayOf(
            "Bad Guy",
            "Maybe Meant to Be",
            "High School Soldier",
            "Money and The Power",
            "One Punch Man",
            "Spy X Family",
            "Ticket Hero",
            "To Not Die (S2)",
            "Wind Breaker",
            "Weak Hero",
        )

        description = arrayOf(
            "Sepuluh tahun berusaha untuk menjadi tipe ideal cewek yang disukai karena dia suka cowok yang baik hati. Tapi, Kok dia mendadak bilang suka seorang Bad Boy...?! Mulai hari ini aku... terlahir kembali menjadi Bad boy!",
            "Han Jiah (pengangguran) yang tahun ini berusia 32 tahun, hari ini juga menderita karena masih belum menikah dan bekerja. Tiba-tiba Jim Minchul, sahabat kecil Jiah muncul dan mereka memutuskan untuk menikah!?? Ternyata mereka berdua malah lebih cocok dari yang diperkirakan?!",
            "Yoo Leejin, satu-satunya orang yang hidup dari kecelakaan pesawat terbang, harus bekerja sebagai tentara bayaran selama 10 tahun. Tapi akhirnya dia kembali ke tempat asalnya dan memulai kehidupan baru sabagai anak SMA biasa. Apakah dia bisa bersekolah dengan normal?",
            "Aku akan menghancurkan peraturan sekolah yang buruk ini!",
            "orang yang berpenampilan rata-rata ini tidak memiliki masalah yang biasa-biasa saja… Dia sebenarnya adalah pahlawan super yang mencari lawan tangguh! Masalahnya adalah, setiap kali dia menemukan kandidat yang menjanjikan, dia mengalahkan mereka dalam satu pukulan",
            "Mata-mata master Twilight tidak tertandingi dalam hal penyamaran dalam misi berbahaya demi kemajuan dunia. Tetapi ketika dia menerima tugas terakhir—untuk menikah dan memiliki anak—dia mungkin akhirnya berada di atas kepalanya! Tidak seorang pun bergantung pada orang lain",
            "Siswa yang lemah ini berubah menjadi kuat dengan cara meminjamkan kekuatan dari para arwah orang kuat yang sudah mati!",
            "Im Dajoon, adalah seorang siswa SMA yang terus-menerus diganggu di sekolah. Tepat sebelum dirinya menyerah pada kehidupan, dia melihat berita wawancara seorang siswa yang membunuh teman sekelasnya di TV, yang membuat dirinya termotivasi untuk balas dendam",
            "Jahyun, seorang murid teladan di sekolah yang senang bersepeda sendirian. Namun, karena kemampuannya yang hebat dalam bersepeda, ia terus berhadapan dengan crew sepeda di sekitarnya. Drama jalanan tentang remaja-remaja yang memimpikan kebebasan!",
            "Pahlawan lemah yang paling kuat!",

        )

        chapter = arrayOf(
            2,
            5,
            4,
            3,
            6,
            4,
            3,
            5,
            5,
            2,
        )

        rate = arrayOf(
            "9,71 rate",
            "9,84 rate",
            "9,90 rate",
            "9,84 rate",
            "9,91 rate",
            "9,90 rate",
            "9,77 rate",
            "9,82 rate",
            "9,85 rate",
            "9,89 rate",
        )
        for (i in image.indices){
            val komik = Komik(image[i], title[i], description[i], detailimage[i], chapter[i],rate[i])
            komikArrayList.add(komik)
        }
    }


}