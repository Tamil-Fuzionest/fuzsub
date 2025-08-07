# 📦 FuzSub SDK

**FuzSub** is a lightweight Kotlin Multiplatform (KMP) SDK that lets you display a **subscription WebView screen** in both **Android** and **iOS (Swift)** apps using a single shared API.

---

## 🚀 Features

* Unified API for both Android & iOS
* Built with Kotlin Multiplatform
* Minimal integration steps
* Native WebView support
* Ideal for hosted payment, onboarding, or subscription screens

---

## 📲 Integration Guide

### 🟢 Android Integration

1. **Add FuzSub SDK to your project**

If it's included as a module:

```kotlin
dependencies {
    implementation(project(":FuzSub"))
}
```

If distributed via Maven (optional):

```kotlin
dependencies {
    implementation("com.fuzionest:fuzsub:<latest-version>")
}
```

2. **Usage in your `Activity`**

```kotlin
import com.fuzionest.fuzsub.FuzSub

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up the URL
        FuzSub.setUpUrl("https://your-subscription-url.com")

        // Show the subscription screen
        FuzSub.showSubscriptionView(this)
    }
}
```

> ⚠️ Make sure to call `setUpUrl(...)` before showing the screen.

---

### 🍎 iOS (Swift) Integration

1. **Add FuzSub via Swift Package Manager or XCFramework**

If using `.xcframework` manually:

* Run:

  ```bash
  ./gradlew :FuzSub:assembleXCFramework
  ```
* Drag the generated `.xcframework` into your Xcode project.

2. **Usage in SwiftUI**

```swift
import SwiftUI
import FuzSub

struct ContentView: View {
    
    init() {
        FuzSub.shared.setUpUrl(url: "https://your-subscription-url.com")
    }
    
    var body: some View {
        Button("Open Subscription View") {
            if let rootVC = UIApplication.shared.connectedScenes
                .compactMap({ $0 as? UIWindowScene })
                .flatMap({ $0.windows })
                .first(where: { $0.isKeyWindow })?.rootViewController {
                
                FuzSub.shared.showSubscriptionView(param: rootVC)
            }
        }
    }
}
```

> 📌 `param:` must be a `UIViewController`. Use the above snippet to extract it from SwiftUI.

---

## 📘 API Reference

| Method                             | Description                                                                                  |
| ---------------------------------- | -------------------------------------------------------------------------------------------- |
| `setUpUrl(url: String)`            | Sets the subscription WebView URL. Call this before displaying the view.                     |
| `showSubscriptionView(param: Any)` | Displays the subscription screen. Requires `Activity` (Android) or `UIViewController` (iOS). |
| `getUrl(): String?`                | Returns the URL previously set (optional helper).                                            |

---

## 📋 Requirements

| Platform | Minimum Version      |
| -------- | -------------------- |
| Android  | API 26 (Android 8.0) |
| iOS      | iOS 13.0             |
| Kotlin   | 1.9+                 |
| Swift    | 5.3+                 |

---

## ❓ Support

Need help integrating the SDK or building the `.xcframework`?

📧 [tamilarasu@fuzionest.com](mailto:tamilarasu@fuzionest.com)
📞 +91 96775 45696

---

## 🛡 License

MIT License © 2025 Fuzionest Pvt Ltd
