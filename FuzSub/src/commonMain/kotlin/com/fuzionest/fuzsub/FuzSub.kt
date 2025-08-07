package com.fuzionest.fuzsub

expect object FuzSub {
    fun setUpUrl(url: String)
    fun getUrl(): String?
    fun showSubscriptionView(param: Any)
}
