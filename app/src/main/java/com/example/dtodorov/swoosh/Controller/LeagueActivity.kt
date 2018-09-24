package com.example.dtodorov.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.dtodorov.swoosh.Model.Player
import com.example.dtodorov.swoosh.R
import com.example.dtodorov.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {


    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view : View){
        if(player.league != ""){
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(skillIntent)
        } else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }

    fun onWomensLeagueBtnClicked(view : View){
        coEdLeageBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        player.league = "womens"
    }
    fun onMensLeagueBtnClicked(view : View){
        womensLeagueBtn.isChecked = false
        coEdLeageBtn.isChecked = false

        player.league = "mens"
    }
    fun onCoEdLeagueBtnClicked(view : View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "co-ed"
    }

}
