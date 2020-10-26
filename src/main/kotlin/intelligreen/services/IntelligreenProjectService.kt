package intelligreen.services

import com.intellij.openapi.project.Project
import intelligreen.IntelligreenResourceBundle

class IntelligreenProjectService(project: Project) {

    init {
        println(IntelligreenResourceBundle.message("projectService", project.name))
    }
}
