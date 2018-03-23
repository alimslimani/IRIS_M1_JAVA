package src.fr.iris.training.gui1.actionListner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpAboutActionListener implements ActionListener {

    private JFrame jf;

    public HelpAboutActionListener(JFrame jFrame) {
        this.jf = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
                jf, "Developped by IRIS team", "About", JOptionPane.INFORMATION_MESSAGE
        );
    }
}
