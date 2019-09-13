object Config {
    const val version = "6.0.1-SNAPSHOT"
    val submodules = listOf("auth", "auth-github", "common", "firestore", "database", "storage")

    private const val kotlinVersion = "1.3.10"

    object SdkVersions {
        const val compile = 28
        const val target = 28
        const val min = 16
    }

    object Plugins {
        const val android = "com.android.tools.build:gradle:3.5.0"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val google = "com.google.gms:google-services:4.3.1"

        const val bintray = "com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4"
        const val buildInfo = "org.jfrog.buildinfo:build-info-extractor-gradle:4.7.5"
    }

    object Libs {
        object Kotlin {
            const val jvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
        }

        object Androidx {
            const val appCompat = "androidx.appcompat:appcompat:1.1.0"
            const val annotations = "androidx.annotation:annotation:1.1.0"
            const val customTabs = "androidx.browser:browser:1.0.0"
            const val cardView = "androidx.cardview:cardview:1.0.0"
            const val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
            const val legacySupportv4 = "androidx.legacy:legacy-support-v4:1.0.0"
            const val multidex = "androidx.multidex:multidex:2.0.1"
            const val recyclerView = "androidx.recyclerview:recyclerview:1.0.0"

            const val design = "com.google.android.material:material:1.0.0"
        }

        object Arch {
            private const val version = "1.1.1"

            const val runtime = "android.arch.lifecycle:runtime:$version"
            const val viewModel = "android.arch.lifecycle:viewmodel:$version"
            const val extensions = "android.arch.lifecycle:extensions:$version"
            const val compiler = "android.arch.lifecycle:compiler:$version"

            const val paging = "android.arch.paging:runtime:1.0.1"

            const val coreTesting = "android.arch.core:core-testing:1.1.1"
        }

        object Firebase {
            const val auth = "com.google.firebase:firebase-auth:19.0.0"
            const val core = "com.google.firebase:firebase-core:17.2.0"
            const val database = "com.google.firebase:firebase-database:19.1.0"
            const val firestore = "com.google.firebase:firebase-firestore:21.1.0"
            const val storage = "com.google.firebase:firebase-storage:19.0.1"
        }

        object PlayServices {
            const val auth = "com.google.android.gms:play-services-auth:17.0.0"
        }


        object Provider {
            const val facebook = "com.facebook.android:facebook-login:4.38.1"
            // WARNING: the Twitter requires Java 8 support. Therefore, the dep cannot be upgraded
            // futher until we decide to force clients to enable Java 8 support.
            const val twitter = "com.twitter.sdk.android:twitter-core:3.1.1@aar"
        }

        object Misc {
            private const val retrofitVersion = "2.4.0"
            private const val leakCanaryVersion = "1.6.1"
            private const val glideVersion = "4.8.0"
            private const val butterVersion = "10.1.0"

            const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
            const val retrofitGson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"

            const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$leakCanaryVersion"
            const val leakCanaryFragments =
                    "com.squareup.leakcanary:leakcanary-support-fragment:$leakCanaryVersion"
            const val leakCanaryNoop =
                    "com.squareup.leakcanary:leakcanary-android-no-op:$leakCanaryVersion"

            const val glide = "com.github.bumptech.glide:glide:$glideVersion"
            const val glideCompiler = "com.github.bumptech.glide:compiler:$glideVersion"

            const val butterKnife = "com.jakewharton:butterknife:$butterVersion"
            const val butterKnifeCompiler = "com.jakewharton:butterknife-compiler:$butterVersion"

            const val permissions = "pub.devrel:easypermissions:3.0.0"
            const val materialProgress = "me.zhanghai.android.materialprogressbar:library:1.6.1"
        }

        object Test {
            const val junit = "junit:junit:4.12"
            const val junitExt = "androidx.test.ext:junit:1.1.1"
            const val truth = "com.google.truth:truth:0.42"
            const val mockito = "org.mockito:mockito-android:2.21.0"
            const val robolectric = "org.robolectric:robolectric:4.0.2"

            const val core = "androidx.test:core:1.2.0"
            const val runner = "androidx.test:runner:1.2.0"
            const val rules = "androidx.test:rules:1.2.0"
        }

        object Lint {
            private const val version = "26.5.0"

            const val api = "com.android.tools.lint:lint-api:$version"
            const val tests = "com.android.tools.lint:lint-tests:$version"
        }
    }
}
