package ClassesEObjetos;

public class ObjetosAula {
	public static void main(String[] args) {
		Aula a1 = new Aula(); 
			a1.professor = "Mikael";
			a1.duracao = 1;
			a1.numAlunos = 30;
			a1.materia = "matematica";
			a1.horaInicio = "16 horas";
			a1.horaTermino = "18 horas";
			
			a1.comecarAula();
			a1.status();
	}
}
