package com.github.brinxmat.intellijturtleplugin.services

import com.github.brinxmat.intellijturtleplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
