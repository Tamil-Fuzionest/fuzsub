// swift-tools-version:5.3
import PackageDescription

let package = Package(
   name: "FuzSub",
   platforms: [
     .iOS(.v14),
   ],
   products: [
      .library(name: "FuzSub", targets: ["FuzSub"])
   ],
   targets: [
      .binaryTarget(
         name: "SubscriptionSDKKit",
         url: "https://github.com/Tamil-Fuzionest/subscription_sdk/releases/download/v0.0.1/FuzSub.xcframework.zip",
         checksum:"3d2ea7aa69c3f52cc163ff2154b808b1cb6ce5a0014ff30445ca0ae4202c5e83")
   ]
)

