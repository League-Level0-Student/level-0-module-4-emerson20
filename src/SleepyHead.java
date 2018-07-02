//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * 
         */
        
          isWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
         
         isVacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "", JOptionPane.YES_NO_OPTION);
System.out.println(isWeekday);
System.out.println(isVacation);
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
if (isVacation ==0 && isWeekday==0) {
	JOptionPane.showMessageDialog(null, "Sleep in!");
}else if (isWeekday==0) {
			JOptionPane.showMessageDialog(null, "Get up lazybones!");
}else if ( isVacation==0) {
	JOptionPane.showMessageDialog(null, "Sleep in!");
}
    }
}
