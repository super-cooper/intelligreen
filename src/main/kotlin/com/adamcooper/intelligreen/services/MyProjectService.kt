package com.adamcooper.intelligreen.services

import com.intellij.openapi.project.Project
import com.adamcooper.intelligreen.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
