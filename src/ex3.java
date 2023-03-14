import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {

		String valorPeso = JOptionPane.showInputDialog("Digite o peso :");
		double peso = Double.valueOf(valorPeso);
		
		String valorAltura = JOptionPane.showInputDialog("Digite a altura :");
		double altura = Double.valueOf(valorAltura);
		
		double imc = peso / (altura * altura);
		
		JOptionPane.showMessageDialog(null, imc );
		

	};

}
