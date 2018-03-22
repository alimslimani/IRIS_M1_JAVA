package fr.iris.training.m1.gui1;

import fr.iris.training.gui1.actionListner.FileExitActionListener;
import fr.iris.training.gui1.actionListner.HelpAboutActionListener;

import javax.swing.*;

public class MyJFrame extends JFrame {

    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenu menuHelp;
    private JMenuItem jMenuItem;
    private JMenuItem jMenuItemFileNew;
    private JMenuItem jMenuItemFileExit;
    private JMenuItem jMenuItemFileHelpAbout;

    public MyJFrame() {
        super("IRIS Application");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(generateMenuBar());
    }

    private JMenuBar generateMenuBar() {
        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuHelp = new JMenu("Help");
        jMenuItemFileExit = new JMenu("Exit");
        jMenuItemFileNew = new JMenu("New");
        jMenuItemFileHelpAbout = new JMenu("About");
        jMenuItemFileExit.addActionListener(
                new FileExitActionListener()
        );
        jMenuItemFileHelpAbout.addActionListener(
                new HelpAboutActionListener(this)
        );
        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        menuFile.add(jMenuItemFileNew);
        menuFile.add(jMenuItemFileExit);
        menuHelp.add(jMenuItemFileHelpAbout);
        return menuBar;
    }
}
