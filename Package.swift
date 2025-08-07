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
         url: "https://github.com/Tamil-Fuzionest/fuzsub_sdk/releases/download/0.0.1/FuzSub.xcframework.zip",
         checksum:"7bd5290662c61888d9cf5071245e24bc4b186fb5378a5357bf2067bfba1d91a6")
   ]
)

