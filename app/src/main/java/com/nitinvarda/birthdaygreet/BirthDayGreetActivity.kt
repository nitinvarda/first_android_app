package com.nitinvarda.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birth_day_greet.*

class BirthDayGreetActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_greet)

        val name= intent.getStringExtra(NAME_EXTRA)

        greeting.text = "Happy Birthday\n$name !"
    }
}