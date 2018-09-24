package com.example.dtodorov.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.dtodorov.swoosh.Model.Player

import com.example.dtodorov.swoosh.R
import com.example.dtodorov.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBeginnerBtnClicked(view : View){
        ballerBtn.isChecked = false
        player.skill = "Beginner"
    }

    fun onBallerBtnClicked(view: View){
        beginnerBtn.isChecked = false
        player.skill= "Baller"
    }

    fun onFinishBtnClicked(view : View){
        if(player.skill != ""){
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }
    }
}
