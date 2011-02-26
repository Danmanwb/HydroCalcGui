/*
 * Assignment Name: PROG24178 - Assignment 3
 * Made By: Daniel Audino
 * Due: Febuary 22, 2011 9:00 AM
 * Instructor: Peter Ross
 * Project Discription:
 * This is the class that dose all the calculations for the project.
 */
package assignment3_audinod;
//The two constructors
public class calculate {

    private double hours, wattage, timeOfUse;

    public calculate() {

        timeOfUse = 0;
        wattage = 0;
        hours = 0.0;

    }

    public calculate(double timeou, double wat, double hour) {
        timeOfUse = timeou;
        wattage = wat;
        hours = hour;
        //Call on timeUseage method to get the price depending on number
        timeUseage();

    }
//All Getters and setters
    public double getTimeOfUse() {
        return timeOfUse;
    }

    public void setTimeOfUse(double timeOfUse) {
        this.timeOfUse = timeOfUse;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //Put in price depending on what number chosen for time of day.
    public void timeUseage() {
        if (timeOfUse == 1) {
            timeOfUse = 9.9;
        } else if (timeOfUse == 2) {
            timeOfUse = 8.1;
        } else {
            timeOfUse = 5.1;
        }

    }
//calculate daily KW Used
    public double kwhUsed() {

        double avgUsed = hours * wattage;
        return avgUsed;


    }
//Calculate and return Daily cost
    public double dailyCost() {

        double cost = ((hours * wattage) * timeOfUse) / 100;
        return cost;


    }
//Calculate and return monthly cost
    public double monthlyCost() {

        double cost = hours * wattage * timeOfUse / 100 * 30;
        return cost;


    }
//Calculate and return Annuel cost
    public double annualCost() {

        double cost = hours * wattage * timeOfUse / 100 * 365;
        return cost;


    }
}
