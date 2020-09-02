package Banco;

public class Conta {
	//Atr�tutos 
	public int numConta;
	protected String tipo; //cc ou cp
	private String dono;
	private double saldo;
	private boolean status; //� se a conta est� aberta ou n�o.
	
	//Construtor
	Conta(){ //Quando criar uma conta o status vai ser falso e o saldo vai ser 0.
		this.saldo = 0;
		this.status = false;
	}
	
	
	
	//M�todos
	public void abrirConta(String tipo){
		setTipo(tipo); // ou this.tipo = tipo;
		setStatus(true);
		if(this.tipo == "cc") {
			this.saldo = 50;
		} else if (this.tipo == "cp"){
			this.saldo = 150;
		} else {
			System.out.println("Tipo de conta n�o identificada.");
		}
		
	}
	/*public void fecharConta(){
		if(this.saldo != 0) {
			System.out.println("N�o foi poss�vel fechar a conta. "
					+ "Verifique se ainda possu� saldo ou se a conta est� em d�bito.");
		}
	} PODE SER FEITO ASSIM OU: 
	*/
	public void fecharConta(){
		if(this.saldo > 0) {
			System.out.println("Conta com dinheiro.");
		} else if(this.saldo < 0) {
			System.out.println("Conta em d�bito.");
		} else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso.");
		}
	}
	public void depositar(double quantidade){
		if(this.status == true) { // ou isStatus() == true
			this.saldo += quantidade; // ou setSaldo(getSaldo() + v)
		} else {
			System.out.println("Imposs�vel depositar.");
		}
	}
	public void sacar(double quantidade){
		if(this.status == true && this.saldo > quantidade) {
			this.saldo -= quantidade; // ou this.saldo = this.saldo - quantidade;
			System.out.println("O valor foi sacado com sucesso!");
		} 
	}
	public void pagarMensal(){
		double valor = 0;
		if(this.tipo == "cc") {
			valor = 12.0;
		} else if (this.tipo == "cp") {
			valor = 20.0;
		}
		
		if(this.status == true) {
			if(this.saldo > valor) {
				saldo -= valor;
			} else {
				System.out.println("Saldo insuficiente");
			}
			
		} else {
			System.out.println("Imposs�vel pagar");
		}
	}
	
	
	//M�todos getters e settes 
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
