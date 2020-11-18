package criacionais.singleton;

// No design pattern singleton uma mesma instância única de um objeto é disponibilizada em todo o projeto
public class MinhaApp {

	public static void main(String[] args) {
		Janela j = Janela.getInstance();
		j.pack();
		j.setVisible(true);

		Janela j2 = Janela.getInstance();
		j2.pack();
		j2.setVisible(true);
	}

}
