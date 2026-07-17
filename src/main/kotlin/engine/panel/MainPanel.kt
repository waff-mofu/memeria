package engine.panel

import java.awt.Dimension
import javax.swing.JPanel

class MainPanel : JPanel() {

    init{
        preferredSize = Dimension(PanelConfig.WIDTH, PanelConfig.HEIGHT)
        isFocusable = true//検証が必要
        isDoubleBuffered = true//検証が必要
    }
}