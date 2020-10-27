package intelligreen.extensions.toolwindow

import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory
import com.sun.istack.NotNull

/**
 * Creates the main tool window for Intelligreen
 * TODO only make available if project has evergreen.yml
 */
class IntelligreenToolWindowFactory : ToolWindowFactory, DumbAware {
    override fun createToolWindowContent(@NotNull project: Project, @NotNull toolWindow: ToolWindow) {
        val newToolWindow = IntelligreenToolWindow()
        val contentFactor = ContentFactory.SERVICE.getInstance()
        val content = contentFactor.createContent(newToolWindow.getContent(), "", true)
        toolWindow.contentManager.addContent(content)
    }
}
