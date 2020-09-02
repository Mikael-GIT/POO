package ClassesEObjetos;

public class Carro {
	private String cor;
	private int numeroDeRodas;
	private String modelo;
	private String fabricante;
	private int potencia;
	private String anoFabricacao;
	private int velocidade;
	private Boolean ligado;
	private boolean arLigado;
	
	Carro(String cor, String modelo, String fabricante, int potencia,
			String anoFabricacao) { //Este é o método construtor 
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.potencia = potencia;
		this.anoFabricacao = anoFabricacao;
		
		//Valores defaults:
		this.delisgado();
		this.desligarAr();
	}
	
	//Métodos getters e setters
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	public void setNumeroDeRodas(int numeroDeRodas) {
		this.numeroDeRodas = numeroDeRodas;
	}
	public int getNumeroDeRodas() {
		return this.numeroDeRodas;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getFabricante() {
		return this.fabricante;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean isLigado() {
		return this.ligado;
	}
	public void setArLigado(boolean arLigado) {
		this.arLigado = arLigado;
	}
	public boolean isArLigado() {
		return this.arLigado;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getAnoFabricacao() {
		return this.anoFabricacao;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	
	public void ligar(){
		ligado = true;
		System.out.println("O carro foi ligado");
	}
	public void delisgado() {
		ligado = false;
		System.out.println("O carro foi desligado");
	}
	public void acelera(){
		velocidade++;
	}
	public void desacelera() {
		velocidade--;
	}
	public void ligarAr(){
		if(this.ligado == false) {
			System.out.println("Erro ao ligar o ar condicionado, ligue o veículo antes.");
		} else {
			this.ligado = true;
			System.out.println("O veículo foi ligado com sucesso.");
		}
	}
	public void desligarAr() {
		this.arLigado = false;
	}
	public void getStatus() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Fabricante: " + this.getFabricante());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ano de fabricação: " + this.getAnoFabricacao());
		System.out.println("Ligado? " + this.isLigado());
		System.out.println("Ar ligado? " + this.isArLigado());
	}
		
}
