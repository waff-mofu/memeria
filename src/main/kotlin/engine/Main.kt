package engine

import engine.panel.MainPanel
import javax.swing.JFrame

fun main() {
    
    val panel = MainPanel()

    val frame = JFrame("memeria").apply {
        add(panel)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
        isResizable = false
        pack()
    }
    frame.setLocationRelativeTo(null)
}