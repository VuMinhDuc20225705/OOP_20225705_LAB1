import javax.swing.JOptionPane;

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		input = JOptionPane.showInputDialog(null, "Input the month");
		int year;
		year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the year"));
		
		if (input.equals("January") || input.equals("Jan") || input.equals("Jan.") || input.equals("1")) {
			JOptionPane.showMessageDialog(null, "January of " + year + " has " + "31 days");
		} else if (input.equals("February") || input.equals("Feb") || input.equals("Feb.") || input.equals("2")) {
			int day = ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) ? 29 : 28;
			JOptionPane.showMessageDialog(null, "February of " + year + " has " + day + " days");
		} else if (input.equals("March") || input.equals("Mar") || input.equals("Mar.") || input.equals("3")) {
			JOptionPane.showMessageDialog(null, "March of " + year + " has " + "31 days");
		} else if (input.equals("April") || input.equals("Apr") || input.equals("Apr.") || input.equals("4")) {
			JOptionPane.showMessageDialog(null, "April of " + year + " has " + "30 days");
		} else if (input.equals("May") || input.equals("May.") || input.equals("5")) {
			JOptionPane.showMessageDialog(null, "May of " + year + " has " + "31 days");
		} else if (input.equals("June") || input.equals("Jun") || input.equals("Jun.") || input.equals("6")) {
			JOptionPane.showMessageDialog(null, "June of " + year + " has " + "30 days");
		} else if (input.equals("July") || input.equals("Jul") || input.equals("Jul.") || input.equals("7")) {
			JOptionPane.showMessageDialog(null, "July of " + year + " has " + "31 days");
		} else if (input.equals("August") || input.equals("Aug") || input.equals("Aug.") || input.equals("8")) {
			JOptionPane.showMessageDialog(null, "August of " + year + " has " + "31 days");
		} else if (input.equals("September") || input.equals("Sep") || input.equals("Sep.") || input.equals("9")) {
			JOptionPane.showMessageDialog(null, "September of " + year + " has " + "30 days");
		} else if (input.equals("October") || input.equals("Oct") || input.equals("Oct.") || input.equals("10")) {
			JOptionPane.showMessageDialog(null, "October of " + year + " has " + "31 days");
		} else if (input.equals("November") || input.equals("Nov") || input.equals("Nov.") || input.equals("11")) {
			JOptionPane.showMessageDialog(null, "November of " + year + " has " + "30 days");
		} else if (input.equals("December") || input.equals("Dec") || input.equals("Dec.") || input.equals("12")) {
			JOptionPane.showMessageDialog(null, "December of " + year + " has " + "31 days");
		} else {
			JOptionPane.showMessageDialog(null, "Invalid input");
		}
		
	}
}
