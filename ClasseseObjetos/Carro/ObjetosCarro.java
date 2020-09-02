package ClassesEObjetos;

public class ObjetosCarro {
	public static void main(String[] args) {
		Carro c1 = new Carro("Preto", "Uno", "Fiat", 200, "02/2002");
		
		c1.getStatus();
		Carro c2 = new Carro("Vermelho", "Uno", "Fiat", 200, "05/2002");
		c2.getStatus();
		Carro c3 = new Carro("Branco", "Uno", "Fiat", 200, "08/2002");
		c3.getStatus();
	}
}
