pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        google()
        mavenCentral()
        maven {
            url = uri("https://www.jitpack.io" )
        }



    }
}

rootProject.name = "PutatoeAssesment!"
include(":app")
