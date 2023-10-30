package com.idn.doadzikir.UI.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.doadzikir.R
import com.idn.doadzikir.adapter.DoadanDzikirAdapter
import com.idn.doadzikir.databinding.ActivityDzikirPagiBinding
import com.idn.doadzikir.databinding.ActivityDzikirPetangBinding
import com.idn.doadzikir.model.DataDoaDzikir

class DzikirPetangActivity : AppCompatActivity() {

    private var _binding : ActivityDzikirPetangBinding? = null
    private val binding get() = _binding as ActivityDzikirPetangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Dzikir Petang"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivityDzikirPetangBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvDzikirPetang.apply {
            val mAdapter = DoadanDzikirAdapter()
            mAdapter.setData(DataDoaDzikir.listDzikirPetang)
            adapter = mAdapter
            layoutManager = LinearLayoutManager(applicationContext)

        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        finish()
        return super.onSupportNavigateUp()
    }

}