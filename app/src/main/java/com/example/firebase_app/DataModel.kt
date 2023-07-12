package com.example.firebase_app

class DataModel {

    lateinit var Key:String
    lateinit var Name:String
    lateinit var Contact:String
    lateinit var Course:String

    constructor(Key: String, Name: String, Contact: String, Course: String) {
        this.Key = Key
        this.Name = Name
        this.Contact = Contact
        this.Course = Course
    }
}
