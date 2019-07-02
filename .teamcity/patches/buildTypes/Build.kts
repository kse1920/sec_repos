package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.ideaInspections
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Build'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Build")) {
    check(name == "Build") {
        "Unexpected name: '$name'"
    }
    name = "BuildChange"

    expectSteps {
        maven {
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
        ideaInspections {
            pathToProject = "pom.xml"
            jvmArgs = "-Xmx512m -XX:ReservedCodeCacheSize=240m"
            targetJdkHome = "%env.JDK_18%"
        }
        script {
            scriptContent = """echo "hello""""
        }
    }
    steps {
        insert(1) {
            script {
                scriptContent = """echo "hello""""
            }
        }
        items.removeAt(3)
        check(stepsOrder == arrayListOf("RUNNER_1", "RUNNER_2", "RUNNER_3")) {
            "Unexpected build steps order: $stepsOrder"
        }
        stepsOrder = arrayListOf<String>()
    }
}
