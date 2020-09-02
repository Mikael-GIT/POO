import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiando;
	private int rounds;
	private boolean lutaAprovada;
	
	
	public void marcarLuta(Lutador desafiado, Lutador desafiando) {
		boolean mesmaCategoria = desafiado.getCategoria() == desafiando.getCategoria();
		boolean lutadoresDiferentes = desafiado.getNome() != desafiando.getNome();
		lutaAprovada = mesmaCategoria && lutadoresDiferentes;
		if(lutaAprovada) {
			this.desafiado = desafiado;
			this.desafiando = desafiando;
		} else {
			this.lutaAprovada = false;
			this.desafiando = null;
			this.desafiando= null;
		}
	}
	public void lutar() {
		if(this.lutaAprovada == true) {
			System.out.println("###DESAFIADO###");
			desafiado.apresentar();
			System.out.println("###DESAFIANDO###");
			desafiando.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 1 2 3 
			switch(vencedor) {
			case 0: 
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				break;
			case 1: //desafiado vence
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiando.perderLuta();
				break;
			case 2: //desafiando vence
				System.out.println("Vitória do " + this.desafiando.getNome());
				this.desafiando.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
		} else {
			System.out.println("Luta não pode acontecer.");
		}
	}
}
