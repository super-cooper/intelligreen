package intelligreen.actions

import com.intellij.ide.BrowserUtil
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

/**
 * This class implements the SubmitPatch Evergreen button
 */
class SubmitPatch : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        BrowserUtil.browse("https://evergreen.mongodb.com")
    }
}