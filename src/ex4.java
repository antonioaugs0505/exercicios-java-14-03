import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		
		String valorNum= JOptionPane.showInputDialog("Digite um numero :");
		double num = Double.valueOf(valorNum);
		
		

		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "É par");
		
		}
		
		else {
			JOptionPane.showMessageDialog(null, "É impar");
		}
		
	
	}

}
