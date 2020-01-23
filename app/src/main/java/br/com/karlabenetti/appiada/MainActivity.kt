package br.com.karlabenetti.appiada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showJoker()

        btTellJoker.setOnClickListener {
            showJoker()
        }
    }

    private fun showJoker(){
        val jokers = resources.getStringArray(R.array.jokers)
        val index = Random().nextInt(jokers.size)
        tvJoker.text = jokers[index]
    }
}
