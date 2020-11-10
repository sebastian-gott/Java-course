package com.company;
import javax.swing.*;
import java.awt.*;

public class JFrameWithManyComponents extends JFrame {

    final int FRAME_WIDTH= 1920;
    final int FRAME_HEIGHT= 1080;

    public JFrameWithManyComponents() {
        super("Demo");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        JLabel heading = new JLabel("Frame with components");
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel namePrompt = new JLabel("Enter name");
        JTextField nameField = new JTextField(12);
        JButton button = new JButton("Click to cont");
        setLayout(new FlowLayout());
        add(heading);
        add(namePrompt);
        add(nameField);
        add(button);
        JFrameWithManyComponents frame = new JFrameWithManyComponents();
        frame.setVisible(true);
    }
}
