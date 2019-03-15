package com.example.kotlin_tutorial.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kotlin_tutorial.Utilities.EXTRA_PLAYER
import com.example.kotlin_tutorial.Model.Player
import com.example.kotlin_tutorial.R
import kotlinx.android.synthetic.main.activity_finish.*

/**
 * Created by vamse on 3/14/2019.
 */
class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}