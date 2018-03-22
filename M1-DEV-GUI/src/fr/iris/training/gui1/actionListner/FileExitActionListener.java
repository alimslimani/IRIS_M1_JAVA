package fr.iris.training.gui1.actionListner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileExitActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
