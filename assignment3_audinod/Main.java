/*
 * Assignment Name: PROG24178 - Assignment 3
 * Made By: Daniel Audino
 * Due: Febuary 22, 2011 9:00 AM
 * Instructor: Peter Ross
 * Project Discription:
 * This is the main method that creates the JFrame sets layout size and closing.
 *
 */
package assignment3_audinod;

import java.awt.*;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Create a intance of gui set the layout of the frame, title, size, close operation, and make visable.
        gui window = new gui();
        window.setLayout(new GridLayout(3,1,1,1));
        window.setTitle("Usage Calculator");
        window.setSize(700, 550);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
