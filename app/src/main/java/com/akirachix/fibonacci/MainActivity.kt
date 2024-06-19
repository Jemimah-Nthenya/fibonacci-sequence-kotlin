package com.akirachix.fibonacci

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.akirachix.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val numbers = fibonacciNums(100)
        binding.rvNumber.layoutManager=GridLayoutManager(this,2)
        val numb=Numbers(numbers)
        binding.rvNumber.adapter=numb


        }
    fun  fibonacciNums(num:Int): List<Int> {
        val nums = mutableListOf(0, 1)
        while (nums.size < num) {
            nums.add(nums[nums.lastIndex] + nums[nums.lastIndex - 1])
        }
        return nums
        }
    }