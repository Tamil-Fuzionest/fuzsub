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
         name: "FuzSub",
         url: "https://github.com/Tamil-Fuzionest/subscription_sdk/releases/download/v0.0.2/FuzSub.xcframework.zip",
         checksum:"c9bed445da004a972ab1c8ebf147982b928085ea072250630ad30745da855252")
   ]
)

