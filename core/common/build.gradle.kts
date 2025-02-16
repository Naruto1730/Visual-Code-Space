plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    namespace = "com.teixeira.vcspace.common"

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.preference)
    implementation(libs.androidx.security.crypto)

    implementation(libs.google.material)
    implementation(libs.google.gson)

    implementation(libs.common.utilcode)
    implementation(libs.termux.app.termux.shared)
    implementation(project(":core:resources"))
}
