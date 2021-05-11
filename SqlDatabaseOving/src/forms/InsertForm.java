package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


import backend.Insert;
import backend.Insert.*;


public class InsertForm extends JFrame {

    JLabel description = new JLabel("Enter data for the employee");
    Font bigFont = new Font("Arial", Font.BOLD, 55);
    Font smallFont = new Font("Arial", Font.PLAIN, 30);
    JLabel firstNameLabel = new JLabel("Firstname");
    JTextField firstNameInput = new JTextField(10);
    JLabel lastNameLabel = new JLabel("Lastname");
    JTextField lastNameInput = new JTextField(10);
    JLabel emailLabel = new JLabel("Email");
    JTextField emailInput = new JTextField(10);
    JLabel departmentLabel = new JLabel("Department");
    JTextField departmentInput = new JTextField(10);
    JLabel salaryLabel = new JLabel("Salary");
    JTextField salaryInput = new JTextField(10);
    JButton insertButton = new JButton("Insert");
    JLabel errorMessage = new JLabel("");
    final int WIDTH = 500;
    final int HEIGHT = 1000;

    Insert insertEmployee = new Insert();






    public InsertForm()  {
        super("Add Employee");
        setSize(WIDTH, HEIGHT);

        description.setFont(bigFont);
        firstNameLabel.setFont(smallFont);
        lastNameLabel.setFont(smallFont);
        emailLabel.setFont(smallFont);
        departmentLabel.setFont(smallFont);
        salaryLabel.setFont(smallFont);
        insertButton.setFont(smallFont);
        errorMessage.setFont(smallFont);

        setLayout(new FlowLayout());


        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(description);
        JPanel centralPanel = new JPanel(new FlowLayout());
        centralPanel.add(firstNameLabel);
        centralPanel.add(firstNameInput);
        centralPanel.add(lastNameLabel);
        centralPanel.add(lastNameInput);
        centralPanel.add(emailLabel);
        centralPanel.add(emailInput);
        centralPanel.add(departmentLabel);
        centralPanel.add(departmentInput);
        centralPanel.add(salaryLabel);
        centralPanel.add(salaryInput);


        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)  {
                    insertEmployee.insertEmployee(lastNameInput.getText(), firstNameInput.getText(), emailInput.getText(), departmentInput.getText(), salaryInput.getText());

            }
        });
    }

}
