package com.example.xrstarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.xr.compose.spatial.SpatialPanel
import androidx.xr.compose.spatial.rememberSpatialPanelState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // This creates a 3D spatial panel that hovers in the user's field of view
                    // when viewed on an Android XR device (e.g., Samsung Galaxy XR or Project Aura).
                    val panelState = rememberSpatialPanelState()
                    
                    SpatialPanel(
                        state = panelState,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        XrHelloWorld()
                    }
                }
            }
        }
    }
}

@Composable
fun XrHelloWorld() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Welcome to Android XR Spatial Integration!")
    }
}