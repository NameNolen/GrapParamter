package com.github.namenolen.grapparamter.services

import com.github.namenolen.grapparamter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
