package ClassesEObjetos;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	
	Caneta(String modelo, String cor, float ponta){//declaração do método construtor
		
		//Nas próximas linhas vemos a importância de colocar parametros em construtores
		//Quando uma pessoa for criar uma caneta nova, ela já vai ter que passar os 
		//atributos necessarios pra que exista uma caneta, ou seja, já teremos o objeto
		//criado com os seus parametros essenciais passados na instanciação do objeto.
		this.modelo = modelo; 
		this.cor = cor;
		this.ponta = ponta;
		//Um exemplo, da importância dos construtores, temos o valor carga definido como
		//padrão, por exemplo, uma caneta sai da fábrica com quantos porcentos de carga?
		//100%, logo podemos definir para que quando um objeto seja instanciado, já venha
		//com esse valor padrão definido. Veja:
		this.carga = 100;
		//Também podemos utilizar métodos da classe dentro dos construtores. Por exemplo,
		//quando nós criamos uma caneta ou pegamos qual é o padrão? é que ela venha 
		//fechada, certo? Logo, neste caso, podemos utilizar o método tampar(); para
		//que quando o objeto seja instanciado, o status da caneta já venha tampada.
		tampar(); 
		//Também poderiamos ao invés de usar um método para fazer isso, simplesmente
		//colocar this.tampada = true; para que a classe seja instanciada já com 
		//este atributo como inicial, mas é uma outra maneira de fazer.
	}
	
	public void tampar() {
		this.tampada = true;
	}
	//Bom, utilizamos os métodos construtores para aumentar a segurança dos atributos.
	//Por exemplo, não chegamos em um banco e saimos colocando o dinheiro que queremos
	//no caixa, temos que chamar um funcionário para que ele realize esse procedimento 
	//e guarde com segurança. É basicamente isto que serve o método Setter, ele
	//recebe um parametro, neste caso o valor que desejo depositar, pega esse valor
	//e guarda na variável valor total. 
	
	//Enquanto que o método Getter, imagina todos que precisam pegar um dinheiro
	//Simplesmente cheguem num balcão e peguem o quanto precisam, imagina a organização
	//e segurança disto... Então, o método Getter faz o seguinte, faz uma intermediação
	//entre o atríbuto e o objeto. É como se também tivesse um funcionário no meio
	//eu peço ao funcionário (método) para que pegue uma determinada informação (atributo)
	//e me retorne (retorno do método). 
	
	//Com isso, também podemos notar a importância da visibilidade dos atributos.
	//Por exemplo, é necessário que o meu valor total seja algo privado, que só eu tenha
	//acesso, neste caso, quem tem acesso mesmo é o banco e ele me retorna o valor.
	//Não é algo aberto ao público, não é qualquer pessoa que chega na minha agência
	//(importância da visibilidade privada)e fica sabendo do meu valor total, eu 
	//preciso pedir ao banco para que verifique o valor total que eu tenho em 
	//conta (o método Getter). 
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
		System.out.println("O modelo da caneta é: " + this.modelo);
		System.out.println("A cor da caneta é: " + this.cor);
		System.out.println("A ponta da caneta é: " + this.ponta);
		System.out.println("A caneta está tampada? " + this.isTampada());
	}
}
