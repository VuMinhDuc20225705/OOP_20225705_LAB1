import javax.swing.JOptionPane;

public class AddMatrix_66 {
	public static void main(String[] args) {
		int[][] mat1 = new int[99][99];
		int[][] mat2 = new int[99][99];
		int[][] mat3 = new int[99][99];
		
		String dim11 = JOptionPane.showInputDialog("Enter dimension 1 of 1st matrix");
		String dim12 = JOptionPane.showInputDialog("Enter dimension 2 of 1st matrix");
		String dim21 = JOptionPane.showInputDialog("Enter dimension 1 of 2nd matrix");
		String dim22 = JOptionPane.showInputDialog("Enter dimension 2 of 2nd matrix");
		
		int d11 = Integer.parseInt(dim11);
		int d12 = Integer.parseInt(dim12);
		int d21 = Integer.parseInt(dim21);
		int d22 = Integer.parseInt(dim22);
		
		if (d11 != d21 || d12 != d22) {
			JOptionPane.showMessageDialog(null, "Invalid matrix dimensions!");
		} else {

			for (int i=0; i<d11; i++) {
				for (int j=0; j<d12; j++) {
					String num = JOptionPane.showInputDialog("Enter position (" + i + ";" + j + ") of first matrix:" );
					int n = Integer.parseInt(num);
					mat1[i][j] = n;
				}
			}
			
			for (int i=0; i<d21; i++) {
				for (int j=0; j<d22; j++) {
					String num = JOptionPane.showInputDialog("Enter position (" + i + ";" + j + ") of second matrix:" );
					int n = Integer.parseInt(num);
					mat2[i][j] = n;
				}
			}
			System.out.println("Sum of the matrices:");
			for (int i=0; i<d11; i++) {
				for (int j=0; j<d12; j++) {
					mat3[i][j]= mat2[i][j] + mat1[i][j];
					System.out.print(mat3[i][j] + " ");
				}
				System.out.print("\n");
			}
		}
		
	}
}
