package com.lemzeeyyy.simpleresumeapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.lemzeeyyy.simpleresumeapp.InformationData
import com.lemzeeyyy.simpleresumeapp.R

class WebViewFragment : Fragment() {
    lateinit var webLink:String
    lateinit var webView:WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        webLink = arguments?.getString("weblink") as String


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webView = view.findViewById(R.id.web_view)
        webView.webViewClient = WebViewClient()
        webView.loadUrl(webLink)
    }

    }

