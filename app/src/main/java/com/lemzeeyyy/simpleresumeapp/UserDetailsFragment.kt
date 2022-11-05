package com.lemzeeyyy.simpleresumeapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class UserDetailsFragment : Fragment() {

    lateinit var infoData : InformationData
    lateinit var mode : String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         infoData = arguments?.getSerializable("data") as InformationData

        if (infoData.getDarkmode().equals("Dark Mode")) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var name: TextView
        lateinit var nameString: String
        name = view.findViewById(R.id.username_text);
        nameString = infoData.getName();
        name.setText(nameString);

        lateinit var address: TextView
        lateinit var addString: String
        address = view.findViewById(R.id.address_text);
        addString =infoData.getAddress();
        address.setText(addString)

        lateinit var contact: TextView
        lateinit var contactString: String
        contact = view.findViewById(R.id.user_contact);
        contactString = infoData.getContact()
        contact.setText(contactString)

        lateinit var email: TextView
        lateinit var emailString: String
        email = view.findViewById(R.id.user_email);
        emailString = infoData.getEmail()
        email.setText(emailString)

        lateinit var facebook: TextView
        lateinit var facebookString: String
        facebook = view.findViewById(R.id.user_facebook);
        facebookString = infoData.getFacebook()
        facebook.setText(facebookString)

        lateinit var linkedin: TextView
        lateinit var linkedinString: String
        linkedin = view.findViewById(R.id.user_linkedin);
        linkedinString = infoData.getLinkedIn()
        linkedin.setText(linkedinString)

        lateinit var about: TextView
        about = view.findViewById(R.id.about_me)
        about.setText(getString(R.string.about_me))

        lateinit var offer: TextView
        offer = view.findViewById(R.id.offer_text)
        offer.setText(getString(R.string.offer))

        lateinit var profilePic : ImageView
        profilePic = view.findViewById(R.id.profile_picture)
        profilePic.setImageResource(R.drawable.mypic)

    }

}