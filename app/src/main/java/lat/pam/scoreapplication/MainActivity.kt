package lat.pam.scoreapplication

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import lat.pam.scoreapplication.R
import lat.pam.scoreapplication.databinding.ActivityMainBinding
import lat.pam.scoreapplication.ScoreViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: ScoreViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menggunakan Data Binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Tautkan ViewModel ke layout
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
