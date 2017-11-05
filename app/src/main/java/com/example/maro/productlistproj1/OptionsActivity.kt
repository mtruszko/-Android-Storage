package com.example.maro.productlistproj1

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class OptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)
    }

    fun saveString(key: String, value: String) {
        val sharedPrefs = getSharedPreferences("App", Context.MODE_PRIVATE)
        val editor = sharedPrefs.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun getString(key: String): String {
        val sharedPrefs = getSharedPreferences("App", Context.MODE_PRIVATE)
        return sharedPrefs.getString(key, "")
    }

    fun saveString2(key: String, value: String) =
            getSharedPreferences("App", Context.MODE_PRIVATE)
                    .edit()
                    .putString(key, value)
                    .apply()

    fun getString2(key: String): String? =
            getSharedPreferences("App", Context.MODE_PRIVATE)
                    .getString(key, null)
}
