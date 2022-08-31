package Conversor;

import javax.swing.JOptionPane;

public class ConverterValores {
	
	
	
	public void ConversorDeRealParaDolar(double valorEmReal) {
		double valorConvertidoEmDolar = valorEmReal / 5.07;
		// deixar o valor com 2 casa decimais
		valorConvertidoEmDolar = (double) Math.round(valorConvertidoEmDolar * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é  $ " + valorConvertidoEmDolar + " Dolares");

	}
	
	public void ConversorDeRealParaEuro(double valorEmReal) {
		double valorConvertidoEmEuro = valorEmReal / 5.08;
		// deixar o valor com 2 casa decimais
		valorConvertidoEmEuro = (double) Math.round(valorConvertidoEmEuro * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é  $" + valorConvertidoEmEuro + " Euro");

	}
	
	public void ConversorDeRealParaLibra(double valorEmReal) {
		double valorConvertidoEmLibra = valorEmReal /5.92;
		// deixar o valor com 2 casa decimais
		valorConvertidoEmLibra = (double) Math.round(valorConvertidoEmLibra * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é  $ " + valorConvertidoEmLibra + " Libra");

	}
	
	public void ConversorDeRealParaDolarCanadense(double valorEmReal) {
		double valorConvertidoEmDolarCanadense = valorEmReal /3.90;
		// deixar o valor com 2 casa decimais
		valorConvertidoEmDolarCanadense = (double) Math.round(valorConvertidoEmDolarCanadense * 100) / 100;
		JOptionPane.showMessageDialog(null, "O valor convertido é  $ " + valorConvertidoEmDolarCanadense + " Dolar Canadense");

	}


}
