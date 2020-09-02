package Aula;

public class Aluno extends Pessoa{ //Ao fazer extends Pessoa, tanto a classe aluno ter� acesso
	//aos atributos e m�todos da classe pessoa, mas como os atributos de pessoa est�o private
	//o aluno s� poder� usar os m�todos da classe pessoa, pois s�o p�blicos.
	private String cursos;
	private double [] notas;
	
	Aluno(){
		super(); //Quando declaramos super dentro do construtor da classe filha, estamos
		//chamando tamb�m o contrutor da clase m�e/pai. � importante entender isso, pois 
		//ao chamar esse construtor tamb�m teremos as regras do construtor da classe Pessoa.
	}
	
	public void verificarAcesso() {
		super.getNome();
	}
	
	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
	
}
