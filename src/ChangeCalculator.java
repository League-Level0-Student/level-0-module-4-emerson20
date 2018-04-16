//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nick = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int dim = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
int quart = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
double teeth = nick * 5 + dim * 10 + quart * 25;
		// Tell the user how much money they have
DecimalFormat des=new DecimalFormat("0.00");

JOptionPane.showMessageDialog(null, "You have $" +des.format( teeth/ 100.00) +" in change.");
	}
}

