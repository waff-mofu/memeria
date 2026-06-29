package engine

import java.awt.Dimension
import javax.swing.JPanel

class MainPanel : JPanel() {
    init{
        preferredSize = Dimension(480,360)
        isFocusable = true//検証が必要
        isDoubleBuffered = true//検証が必要
    }
}
