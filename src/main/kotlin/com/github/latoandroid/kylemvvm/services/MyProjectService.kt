package com.github.latoandroid.kylemvvm.services

import com.intellij.openapi.project.Project
import com.github.latoandroid.kylemvvm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
