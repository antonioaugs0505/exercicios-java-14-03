import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {


		
		String valorNum1 = JOptionPane.showInputDialog("Digite o numero 1 :");
		int num1 = Integer.valueOf(valorNum1);
		
		String valorNum2 = JOptionPane.showInputDialog("Digite o numero 2 :");
		int num2 = Integer.valueOf(valorNum2);
		
		double media = (num1 + num2) / 2.0;
		
		JOptionPane.showMessageDialog(null, media );
		
	}

}
