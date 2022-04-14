/*pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

얘네 왜 다 없애도 될까

*/
rootProject.name = "MultiModule_Study"
include(":app")
include(":data")
include(":domain")
