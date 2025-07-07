package ui.custom.panel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SudokuSector extends JPanel{

    public SudokuSector () {
        var dimension = new Dimension(170, 170);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setBorder(new LineBorder(Color.black, 2, true));
        this.setVisible(true);
    }

}
