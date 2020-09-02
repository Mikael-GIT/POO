
public class Lutador implements Controlador{
	
	 private String nome; 
	 private String nacionalidade;
	 private int idade;
	 private double altura;
	 private double peso;
	 private String categoria;
	 private int numVitorias;
	 private int numDerrotas;
	 private int numEmpates;

	 Lutador(String nome, String nacionalidade, int idade, double altura, double peso,
			  int numVitorias, int numDerrotas, int numEmpates){
		 
		 this.nome = nome;
		 this.nacionalidade = nacionalidade;
		 this.idade = idade;
		 this.altura = altura;
		 this.setPeso(peso);
		 this.numVitorias = numVitorias;
		 this.numDerrotas = numDerrotas;
		 this.numEmpates = numEmpates;
	 }
	 public void apresentar() {
		 System.out.println("O lutador " + this.getNome() + " é um peso " + this.getCategoria() +
				 " com " + this.getNumVitorias() + " vítorias, " + this.getNumDerrotas() + " derrotas, "
				 		+ this.getNumEmpates() + " empates.");
	 }
	 
	 public void status() {
		 System.out.println("Nome: " + this.getNome());
		 System.out.println("Categoria: " + this.getCategoria());
		 System.out.println("Idade: " + this.getIdade());
		 System.out.println("Vitórias: " + this.getNumVitorias());
		 System.out.println("Derrotas: " + this.getNumDerrotas());
		 System.out.println("Empates: " + this.getNumEmpates());
	 }
	 
	 public void ganharLuta() {
		 this.setNumVitorias(this.getNumVitorias() + 1);
	 }
	 
	 public void perderLuta() {
		 this.setNumVitorias(this.getNumDerrotas() + 1);
	 }
	 
	 public void empatarLuta() {
		 this.setNumEmpates(this.getNumEmpates() + 1);
	 }
	 
	 
	 
	 
	 public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
			setCategoria(); //Estabelece a categória baseada no peso.
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria() {
			if(this.getPeso() < 52.2) {
				this.categoria = "Inválido";
			} else if(this.getPeso() <= 70.3) {
				this.categoria = "Leve";
			} else if(this.getPeso() <= 83.9) {
				this.categoria = "Médio";
			} else if(this.getPeso() <= 120.2) {
				this.categoria = "Pesado";
			} else {
				this.categoria = "Inválido";
			}
		}
		public int getNumVitorias() {
			return numVitorias;
		}
		public void setNumVitorias(int numVitorias) {
			this.numVitorias = numVitorias;
		}
		public int getNumDerrotas() {
			return numDerrotas;
		}
		public void setNumDerrotas(int numDerrotas) {
			this.numDerrotas = numDerrotas;
		}
		public int getNumEmpates() {
			return numEmpates;
		}
		public void setNumEmpates(int numEmpates) {
			this.numEmpates = numEmpates;
		}
}
