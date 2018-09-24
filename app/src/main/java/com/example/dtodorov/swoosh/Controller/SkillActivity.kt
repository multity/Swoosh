package com.example.dtodorov.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.dtodorov.swoosh.Utilities.EXTRA_LEAGUE
import com.example.dtodorov.swoosh.R
import com.example.dtodorov.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerBtnClicked(view : View){
        ballerBtn.isChecked = false
        skill = "Beginner"
    }

    fun onBallerBtnClicked(view: View){
        beginnerBtn.isChecked = false
        skill = "Baller"
    }

    fun onFinishBtnClicked(view : View){
        if(skill != ""){
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }
    }
}
