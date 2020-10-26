package com.github.super-cooper.intelligreen.services

import com.intellij.openapi.project.Project
import com.github.super-cooper.intelligreen.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
