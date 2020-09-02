package PraticandoPOO;

public interface Publicacao {
	public abstract void abrir();
	public abstract void folhear(int p); //avança até uma página especifica que é passada como
	//parametro.
	public abstract void fechar();
	public abstract void avançarPag();
	public abstract void voltarPag();
	public abstract String detalhes();
}
