package com.example.dtodorov.swoosh.Controller

import android.os.Bundle
import com.example.dtodorov.swoosh.R
import com.example.dtodorov.swoosh.Utilities.EXTRA_LEAGUE
import com.example.dtodorov.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for a $league $skill league near you..."
    }
}
