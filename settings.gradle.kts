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
        //maven { url 'https://jitpack.io' }
        maven(url = uri("https://jitpack.io")) // Corrected line

    }
}

rootProject.name = "Falcon News"
include(":app")



