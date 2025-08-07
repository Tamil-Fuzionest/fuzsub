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
         url: "https://github.com/Tamil-Fuzionest/subscription_sdk/releases/download/package/SubscriptionSDKKit.xcframework.zip",
         checksum:"ebd4292ca4481d1d2459ca2b738b30c33b2b5988fff5d9d627615a70bac58e46")
   ]
)

