package intelligreen.extensions.toolwindow

import com.intellij.ide.BrowserUtil
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JPanel

class IntelligreenToolWindow {
    private var submitPatch: JButton? = null
    private var mainPanel: JPanel? = null

    init {
        this.submitPatch?.addActionListener {
            BrowserUtil.browse("https://evergreen.mongodb.com")
        }
    }

    fun getContent(): JComponent? {
        return this.mainPanel
    }
}
