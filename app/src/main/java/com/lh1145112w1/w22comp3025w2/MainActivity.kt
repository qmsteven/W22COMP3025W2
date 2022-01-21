package com.lh1145112w1.w22comp3025w2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import com.google.android.material.snackbar.Snackbar
import com.lh1145112w1.w22comp3025w2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private ActivityMainBinding binding;
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toastButton.setOnClickListener {
            Toast.makeText(this, "This is a Toast", Toast.LENGTH_LONG).show()
        }

        binding.snackBarButton.setOnClickListener {
            Snackbar.make(binding.layout, "Snackbar message", Snackbar.LENGTH_LONG).show()
        }

        binding.snackBarWithActionButton.setOnClickListener {
            val snackbar = Snackbar.make(binding.layout, "Should we toggle the image?", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Click Here", View.OnClickListener {
                binding.imageView.isVisible = !binding.imageView.isVisible
            })
            snackbar.show()
        }
    }
}