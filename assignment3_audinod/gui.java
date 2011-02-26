/*
 * Assignment Name: PROG24178 - Assignment 3
 * Made By: Daniel Audino
 * Due: Febuary 22, 2011 9:00 AM
 * Instructor: Peter Ross
 * Project Discription:
 * This is the Class that creates the JFrame and Sets up the panels also has
 * the button events to create calculate instnces and do the calculations.
 */
package assignment3_audinod;
//Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Create gui Class And extend from JFrame
public class gui extends JFrame {
//Setup all panels labels textfeilds and buttons
    private JPanel panel2, panel3, panel;
    private JLabel lTitle, lAppWat, lTimeUse, lInf, lDaKUse, lDaCost, lMonCost,
            lAnCost, lDaUse, label1, label2, label3, label4, space;
    private JTextField avgWat, avgHours, timeOfUse;
    private JButton calculate, reset;


    public gui() {
//create 3 panels for layout.
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 1, 1));
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 3, 1, 1));
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(5, 2, 1, 1));

// initialize all instances of labels
        lTitle = new JLabel("Usage Calculator");
        lAppWat = new JLabel("Avg Appliance Wattage");
        lTimeUse = new JLabel("Time of Use Period");
        lInf = new JLabel("1: On-Peak, 2:Mid-Peak, 3:Off-Peak");
        lDaKUse = new JLabel("Avg Daily kwH used");
        lDaCost = new JLabel("Avg Daily Cost");
        lMonCost = new JLabel("Avg Monthly Cost");
        lAnCost = new JLabel("Avg Annual Cost");
        lDaUse = new JLabel("Avg Hours of Daily use");
        label1 = new JLabel("");
        label2 = new JLabel("");
        label3 = new JLabel("");
        label4 = new JLabel("");
        space = new JLabel(" "); // use this to break the grids restrictions o_o

//initialize all instances of textfeilds
        avgWat = new JTextField(10);
        avgHours = new JTextField(10);
        timeOfUse = new JTextField(10);
      
//initiate all instances of buttons
        calculate = new JButton("Calculate");
        reset = new JButton("Rest");

        // adding the information to panel

        panel.add(lTitle);
        panel.add(space);
        panel.add(lAppWat);
        panel.add(avgWat);
        panel.add(lDaUse);
        panel.add(avgHours);
        panel2.add(lTimeUse);
        panel2.add(timeOfUse);
        panel2.add(lInf);
        panel3.add(lDaKUse);
        panel3.add(label1);// show data
        panel3.add(lDaCost);
        panel3.add(label2);// show data
        panel3.add(lMonCost);
        panel3.add(label3);// show data
        panel3.add(lAnCost);
        panel3.add(label4);// show data
        panel3.add(reset);
        panel3.add(calculate);
        add(panel);
        add(panel2);
        add(panel3);
//the button events
        reset.addActionListener(new ResetButtonListener());
        calculate.addActionListener(new CalcButtonListener());

    }
//Calculate button event
    private class CalcButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Convert textfeilds to doubles and create calculate instance pass values through
            double timeUse = Double.parseDouble(timeOfUse.getText());
            double avgWatt = Double.parseDouble(avgWat.getText());
            double avgHour = Double.parseDouble(avgHours.getText());
            calculate calcHydro = new calculate(timeUse, avgWatt, avgHour);
            //Display results
            label1.setText(String.format("%.0f", calcHydro.kwhUsed()));
            label2.setText(String.format("$%.2f", calcHydro.dailyCost()));
            label3.setText(String.format("$%.2f", calcHydro.monthlyCost()));
            label4.setText(String.format("$%.2f", calcHydro.annualCost()));



        }
    }// end CalcButtonListener

    private class ResetButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Set all feilds to null on pushing reset
            timeOfUse.setText(null);
            avgWat.setText(null);
            avgHours.setText(null);
            label1.setText(null);
            label2.setText(null);
            label3.setText(null);
            label4.setText(null);

        }
    }// end RestButtonListener
}// end gui class

