package com.lemzeeyyy.simpleresumeapp

import android.provider.ContactsContract
import java.io.Serializable

class InformationData : Serializable {
    private lateinit var name: String
    private lateinit var email: String
    private lateinit var contact: String
    private lateinit var address: String
    private lateinit var facebook: String
    private lateinit var linkedin: String
    private lateinit var darkMode: String

    constructor(
        name: String,
        email: String,
        contact: String,
        address: String,
        facebook: String,
        linkedin: String,
        darkMode: String
    ) {
        this.name = name
        this.email = email
        this.contact = contact
        this.address = address
        this.facebook = facebook
        this.linkedin = linkedin
        this.darkMode = darkMode
    }
    fun getName(): String {
        return name;
    }
    fun getAddress(): String {
        return address;
    }
    fun getContact(): String {
        return contact;
    }
    fun getEmail(): String {
        return email;
    }
    fun getLinkedIn(): String {
        return linkedin;
    }
    fun getFacebook(): String {
        return facebook;
    }
    fun getDarkmode(): String {
        return darkMode;
    }



    override fun toString(): String {
        return "InformationData(name='$name', email='$email', contact='$contact', address='$address', facebook='$facebook', linkedin='$linkedin')"
    }

}