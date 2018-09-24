package com.example.dtodorov.swoosh.Controller

import android.os.Bundle
import android.os.PersistableBundle
import com.example.dtodorov.swoosh.Model.Player
import com.example.dtodorov.swoosh.R
import com.example.dtodorov.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
