buildscript {
    val kotlin_version by extra( "1.4.30")

    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")

    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}