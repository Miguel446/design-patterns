package comportamentais.state;

public class MinhaApp {

	public static void main(String[] args) {
		Pato p = new Pato();

		p.voar();

		// Altera o comportamento de voar
		p.setComportamentoVoar(new NaoVoar());

		p.voar();
		p.grasnar();

	}

}
