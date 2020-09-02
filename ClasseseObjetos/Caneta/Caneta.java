package ClassesEObjetos;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	
	Caneta(String modelo, String cor, float ponta){//declara��o do m�todo construtor
		
		//Nas pr�ximas linhas vemos a import�ncia de colocar parametros em construtores
		//Quando uma pessoa for criar uma caneta nova, ela j� vai ter que passar os 
		//atributos necessarios pra que exista uma caneta, ou seja, j� teremos o objeto
		//criado com os seus parametros essenciais passados na instancia��o do objeto.
		this.modelo = modelo; 
		this.cor = cor;
		this.ponta = ponta;
		//Um exemplo, da import�ncia dos construtores, temos o valor carga definido como
		//padr�o, por exemplo, uma caneta sai da f�brica com quantos porcentos de carga?
		//100%, logo podemos definir para que quando um objeto seja instanciado, j� venha
		//com esse valor padr�o definido. Veja:
		this.carga = 100;
		//Tamb�m podemos utilizar m�todos da classe dentro dos construtores. Por exemplo,
		//quando n�s criamos uma caneta ou pegamos qual � o padr�o? � que ela venha 
		//fechada, certo? Logo, neste caso, podemos utilizar o m�todo tampar(); para
		//que quando o objeto seja instanciado, o status da caneta j� venha tampada.
		tampar(); 
		//Tamb�m poderiamos ao inv�s de usar um m�todo para fazer isso, simplesmente
		//colocar this.tampada = true; para que a classe seja instanciada j� com 
		//este atributo como inicial, mas � uma outra maneira de fazer.
	}
	
	public void tampar() {
		this.tampada = true;
	}
	//Bom, utilizamos os m�todos construtores para aumentar a seguran�a dos atributos.
	//Por exemplo, n�o chegamos em um banco e saimos colocando o dinheiro que queremos
	//no caixa, temos que chamar um funcion�rio para que ele realize esse procedimento 
	//e guarde com seguran�a. � basicamente isto que serve o m�todo Setter, ele
	//recebe um parametro, neste caso o valor que desejo depositar, pega esse valor
	//e guarda na vari�vel valor total. 
	
	//Enquanto que o m�todo Getter, imagina todos que precisam pegar um dinheiro
	//Simplesmente cheguem num balc�o e peguem o quanto precisam, imagina a organiza��o
	//e seguran�a disto... Ent�o, o m�todo Getter faz o seguinte, faz uma intermedia��o
	//entre o atr�buto e o objeto. � como se tamb�m tivesse um funcion�rio no meio
	//eu pe�o ao funcion�rio (m�todo) para que pegue uma determinada informa��o (atributo)
	//e me retorne (retorno do m�todo). 
	
	//Com isso, tamb�m podemos notar a import�ncia da visibilidade dos atributos.
	//Por exemplo, � necess�rio que o meu valor total seja algo privado, que s� eu tenha
	//acesso, neste caso, quem tem acesso mesmo � o banco e ele me retorna o valor.
	//N�o � algo aberto ao p�blico, n�o � qualquer pessoa que chega na minha ag�ncia
	//(import�ncia da visibilidade privada)e fica sabendo do meu valor total, eu 
	//preciso pedir ao banco para que verifique o valor total que eu tenho em 
	//conta (o m�todo Getter). 
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	private int carga;
	private boolean tampada;
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void getStatus() {
		System.out.println("O modelo da caneta �: " + this.modelo);
		System.out.println("A cor da caneta �: " + this.cor);
		System.out.println("A ponta da caneta �: " + this.ponta);
		System.out.println("A caneta est� tampada? " + this.isTampada());
	}
}
