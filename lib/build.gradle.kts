plugins {
    id(libs.plugins.android.library.get().pluginId)
    id(libs.plugins.jetbrains.kotlin.android.get().pluginId)
}

// Libs
// Configs
val major = 0
val minor = 6
val patch = 0
val myVersion by extra { "$major.$minor.$patch" }

kotlin {
    jvmToolchain(17)
}

android {
    namespace = "com.afterroot.utils"

    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = 23
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    println(getLayout().buildDirectory.get().asFile.path)
}

dependencies {
    implementation(libs.kotlin.stdLib)

    implementation(libs.androidx.appCompat)
    implementation(libs.androidx.constraintLayout)
    implementation(libs.androidx.core)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.preference)
    implementation(libs.androidx.transition)
    implementation(libs.afollestad.materialdialogs.core)
    implementation(libs.google.material)
    implementation(libs.google.gson)
    implementation(libs.timber)
}
