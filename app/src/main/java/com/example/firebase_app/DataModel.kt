package com.example.firebase_app

class DataModel {

    lateinit var key:String
    lateinit var name:String
    lateinit var contact:String
    lateinit var course:String

    constructor(key: String, name: String, contact: String, course: String) {
        this.key = key
        this.name = name
        this.contact = contact
        this.course = course
    }
}
