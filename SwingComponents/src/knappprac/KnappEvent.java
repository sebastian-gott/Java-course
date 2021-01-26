package knappprac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KnappEvent extends JFrame implements ActionListener {

    private int count;

    JButton countAdd = new JButton("Add to count");
    JLabel countPlus = new JLabel("");


    public KnappEvent() {
        super("Add count at button click");
        setLayout(new FlowLayout());
        add(countAdd);
        add(countPlus);
        countAdd.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == countAdd){
            count+= 1;
            countPlus.setText(String.valueOf(count));
        }




    }
}
