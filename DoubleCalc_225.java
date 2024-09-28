import javax.swing.JOptionPane;
import java.lang.Math;

public class DoubleCalc_225 {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String error = "Invalid divisor";
		
		strNum1 = JOptionPane.showInputDialog(
					null, 
					"Please input the first double: ",
					"Input the first double", 
					JOptionPane.INFORMATION_MESSAGE);
			
		strNum2 = JOptionPane.showInputDialog(
					null, 
					"Please input the second double: ",
					"Input the second double", 
					JOptionPane.INFORMATION_MESSAGE);
		
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		double sum = num1 + num2;
		double diff = Math.abs(num1 - num2);
		double prod = num1 * num2;
		double quot = 0;
		
		
		
		System.out.println("Sum of two doubles: " + sum);
		System.out.println("Difference of two doubles: " + diff);
		System.out.println("Product of two doubles: " + prod);
		if (num2 == 0) {
			System.out.println(error);
		} else {
			quot = num1 / num2;
			System.out.println("Quotient of two doubles: " + quot);
		}
		
	}
}
