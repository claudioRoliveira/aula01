package entities;

public class Tabuada {
	
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int Vnumero) {
		numero = Vnumero;
	}
	
	public String retTabuada(int vTabuada) {
		String tabuada = "";
		int numeracao = 0;
		while (numeracao <= vTabuada) {
			
			tabuada = tabuada + numeracao + " x " + vTabuada + " = " + (numeracao*vTabuada) + "\n";
		numeracao++;
		}
		return tabuada;
	}

}
