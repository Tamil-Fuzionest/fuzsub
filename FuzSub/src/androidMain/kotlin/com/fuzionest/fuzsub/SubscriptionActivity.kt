package com.fuzionest.fuzsub

import android.app.AlertDialog
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback

class SubscriptionActivity : ComponentActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val url = FuzSub.getUrl()
        if (url.isNullOrEmpty()) {
            finish()
            return
        }

        webView = WebView(this)
        setContentView(webView)

        webView.webViewClient = WebViewClient()
        webView.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            allowContentAccess = true
            allowFileAccess = true
            mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        }

        webView.loadUrl(url)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (webView.canGoBack()) {
                    webView.goBack()
                } else {
                    showExitConfirmation()
                }
            }
        })
    }

    private fun showExitConfirmation() {
        AlertDialog.Builder(this)
            .setTitle("Exit?")
            .setMessage("Do you want to close the subscription screen?")
            .setPositiveButton("Yes") { _, _ -> finish() }
            .setNegativeButton("Cancel", null)
            .show()
    }
}
