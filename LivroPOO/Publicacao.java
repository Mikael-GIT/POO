package PraticandoPOO;

public interface Publicacao {
	public abstract void abrir();
	public abstract void folhear(int p); //avan�a at� uma p�gina especifica que � passada como
	//parametro.
	public abstract void fechar();
	public abstract void avan�arPag();
	public abstract void voltarPag();
	public abstract String detalhes();
}
