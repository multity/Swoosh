package com.example.dtodorov.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.dtodorov.swoosh.Utilities.EXTRA_LEAGUE
import com.example.dtodorov.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view : View){
        if(selectedLeague != ""){
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillIntent)
        } else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }

    fun onWomensLeagueBtnClicked(view : View){
        coEdLeageBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        selectedLeague = "womens"
    }
    fun onMensLeagueBtnClicked(view : View){
        womensLeagueBtn.isChecked = false
        coEdLeageBtn.isChecked = false

        selectedLeague = "mens"
    }
    fun onCoEdLeagueBtnClicked(view : View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = "co-ed"
    }

}
