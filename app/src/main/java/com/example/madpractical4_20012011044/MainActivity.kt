package com.example.madpractical4_20012011044

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonBrowse = findViewById<Button>(R.id.button_browse)
        val buttonCall = findViewById<Button>(R.id.button_call)
        val buttonContact = findViewById<Button>(R.id.button_contact)
        val buttonCallLog = findViewById<Button>(R.id.button_callLog)
        val buttonGallery = findViewById<Button>(R.id.button_gallery)
        val buttonCamera = findViewById<Button>(R.id.button_camera)
        val buttonAlarm = findViewById<Button>(R.id.button_alarm)

        buttonBrowse.setOnClickListener() {
            Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://uvpce.guni.ac.in")).apply {
                startActivity(this)
            }
        }

        buttonCall.setOnClickListener() {
            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:9054697454")).apply {
                startActivity(this)
            }
        }

        buttonContact.setOnClickListener(){
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).apply {
                startActivity(this)
            }
        }

        buttonCallLog.setOnClickListener(){
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply {
                startActivity(this)
            }
        }

        buttonGallery.setOnClickListener(){
            Intent(Intent.ACTION_VIEW).setData(Uri.parse("image/*")).apply {
                startActivity(this)
            }
        }

        buttonCamera.setOnClickListener(){
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply {
                startActivity(this)
            }
        }

        buttonAlarm.setOnClickListener(){
            Intent(AlarmClock.ACTION_SHOW_ALARMS).apply {
                startActivity(this)
            }
        }
    }

}