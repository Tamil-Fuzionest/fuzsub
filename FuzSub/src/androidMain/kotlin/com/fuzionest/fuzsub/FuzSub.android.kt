package com.fuzionest.fuzsub

import android.app.Activity
import android.content.Intent

actual object FuzSub {
    private var storedUrl: String? = null

    actual fun setUpUrl(url: String) {
        storedUrl = url
    }

    actual fun getUrl(): String? = storedUrl

    actual fun showSubscriptionView(param: Any) {
        if (param !is Activity) throw IllegalArgumentException("Expected an Activity")
        setUpUrl(storedUrl ?: error("URL not initialized"))
        val intent = Intent(param, SubscriptionActivity::class.java)
        param.startActivity(intent)
    }
}