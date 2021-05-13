package org.example.gui;

import org.example.db.DatabaseH;
import org.example.db.Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class MainContent extends JPanel {
    private Font bigFont = new Font("Calibri", Font.PLAIN, 20);
    private Font smallFont = new Font("Calibri", Font.PLAIN, 12);
    private DatabaseH dbHelper = new DatabaseH();

    private JLabel nameLabel = new JLabel("First name:");
    private JTextField nameTextField = new JTextField(20);
    private JLabel lastnameLabel = new JLabel("Last name:");
    private JTextField lastnameTextField = new JTextField(20);
    private JLabel departmentLabel = new JLabel("Department:");
    private JTextField departmentTextField = new JTextField(20);
    private JLabel emailLabel = new JLabel("Email:");
    private JTextField emailTextField = new JTextField(20);
    private JLabel salaryLabel = new JLabel("Salary:");
    private JTextField salaryTextField = new JTextField(20);
    private JButton addEmployeeButton = new JButton("Save employee");
    private JButton exitButton = new JButton("Exit");
    private JButton displayEmployees = new JButton("Display employees");
    private JButton clear = new JButton("Clear results");
    private JButton storeInFile = new JButton("Store results");
    private TextArea results = new TextArea();

    private final static String newline = "\n";

    public MainContent() {
        super();
        setLayout(null);

        nameLabel.setBounds(5,50,100,25);
        nameLabel.setFont(bigFont);
        add(nameLabel);

        nameTextField.setBounds(100,50,200,25);
        nameTextField.setFont(bigFont);
        add(nameTextField);

        lastnameLabel.setBounds(5,10,100,25);
        lastnameLabel.setFont(bigFont);
        add(lastnameLabel);

        lastnameTextField.setBounds(100,10,200,25);
        lastnameTextField.setFont(bigFont);
        add(lastnameTextField);

        emailLabel.setBounds(5, 90, 100, 25);
        emailLabel.setFont(bigFont);
        add(emailLabel);

        emailTextField.setBounds(100,90,200,25);
        emailTextField.setFont(bigFont);
        add(emailTextField);

        departmentLabel.setBounds(5, 130, 100, 25);
        departmentLabel.setFont(bigFont);
        add(departmentLabel);

        departmentTextField.setBounds(100,130,200,25);
        departmentTextField.setFont(bigFont);
        add(departmentTextField);



        salaryLabel.setBounds(5, 170, 100, 25);
        salaryLabel.setFont(bigFont);
        add(salaryLabel);

        salaryTextField.setBounds(100,170,200,25);
        salaryTextField.setFont(bigFont);
        add(salaryTextField);

        addEmployeeButton.setBounds(5, 210, 150, 25);
        addEmployeeButton.setFont(bigFont);
        add(addEmployeeButton);

        addEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dbHelper.addEmployee( lastnameTextField.getText(), nameTextField.getText(),  emailTextField.getText(), departmentTextField.getText(), Double.parseDouble(salaryTextField.getText()));

                } catch (SQLException err) {
                    System.out.println("Error adding employee");
                }

            }
        });

        displayEmployees.setBounds(165, 210, 180, 25 );
        displayEmployees.setFont(bigFont);
        add(displayEmployees);
        displayEmployees.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    List<Employee> employees = dbHelper.getEmployees();
                    for(Employee employee : employees) {
                        results.append(employee.getFirstName() + ", " + employee.getLastName() + newline);
                    }
                } catch (SQLException err2) {
                    System.out.println("Error getting employees");
                }
            }
        });

        clear.setBounds(350, 210, 150, 25);
        clear.setFont(bigFont);
        add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(null);
            }
        });

        results.setBounds(5, 250, 500, 200);
        results.setFont(smallFont);
        add(results);

        exitButton.setBounds(350, 400, 100, 25);
        exitButton.setFont(bigFont);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });








    }

}
