//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import java.io.IOException;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown – or the rocket won’t launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) {
		// 2. Use a pop-up to ask the user where to start counting from
String time = JOptionPane.showInputDialog("How long do you want the countdown to last?");
int times = Integer.parseInt(time);
		// 3. Change the countdown to use the new starting point
		
		// 1. Print a countdown from 10 to 0 on the console
for(int i = times;i >0 ;i--) {
	System.out.println(i);
	speak(i+"");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
		// 4. Use the speak method to hear the countdown.
		
		// 5. when the counting is done, speak "blastoff!"
System.out.println("blastoff");
speak("blastoff");
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


