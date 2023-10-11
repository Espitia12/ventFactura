package ventFactura;

public class procesos {
	
	public double calcularFactura(double tratam,  int dia,  double medi) {
		
		
		int cosDia = 100000;
		double valorTotal, valorTotalDias;
		
		valorTotalDias = dia*cosDia;
		
		valorTotal = tratam+medi+valorTotalDias;
		
		return valorTotal;
		
		
		

		
		
		
	}
	

}
