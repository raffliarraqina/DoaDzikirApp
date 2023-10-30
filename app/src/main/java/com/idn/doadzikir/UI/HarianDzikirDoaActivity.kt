package com.idn.doadzikir.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.doadzikir.R
import com.idn.doadzikir.adapter.DoadanDzikirAdapter
import com.idn.doadzikir.databinding.ActivityHarianDzikirDoaBinding
import com.idn.doadzikir.databinding.ActivityQauliyahShalatBinding
import com.idn.doadzikir.model.DoadanDzikirItem

class HarianDzikirDoaActivity : AppCompatActivity() {

    private var _binding : ActivityHarianDzikirDoaBinding? = null
    private val binding get() = _binding as ActivityHarianDzikirDoaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivityHarianDzikirDoaBinding.inflate(layoutInflater)

        setContentView(binding.root)

        providingDzikirData()
        initView()
    }

    private fun initView() {
        val mAdapter = DoadanDzikirAdapter()
        mAdapter.setData(providingDzikirData())
        binding.rvDzikirDoaHarian.adapter = mAdapter
        binding.rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this)
    }

    private fun providingDzikirData() : List<DoadanDzikirItem> {
        val judulDoa = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val isiDoa = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemahDoa = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        val listData = arrayListOf<DoadanDzikirItem>()
        for (i in judulDoa.indices) {
            val data = DoadanDzikirItem(
                judulDoa[i],
                isiDoa[i],
                terjemahDoa[i]
            )
            listData.add(data)
        }
        return listData
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        finish()
        return super.onSupportNavigateUp()
    }

}