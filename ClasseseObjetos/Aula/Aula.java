package ClassesEObjetos;

public class Aula {
	String professor;
	double duracao;
	int numAlunos;
	String horaInicio;
	String horaTermino;
	String materia;
	boolean aulaIniciada;
	
	void status() {
		System.out.println("Professor: " + this.professor);
		System.out.println("Materia: " + this.materia);
		System.out.println("Hora inicio: " + this.horaInicio);
		System.out.println("Hora termino: " + this.horaTermino);
		System.out.println("Hora iniciada?" + this.aulaIniciada);
		System.out.println("Número de alunos: " + this.numAlunos);
	}
	void comecarAula() {
		this.aulaIniciada = true;
	}
	void terminarAula() {
		this.aulaIniciada = false;
	}
	void cancelarAula() {
		this.horaInicio = "A aula foi cancelada.";
		System.out.println(this.horaInicio);
	}
}
