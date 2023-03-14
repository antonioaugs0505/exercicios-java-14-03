import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		
		String valorBase = JOptionPane.showInputDialog("Digite o valor da base :");
		double base = Double.valueOf(valorBase);
		
		String valorLado1 = JOptionPane.showInputDialog("Digite o valor do lado 1 :");
		double lado1 = Double.valueOf(valorLado1);
		
		String valorLado2 = JOptionPane.showInputDialog("Digite o valor do lado 2 :");
		double lado2 = Double.valueOf(valorLado2);
		
		String valorAltura = JOptionPane.showInputDialog("Digite o valor da altura :");
		double altura = Double.valueOf(valorAltura);
		
		if (lado1 == lado2) {
			double area = (base * altura)/2;
			JOptionPane.showMessageDialog(null, "A area é: " + area);
		
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Esse triangulo não é isoceles ");
		}
		
	
	}

}
