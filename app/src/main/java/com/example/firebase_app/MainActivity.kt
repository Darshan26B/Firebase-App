package com.example.firebase_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebase_app.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    lateinit var ref :DatabaseReference
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ref  = FirebaseDatabase.getInstance().reference

        binding.btnadd.setOnClickListener {
            var Name = binding.Name.text.toString()
            var Contact = binding.Contact.text.toString()
            var Course = binding.Course.text.toString()
            var Key = ref.root.push().key


            var data = DataModel(Key!!,Name, Contact, Course)


            ref.root.child("User").child(Key).setValue(data)
        }
    }
}