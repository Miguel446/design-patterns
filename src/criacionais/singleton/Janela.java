package criacionais.singleton;

import java.awt.Dimension;

import javax.swing.JFrame;

//Singleton
public class Janela extends JFrame {

	private static final long serialVersionUID = -25703520234663740L;

	private static Janela j = null;

	private Janela() {
		setPreferredSize(new Dimension(640, 480));
	}

	public static Janela getInstance() {
		if (j == null) {
			j = new Janela();
		}
		return j;
	}

}