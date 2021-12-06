package com.example.thebest

import android.animation.AnimatorInflater
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.animation.addListener


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun expandActivity(view: View) {
        val intent = Intent(this, ExpandActivity::class.java)
        val heart:View = findViewById(R.id.heart)
        val animator = AnimatorInflater.loadAnimator(this, R.animator.heart_anim)
        animator.setTarget(heart)
        animator.addListener({startActivity(intent)})
        animator.start()
    }
}