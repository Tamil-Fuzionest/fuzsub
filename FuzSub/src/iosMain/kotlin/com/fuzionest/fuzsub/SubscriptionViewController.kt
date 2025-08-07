package com.fuzionest.fuzsub

import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSURL
import platform.Foundation.NSURLRequest
import platform.UIKit.*
import platform.WebKit.WKWebView
import platform.WebKit.WKWebViewConfiguration

@OptIn(ExperimentalForeignApi::class)
class SubscriptionViewController() : UIViewController(nibName = null, bundle = null) {

    private lateinit var webView: WKWebView

    override fun viewDidLoad() {
        super.viewDidLoad()

        view.backgroundColor = UIColor.whiteColor

        val config = WKWebViewConfiguration()
        webView = WKWebView(frame = view.bounds, configuration = config)
        webView.autoresizingMask = UIViewAutoresizingFlexibleWidth or UIViewAutoresizingFlexibleHeight

        view.addSubview(webView)

        val url = FuzSub.getUrl()
        if (!url.isNullOrEmpty()) {
            val nsUrl = NSURL(string = url)
            webView.loadRequest(NSURLRequest(nsUrl))
        } else {
            println("No URL set in SubscriptionSDK")
        }
    }
}