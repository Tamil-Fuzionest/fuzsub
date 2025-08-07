// swift-tools-version:5.3
import PackageDescription

let package = Package(
   name: "SubscriptionSDKKit",
   platforms: [
     .iOS(.v14),
   ],
   products: [
      .library(name: "SubscriptionSDKKit", targets: ["SubscriptionSDKKit"])
   ],
   targets: [
      .binaryTarget(
         name: "SubscriptionSDKKit",
         url: "https://github.com/Tamil-Fuzionest/subscription_sdk/releases/download/v0.0.1/SubscriptionSDKKit.xcframework.zip",
         checksum:"bcb78b89a1c7d86b1b4bd7c00a270d72725bd86ba945e36901794660d934e3e9")
   ]
)

