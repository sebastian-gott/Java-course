package org.example.gui;

import org.example.db.DatabaseH;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationMenu extends JMenuBar implements ActionListener {

    private JMenu menu_file = null;
    private JMenuItem dBconnectionItem = null;
    private JMenuItem exitItem = null;
    private JMenu menu_help = null;
    private JMenuItem option_tip = null;

    private Font bigFont = new Font("Calibri", Font.PLAIN, 18);
    private Font smallFont = new Font("Calibri", Font.PLAIN, 12);

    protected ApplicationMenu() {
        displayMenuBar();
    }

    protected void displayMenuBar() {
        UIManager.put("Menu.font", bigFont);
        UIManager.put("MenuItem.font", smallFont);

        menu_file = new JMenu("File");

        dBconnectionItem = new JMenuItem("Test database connection");
        dBconnectionItem.addActionListener(this);

        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);

        menu_file.add(dBconnectionItem);
        menu_file.add(exitItem);

        menu_help = new JMenu("Help");

        option_tip = new JMenuItem("About the app");
        option_tip.addActionListener(this);
        menu_help.add(option_tip);

        this.add(menu_file);
        this.add(menu_help);
    }

    public void actionPerformed(ActionEvent event) {
        String arg = event.getActionCommand();
        if (arg.equals("Test database connection")) {
            try {
                DatabaseH db = new DatabaseH();
                db.open();
                db.test();
                db.close();
                displayMessage("Connection tested succesfully!");
            } catch (Exception e) {
                displayMessage("Error with the connection!");
            }
        }else if (arg.equals("Exit")) {
            System.exit(0);
        }else if (arg.equals("About the application")) {
            JTextArea helptext = new JTextArea("This is the small application example\n\n- it provides the display of basic functionality\n- You are allowed to use its structure\n- and upgrade it for a higher grade");
            helptext.setEditable(false);
            helptext.setOpaque(false);
            helptext.setFont(bigFont);
            JOptionPane.showMessageDialog(this, helptext, "About the application", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void displayMessage(String message) {
        UIManager.put("OptionPane.messageFont", bigFont);
        UIManager.put("OptionPane.buttonFont", bigFont);
        JOptionPane.showMessageDialog(this, message);
    }

}
