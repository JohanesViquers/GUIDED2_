package com.example.data_binding_09653

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel = ViewModelProvider(owner = this).get(MainViewModel::class.java)
        DataBindingUtil.setContentView<ActivityMainBinding>(
            activity: this,R.layout.activity.main
        ).apply{ this:ActivityMainBinding!
        this.lifecycleowner = this@MainActivity
        this.viewmodel = mainViewModel}
    }

    mainViewModel.editTextContext.observer(owner.this) {it:string!
    Toast.makeText(context:this, it, Toast.LENGTH_SHORT).show()}
}