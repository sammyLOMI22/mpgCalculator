import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * program to calculate a car's mpg
 */

public class mpgCalculator extends JFrame{
    private JLabel capLb;// capacity of gas tank
    private JTextField capTXB; // user can enter capacity of gas tank
    private JLabel milesDLB; // miles driven label
    private JTextField milesTXB;//user can enter miles driven
    private  JButton calcBTN; // button for calculating total
    private JPanel panel;
    private final int WINDOW_WIDTH = 600;
    private final int WINDOW_HEIGHT =90;
    //constuctor
    public mpgCalculator()
    {
        setTitle("Miles Per Gallon Calculator");
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create labels and text boxes
        capLb = new JLabel("capacity of car's gas tank");
        capTXB = new JTextField(3);
        milesDLB = new JLabel("Miles driven on last tank of gas");
        milesTXB = new JTextField(3);
        calcBTN = new JButton("Calculate");

        // add action listener
        calcBTN.addActionListener(new CalcButtonActionListener());

        //add components to panel
        panel = new JPanel();
        panel.add(capLb);
        panel.add(capTXB);
        panel.add(milesDLB);
        panel.add(milesTXB);
        panel.add(calcBTN);
        add(panel);
        setVisible(true);
    }
private class CalcButtonActionListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        //code for calculation when calc button is clicked add todo input validation at later date
        double mpg=0;
        double milesD = Double.parseDouble(milesTXB.getText());
        double cap = Double.parseDouble(capTXB.getText());
         mpg =milesD/cap;
         JOptionPane.showMessageDialog(null,"The current MPG of your last trip Is "+ mpg);
    }
}
//main method
    public static void main(String [] args){
        new mpgCalculator();
    }
}
