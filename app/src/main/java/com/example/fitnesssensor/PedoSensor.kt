package com.example.fitnesssensor

import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PedoSensor : AppCompatActivity() {

    val sensor: Sensor? = null
    val sensorManager: SensorManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedo_sensor)

        sensorManager= getSystemService()
    }
}