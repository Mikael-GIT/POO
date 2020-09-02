package EncapsulamentoInterface;

public class ControleRemoto implements Controlador {
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Metodo construtor
	
	ControleRemoto(){
		volume = 50;
		ligado = false;
		tocando = false;
	}
	
	//Metodos da classe que irão sobrepor os métodos da interface 
	
	
	
	
	
	
	
	
	
	
	
	//Metodos getters e setters
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return this.volume;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean getLigado() {
		return this.ligado;
	}
	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	public boolean getTocando() {
		return this.tocando;
	}
	
	public void ligar() {
		this.setLigado(true);
	}
	public void desligar() {
		this.setLigado(false);
	}
	public void abrirMenu() {
		System.out.println("------ MENU ------");
		System.out.println("Está ligado?" + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume() ; i+=10) {
			System.out.print("|");
		}
	}
	public void fecharMenu() {
		System.out.println("Fechando menu.");
	}
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(getVolume() + 5);
		} 	else {
			System.out.println("Impossível aumentar volume.");
		}
	}
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(getVolume() - 1);
		} 	else {
			System.out.println("Impossível diminuir volume.");
		}
	}
	public void ligarMudo() {
		if(this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		} 
	}
	public void desligarMudo() {
		if(this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}
	public void play() {
		if(this.getLigado() == true && this.getTocando() == false) {
			this.setTocando(true);
		} else {
			System.out.println("Não consegui reproduzir.");
		}
	}
	public void pause() {
		if(this.getLigado() == true && this.getTocando() == true) {
			this.setTocando(false);
		} else {
			System.out.println("Não consegui pausar.");
		}
	}
	
}
