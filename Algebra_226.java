import javax.swing.JOptionPane;

public class Algebra_226 {
	// Solving ax + b = 0
	static void linear(double a, double b) {
		if (a == 0 && b == 0) {
			JOptionPane.showMessageDialog(null, "There are infinite solutions.");
		} else if (a == 0 && b != 0) {
			JOptionPane.showMessageDialog(null, "There are no solutions.");
		} else {
			double x = -b / a;
			JOptionPane.showMessageDialog(null, "Solution: x = " + x);
		}
	}
	
	// Solving ax^2 + bx + c = 0
	static void poly(double a, double b, double c) {
		double d = b*b - 4*a*c;
		double x, x1, x2;
		
		if (a == 0) {
			linear(b, c);
		} else if (d < 0){
			JOptionPane.showMessageDialog(null, "There are no solutions.");
		} else if (d == 0) {
			x = -b / (2*a);
			JOptionPane.showMessageDialog(null, "Solution: x12 = " + x);
		} else {
			x1 = (-b + Math.sqrt(d)) / (2*a);
			x2 = (-b - Math.sqrt(d)) / (2*a);
			JOptionPane.showMessageDialog(null, "Solutions: x1 = " + x1 + " and " + "x2 = " + x2 );
		}
	}
	
	// Solving 2-variable linear system
	//     a11*x1 + a12*x2 = b1
	//     a21*x1 + a22*x2 = b2
	static void system(double a11, double a12, double b1, double a21, double a22, double b2) {
		double d, dx, dy;
		double x1, x2;
		dx = b1 * a22 - a12 * b2;
		dy = a11 * b2 - a21 * b1;
		d = a11 * a22 - a12 * a21;
		
		if (d == 0 && (dx == 0 || dy == 0)) {
			JOptionPane.showMessageDialog(null, "There are no solutions.");
		} else if (d == 0 && (dx != 0 && dy != 0)) {
			JOptionPane.showMessageDialog(null, "There are infinite solutions.");
		} else {
			x1 = dx / d;
			x2 = dy / d;
			JOptionPane.showMessageDialog(null, "Solutions: x1 = " + x1 + " and " + "x2 = " + x2 );
		}
	}
	public static void main(String[] args) {
		String initial; 
        int choice; 
        //JOptionPane.showMessageDialog(null, "Welcome to MyApplication"); 
		  
        initial = JOptionPane.showInputDialog(null, "1. Linear Equation\n2. Linear System\n3. Quadratic Equation"); 
        choice = Integer.parseInt(initial); 
        switch (choice) {
        case 1:
        	double a, b;
        	a = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a in 'ax + b = 0'"));
        	b = Double.parseDouble(JOptionPane.showInputDialog(null, "Input b in 'ax + b = 0'"));
        	linear(a, b);
        	break;
        case 2:
        	double a11, a12, b1, a21, a22, b2;
        	a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a11 in 'a11*x1 + a12*x2 = b1'"));
        	a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a12 in 'a11*x1 + a12*x2 = b1'"));
        	b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input b1 in 'a11*x1 + a12*x2 = b1'"));
        	a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a21 in 'a21*x1 + a22*x2 = b2'"));
        	a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a22 in 'a21*x1 + a22*x2 = b2'"));
        	b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input b2 in 'a21*x1 + a22*x2 = b2'"));
        	system(a11,a12,b1,a21,a22,b2);
        	break;
        case 3:
        	double x, y, z;
        	x = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a in 'ax^2 + bx + c = 0'"));
        	y = Double.parseDouble(JOptionPane.showInputDialog(null, "Input b in 'ax^2 + bx + c = 0'"));
        	z = Double.parseDouble(JOptionPane.showInputDialog(null, "Input c in 'ax^2 + bx + c = 0'"));
        	poly(x,y,z);
        }
        
	}	
}
		
		


		

