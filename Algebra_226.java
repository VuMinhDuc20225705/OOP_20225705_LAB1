import java.util.Scanner;

public class Algebra_226 {
	// Solving ax + b = 0
	static void linear(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("There are infinite solutions.");
		} else if (a == 0 && b != 0){
			System.out.println("There are no solutions.");
		} else {
			double x = -b / a;
			System.out.println("Solution: x = " + x);
		}
	}
	
	// Solving ax^2 + bx + c = 0
	static void poly(int a, int b, int c) {
		double d = b*b - 4*a*c;
		double x, x1, x2;
		
		if (a == 0) {
			linear(b, c);
		} else if (d < 0){
			System.out.println("There are no solutions.");
		} else if (d == 0) {
			x = -b / (2*a);
			System.out.println("Solution: x = " + x);
		} else {
			x1 = (-b + Math.sqrt(d)) / (2*a);
			x2 = (-b - Math.sqrt(d)) / (2*a);
			System.out.println("Solutions: x1 = " + x1 + " and " + "x2 = " + x2);
		}
	}
	
	// Solving 2-variable linear system
	//     a11*x1 + a12*x2 = b1
	//     a21*x1 + a22*x2 = b2
	static void system(int a11, int a12, int b1, int a21, int a22, int b2) {
		int d, dx, dy;
		double x1, x2;
		dx = b1 * a22 - a12 * b2;
		dy = a11 * b2 - a21 * b1;
		d = a11 * a22 - a12 * a21;
		
		if (d == 0 && (dx == 0 || dy == 0)) {
			System.out.println("There are no solutions.");
		} else if (d == 0 && (dx != 0 && dy != 0)) {
			System.out.println("There are infinite solutions.");
		} else {
			x1 = dx / d;
			x2 = dy / d;
			System.out.println("Solutions: x1 = " + x1 + " and " + "x2 = " + x2);
		}
	}
	public static void main(String[] args) {
		Scanner mode = new Scanner(System.in);
		System.out.println("Choose your mode (1 = linear equation; 2 = 2x2 system; 3 = quadratic equation): ");
		int m = mode.nextInt();
		int[] arr = new int[6];
		switch(m) {
		case 1:
			for (int i = 0; i < 2; i++) {
				System.out.println("Enter your parameters in the order a to b (ax + b = 0)");
				Scanner num = new Scanner(System.in);
				int k = num.nextInt();
				arr[i] = k;
			}
			linear(arr[0], arr[1]);
		}
	}
}	
		

