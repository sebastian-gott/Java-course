package pizzatopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


class ToppingPrice {
    public String topping;
    public int price;
    ToppingPrice(String topping, int price) {
        this.topping = topping;
        this.price = price;
    }
        }

public class EventShit extends JFrame implements ActionListener {
    String[] arr = {"Jalapeno", "Ham", "Bacon", "Grounded beef", "Championing"};
    String [] arrPrices = {"2", "5", "8", "29", "4"};
    String[] arr1 = {"Small", "Medium", "Large"};
    int [] arr1Prices = {10, 20, 30};
    JLabel pizzaText = new JLabel("Choose your topping");
    JComboBox topping = new JComboBox(arr);
    JComboBox topping1 = new JComboBox(arr);
    JComboBox topping2 = new JComboBox(arr);
    JComboBox size = new JComboBox(arr1);
    JToggleButton button = new JToggleButton("Choose topping");
    JLabel toppingChosen = new JLabel("");
    JLabel toppingPrice = new JLabel("");


    public EventShit() {
        super("Pizza topping");
        setLayout(new FlowLayout());
        add(pizzaText);
        add(topping);
        add(toppingPrice);
        add(topping1);
        add(toppingPrice);
        add(topping2);
        add(toppingPrice);
        add(size);
        add(button);
        add(toppingChosen);
        button.addActionListener(this);

    }




    @Override

    public void actionPerformed(ActionEvent e) {




        String choosen = "" + topping.getItemAt(topping.getSelectedIndex());
        int choosenIndex = topping.getSelectedIndex() ;
        String choosen1 = "" + topping1.getItemAt(topping1.getSelectedIndex());
        int choosenIndex1 = topping1.getSelectedIndex() ;
        String choosen2 = "" + topping2.getItemAt(topping2.getSelectedIndex());
        int choosenIndex2 = topping2.getSelectedIndex() ;
        String cSize = "" + size.getItemAt(size.getSelectedIndex());
        int sizeIndex = size.getSelectedIndex() ;









        int sum = calculatePizzaPrice(choosenIndex, choosenIndex1, choosenIndex2, sizeIndex);





        JToggleButton btn = (JToggleButton) e.getSource();
        toppingChosen.setText(btn.isSelected() ?  "You have chosen " + choosen + " " + choosen1 + " " + choosen2 + " as your pizza topping" + " and your chosen size is "
                + cSize + " and the pizza wil cost " + sum : "" );


    }


    public int calculatePizzaPrice(int choosenIndex, int choosenIndex1, int choosenIndex2, int sizeIndex){

        int sum = 0;

        int[] choosenPrice = {5, 5, 50, 2, 100};
        int[] choosenPrice1 = {5, 5, 50, 2, 100};
        int[] choosenPrice2 = {5, 5, 50, 2, 100};
        int[] sizePrice = {10, 20, 30};

        for(int i = 0; i < choosenPrice.length; i++){
            if(i == choosenIndex){
                sum += choosenPrice[i];
            }
        }

        for(int i = 0; i < choosenPrice1.length; i++){
            if(i == choosenIndex1){
                sum += choosenPrice1[i];
            }
        }

        for(int i = 0; i < choosenPrice2.length; i++){
            if(i == choosenIndex2){
                sum += choosenPrice2[i];
            }
        }

        for(int i = 0; i < sizePrice.length; i++){
            if(i == sizeIndex){
                sum += sizePrice[i];
            }
        }
        return sum;
    }

}
