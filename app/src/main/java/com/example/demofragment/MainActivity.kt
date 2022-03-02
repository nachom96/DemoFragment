package com.example.demofragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.demofragment.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private val binding: MainActivityBinding by lazy {
        MainActivityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupViews()
        if (savedInstanceState == null) {
            showOption(1)
        }
    }

    private fun setupViews() {
        binding.btnOption1.setOnClickListener { showOption(1) }
        binding.btnOption2.setOnClickListener { showOption(2) }
        binding.btnOption3.setOnClickListener { showOption(3) }
    }

    private fun showOption(option: Int) {
        supportFragmentManager.commit {
            replace<OptionFragment>(R.id.fcDetail, args = OptionFragment.newArguments(option))
            addToBackStack("")
        }
    }

}
