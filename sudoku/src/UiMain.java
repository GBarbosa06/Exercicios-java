import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.custom.frame.MainFrame;
import ui.custom.panel.MainPanel;

public class UiMain {

    public static void main(String[] args) {
        var dimension = new Dimension(600, 600);
        JPanel mainpPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainpPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}
