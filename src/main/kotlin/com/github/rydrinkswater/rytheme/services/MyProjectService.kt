package com.github.rydrinkswater.rytheme.services

import com.intellij.openapi.project.Project
import com.github.rydrinkswater.rytheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
