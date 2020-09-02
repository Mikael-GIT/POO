package ClassesEObjetos;

public class ObjetosCaneta {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("BIC Crystal", "Azul", 0.5f);
		c1.getStatus();
		
		Caneta c2 = new Caneta("BIC Gross", "Vermelha", 1.0f);
		c2.getStatus();
	}
}
