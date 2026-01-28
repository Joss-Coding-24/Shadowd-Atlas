plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.shadowdatlas.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.joss.coding.shadowd.atlas.app" 
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "0.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
}
