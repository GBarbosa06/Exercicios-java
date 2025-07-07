package ui.custom.button;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class CheckgameStatusButton extends JButton {

    public CheckgameStatusButton(final ActionListener actionListener){
        this.setText("Verificar jogo");
        this.addActionListener(actionListener);
    }
}
