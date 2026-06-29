package engine

import javax.swing.JFrame

fun main() {
//    val frameW :Int = 480
//    val frameH :Int = 360


    val panel = MainPanel()

    val frame = JFrame("memeria").apply {
        add(panel)
//        pack()
        setLocationRelativeTo(null)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        isVisible = true
        isResizable = false
    }
    frame.pack()
}