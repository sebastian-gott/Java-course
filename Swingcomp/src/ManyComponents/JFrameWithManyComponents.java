package ManyComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameWithManyComponents extends JFrame {

    final int HEIGHT = 800;
    final int WIDTH = 500;

    Font bigFont = new Font("Arial", Font.BOLD, 55);
    Font smallFont = new Font("Arial", Font.PLAIN, 35);

    public JFrameWithManyComponents() {
        super("Demo");
        setSize(HEIGHT, WIDTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel heading = new JLabel("This frame many comops");
        heading.setFont(bigFont);

        JLabel namePrompt = new JLabel("Enter name: ");
        namePrompt.setFont(smallFont);

        JTextField nameField = new JTextField(12);
        nameField.setFont(smallFont);

        JButton button = new JButton("Click");
        button.setFont(smallFont);

        JButton exitButton = new JButton("Exit");
        button.setFont(smallFont);

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        add(heading);
        add(namePrompt);
        add(nameField);
        add(button);
        add(exitButton);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

}
