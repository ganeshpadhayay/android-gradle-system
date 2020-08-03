object Versions {
    //sdk versions
    val compileSdkVersion = 30
    val buildToolsVersion = "30.0.1"
    val minSdkVersion = 21
    val targetSdkVersion = 30

    //plugin versions
    val gradle_plugin_version = "4.0.1"
    val kotlin_plugin_version = "1.3.72"

    //dependency versions
    val kotlin_version = "1.3.72"
    val core_ktx_version = "1.3.1"
    val app_compat_version = "1.1.0"
    val constraint_layout_version = "1.1.3"
    val junit_version = "4.13"
    val junit_android_test_version = "1.1.1"
    val espresso_core_version = "3.2.0"
}

object Dependencies {
    //plugins
    val gradle_plugin = "com.android.tools.build:gradle:${Versions.gradle_plugin_version}"
    val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_plugin_version}"

    //project dependencies
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx_version}"
    val app_compat = "androidx.appcompat:appcompat:${Versions.app_compat_version}"
    val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout_version}"
    val junit = "junit:junit:${Versions.junit_version}"
    val junit_android_test = "androidx.test.ext:junit:${Versions.junit_android_test_version}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core_version}"
}