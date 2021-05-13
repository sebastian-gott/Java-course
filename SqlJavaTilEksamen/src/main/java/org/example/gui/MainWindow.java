package org.example.gui;


import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainContent content = new MainContent();
    public ApplicationMenu appMenu = new ApplicationMenu();

    public MainWindow() {

        setTitle("Employee app");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setLayout(new GridLayout());

        setJMenuBar(appMenu);

        add(content);

        setResizable(false);
        setVisible(true);
    }
}
