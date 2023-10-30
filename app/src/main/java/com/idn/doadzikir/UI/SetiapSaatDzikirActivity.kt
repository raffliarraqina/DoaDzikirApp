package com.idn.doadzikir.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.doadzikir.R
import com.idn.doadzikir.adapter.DoadanDzikirAdapter
import com.idn.doadzikir.databinding.ActivitySetiapSaatDzikirBinding
import com.idn.doadzikir.model.DataDoaDzikir

class SetiapSaatDzikirActivity : AppCompatActivity() {

    private var _binding : ActivitySetiapSaatDzikirBinding? = null
    private val binding get() = _binding as ActivitySetiapSaatDzikirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivitySetiapSaatDzikirBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val mAdapter = DoadanDzikirAdapter()
        mAdapter.setData(DataDoaDzikir.listDzikir)
        binding.rvDzikirSetiapSaat.adapter = mAdapter
        binding.rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this)

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