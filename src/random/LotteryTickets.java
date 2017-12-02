package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTickets {
public static void main(String[] args) {
	
	int number1 = 0;
	 
	int number2 = 0;
	
	int number3 = 0;
	
	int number4 = 0;
	
	int number5 = 0;
	
	int numberPower = 0;
	
	
	for(int i = 0;i<5;i++) {
		Random gen = new Random();
		
		 number1 = gen.nextInt(69)+1;
		 
		 number2 = gen.nextInt(69)+1;
		
		 number3 = gen.nextInt(69)+1;
		
		 number4 = gen.nextInt(69)+1;
		
		 number5 = gen.nextInt(69)+1;
		
		 numberPower = gen.nextInt(26)+1;
		
	}
	JOptionPane.showMessageDialog(null, "Your number is : "+number1+" "+number2+" "+number3+" "+number4+" "+number5+" "+numberPower);
}
}
