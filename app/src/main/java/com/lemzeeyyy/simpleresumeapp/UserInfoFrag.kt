package com.lemzeeyyy.simpleresumeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class UserInfoFrag : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var infoData : InformationData

        lateinit var name: EditText
        lateinit var nameString: String
        name = view.findViewById(R.id.form_personal_et_name);
         nameString = name.text.toString();

        lateinit var address: EditText
        lateinit var addString: String
        address = view.findViewById(R.id.form_personal_et_address);
        addString = address.text.toString();

        lateinit var contact: EditText
        lateinit var contactString: String
        contact = view.findViewById(R.id.form_personal_et_contact);
        contactString = contact.text.toString();

        lateinit var email: EditText
        lateinit var emailString: String
        email = view.findViewById(R.id.form_personal_et_email);
        emailString = email.text.toString();

        lateinit var facebook: EditText
        lateinit var facebookString: String
        facebook = view.findViewById(R.id.form_personal_et_facebook);
        facebookString = facebook.text.toString();

        lateinit var linkedin: EditText
        lateinit var linkedinString: String
        linkedin = view.findViewById(R.id.form_personal_et_linkedin);
        linkedinString = linkedin.text.toString();

        lateinit var saveBtn: Button
        saveBtn = view.findViewById(R.id.form_personal_btn_save);
        saveBtn.setOnClickListener{
            infoData = InformationData(nameString,emailString,contactString,addString,facebookString,linkedinString);
            val bundle = Bundle()
            bundle.putSerializable("data", infoData)
            val userDetailsFragment = UserDetailsFragment()
            userDetailsFragment.arguments = bundle
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_view, userDetailsFragment)
                addToBackStack("back")
                commit()
            }
        }










        }
    }
