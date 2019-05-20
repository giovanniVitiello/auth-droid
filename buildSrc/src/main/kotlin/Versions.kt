/**
 * Find which updates are available by running
 *     `$ ./gradlew syncLibs`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val appcompat: String = "1.0.2" 

    const val constraintlayout: String = "2.0.0-alpha2" // exceed the version found: 1.1.3

    const val core_ktx: String = "1.0.2" 

    const val espresso_core: String = "3.1.1"

    const val androidx_test_runner: String = "1.1.1"

    const val com_android_tools_build_gradle: String = "3.4.1"

    const val lint_gradle: String = "26.4.1"

    const val com_facebook_android: String = "5.0.1"

    const val com_giacomoparisi_kotlin_functional_extensions: String = "1.0.0" 

    const val android_maven_gradle_plugin: String = "2.1"

    const val inline_activity_result_kotlin: String = "1.0.1" 

    const val play_services_auth: String = "16.0.1"

    const val firebase_auth: String = "17.0.0" 

    const val google_services: String = "4.2.0" 

    const val gradle_bintray_plugin: String = "1.8.4" 

    const val io_arrow_kt: String =
            "0.8.2" // No update information. Is this dependency available on jcenter or mavenCentral?

    const val rxandroid: String = "2.1.1"

    const val rxjava: String = "2.2.8" 

    const val rxkotlin: String = "2.3.0" 

    const val jmfayard_github_io_gradle_kotlin_dsl_libs_gradle_plugin: String = "0.2.6" 

    const val junit: String = "4.12"

    const val org_jetbrains_dokka: String = "0.9.18"

    const val org_jetbrains_kotlin: String = "1.3.31" 

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "5.4.1"

        const val currentVersion: String = "5.4.1"

        const val nightlyVersion: String = "5.6-20190520000026+0000"

        const val releaseCandidate: String = ""
    }
}
