package com.example.demofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.demofragment.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private val binding: MainActivityBinding by lazy {
        MainActivityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupViews()
        showOption1()
    }

    private fun setupViews() {
        binding.btnOption1.setOnClickListener { showOption1() }
        binding.btnOption2.setOnClickListener { showOption2() }
        binding.btnOption3.setOnClickListener { showOption3() }
    }

    private fun showOption1() {
        supportFragmentManager.commit {
            replace(R.id.fcDetail, Option1Fragment::class.java, null)
            addToBackStack(null)
        }
    }

    private fun showOption2() {
        supportFragmentManager.commit {
            replace(R.id.fcDetail, Option2Fragment::class.java, null)
            addToBackStack(null)
        }
    }

    private fun showOption3() {
        supportFragmentManager.commit {
            replace(R.id.fcDetail, Option3Fragment::class.java, null)
            addToBackStack(null)
        }
    }
}