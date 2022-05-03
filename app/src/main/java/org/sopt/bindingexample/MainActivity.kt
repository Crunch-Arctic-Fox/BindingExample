package org.sopt.bindingexample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import org.sopt.bindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewModel = mainViewModel
        binding.lifecycleOwner = this
//        binding.title = "title_from_activity"
    }

    fun initButtonClick(view: View) {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
    }
}
