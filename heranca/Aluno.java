package Aula;

public class Aluno extends Pessoa{ //Ao fazer extends Pessoa, tanto a classe aluno terá acesso
	//aos atributos e métodos da classe pessoa, mas como os atributos de pessoa estão private
	//o aluno só poderá usar os métodos da classe pessoa, pois são públicos.
	private String cursos;
	private double [] notas;
	
	Aluno(){
		super(); //Quando declaramos super dentro do construtor da classe filha, estamos
		//chamando também o contrutor da clase mãe/pai. É importante entender isso, pois 
		//ao chamar esse construtor também teremos as regras do construtor da classe Pessoa.
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
