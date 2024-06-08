plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.chat3" // Replace with your actual namespace
    compileSdk = 33 // Update to the appropriate SDK version

    defaultConfig {
        applicationId = "com.example.chat3" // Replace with your actual application ID
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
    implementation(platform("com.google.firebase:firebase-bom:31.1.1"))
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation("androidx.appcompat:appcompat:1.4.1") // Use androidx.appcompat instead of support-v7
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation("androidx.activity:activity:1.4.0")
    implementation("androidx.core:core-ktx:1.7.0")
    implementation ("com.google.firebase:firebase-database:20.0.0")
    implementation ("androidx.recyclerview:recyclerview:1.2.0")
    implementation ("com.google.android.material:material:1.9.0")
    // AndroidX Test - Instrumented testing
    androidTestImplementation ("androidx.test.ext:junit:1.1.2")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")
    androidTestImplementation ("androidx.test:core:1.3.0")
    androidTestImplementation ("androidx.test:rules:1.3.0")
    androidTestImplementation ("androidx.test:runner:1.3.0")

    implementation ("com.google.firebase:firebase-database")

}

apply(plugin = "com.google.gms.google-services")
