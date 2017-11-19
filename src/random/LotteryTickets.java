package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTickets {
public static void main(String[] args) {
	for(int i = 0;i<5;i++) {
		Random gen = new Random();
		int number1 = gen.nextInt(69)+1;
		int number2 = gen.nextInt(69)+1;
		int number3 = gen.nextInt(69)+1;
		int number4 = gen.nextInt(69)+1;
		int number5 = gen.nextInt(69)+1;
		int numberPower = gen.nextInt(26)+1;
	}
	JOptionPane.showMessageDialog(null, "Your number is : "number1+" "+number2+" "+number3+" "+number4+" "+number5+" "+numberPower);
}
}
