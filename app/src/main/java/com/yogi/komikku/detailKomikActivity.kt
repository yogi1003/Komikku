package com.yogi.komikku

import Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yogi.komikku.fragment.UntukmuFragment

class detailKomikActivity : AppCompatActivity() {

    private lateinit var adapter: detailAdapter
    private lateinit var recyclerView: RecyclerView

    companion object {
        const val PERSONS_KEY = "persons"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_komik)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val komik = intent.getParcelableExtra<Komik>(UntukmuFragment.INTENT_PARCELABLE)

        val imgDetail = findViewById<ImageView>(R.id.ivPhoto)
        val nameKomik = findViewById<TextView>(R.id.tvJudul)
        val descKomik = findViewById<TextView>(R.id.tvDesc)
        val rateKomik = findViewById<TextView>(R.id.tvrate)
        val chaptKomik = findViewById<TextView>(R.id.tvEpisode)
        val imgChapt = findViewById<ImageView>(R.id.ivPhotoChapter)

        imgDetail.setImageResource(komik?.imgDetail!!)
        nameKomik.text = komik.nameKomik
        descKomik.text = komik.descKomik
        rateKomik.text = komik.rate
        chaptKomik.text = "Coming Soon"
        imgChapt.setImageResource(R.drawable.komikku)


//        recyclerView = findViewById(R.id.rv_chapter)
//        recyclerView.setHasFixedSize(true)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//
//        val persons = intent.getParcelableArrayListExtra<Person>(PERSONS_KEY)
//        recyclerView.adapter = persons?.let { detailAdapter(it) }


//
//        recyclerView = findViewById(R.id.rv_chapter)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = komikAdapter(komik.chapter)
//        val komikArrayList = (komikArrayList)
//        recyclerView = findViewById(R.id.rv_chapter)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        val persons = intent.getParcelableArrayListExtra<UntukmuFragment.Companion>(komikArrayList)
//        recyclerView.adapter = detailAdapter(persons)

                    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



}