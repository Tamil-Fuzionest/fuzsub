package com.fuzionest.fuzsub
import platform.UIKit.UIViewController

actual object FuzSub {
    private var storedUrl: String? = null

    actual fun setUpUrl(url: String) {
        storedUrl = url
    }

    actual fun getUrl(): String? = storedUrl

    @OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
    actual fun showSubscriptionView(param: Any) {
        if (param !is UIViewController) error("UIViewController required for iOS")
        setUpUrl(storedUrl ?: error("URL not initialized"))
        val vc = SubscriptionViewController()
        param.presentViewController(vc, animated = true, completion = null)
    }
}