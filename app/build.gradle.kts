plugins {
    alias(libs.plugins.android.application)

}

android {
    namespace = "com.myproyect.gestionnovelas"
    compileSdk = 34

    defaultConfig {
        javaCompileOptions {
            annotationProcessorOptions {
                argument("room.schemaLocation", "$projectDir/schemas")
            }
        }
        applicationId = "com.myproyect.gestionnovelas"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Room para la base de datos
    implementation ("androidx.room:room-runtime:2.5.0")

    annotationProcessor ("androidx.room:room-compiler:2.5.0")
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("androidx.recyclerview:recyclerview:1.2.0")
    implementation("androidx.room:room-runtime:2.3.0")
    annotationProcessor("androidx.room:room-compiler:2.3.0")
}