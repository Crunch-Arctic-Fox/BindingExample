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

    fun initClickBtn1(view: View) {
        val quantity = 1
        val text = this.resources.getQuantityString(R.plurals.member, quantity, 1)
        //                                     \_____________/  \________/  \_____________/
        //                                                |            |               |
        //                   id: used to get the plurals resource      |               |
        //             quantity: used to determine the appropriate quantity class      |
        //         formatArgs: used to positionally replace the placeholders %1, %2 and %3
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    fun initClickBtn2(view: View) {
        val text = resources.getQuantityString(R.plurals.member, 2, 2)
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
