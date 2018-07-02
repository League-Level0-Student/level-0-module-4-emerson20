

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
	// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		for (int i = 0; i < 11; i++) {

	// 1. Get 2 numbers from the user and convert them to integer.
String two = JOptionPane.showInputDialog("Will you please list a number which to inlitten us with.");
String one = JOptionPane.showInputDialog("Please give us another number.");
int num = Integer.parseInt(two);
int tum = Integer.parseInt(one);
	// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Do you want to subtract, add, divid, or multiply these.", "Calculator", 0,JOptionPane.INFORMATION_MESSAGE, null, new String[] { "subtract", "add", "divid", "multiply" },null);

	// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if (operation==(0)) {
			subtract(num, tum);
		}
		if (operation==(1)) {
			add(num, tum);
		}
		if (operation==(2)) {
			divid(num, tum);
		}
		if (operation==(3)) {
			multiply(num, tum);
		}
		
		}
		
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int num, int tum) {
	JOptionPane.showMessageDialog(null, ""+ num +"+"+ tum +"=" +(num + tum)); 
}
	// 4. Create similar methods for subtraction, multiplication and division.
static void subtract(int num, int tum) {
	JOptionPane.showMessageDialog(null, ""+ num +"-"+ tum +"=" +(num - tum)); 
}
static void multiply(int num, int tum) {
	JOptionPane.showMessageDialog(null, ""+ num +"*"+ tum +"=" +(num * tum)); 
}
static void divid(int num, int tum) {
	JOptionPane.showMessageDialog(null, ""+ num +"/"+ tum +"=" +(num / tum)); 
}

}