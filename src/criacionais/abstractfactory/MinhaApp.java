package criacionais.abstractfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

// No abstract factory existe apenas uma f�brica(EmpresaOnibus) e � a partir dela que as outras classes s�o instanciadas
// Este design pattern � recomendado quando os produtos a serem desenvolvidos s�o bem definidos
// por exemplo, n�o faria sentido implementar uma classe ConcreteEmpresaAerea a partir da classe EmpresaOnibus
public class MinhaApp {

	public static void main(String[] args) {
		// Empresas de �nibus
		EmpresaOnibus viacaoXYZ = new ConcreteEmpresaOnibus();

		// Emite passagens
		PassagemOnibusUrbano pUrbano = viacaoXYZ.emitePassagemOnibusUrbano("S�o Paulo", "Campinas",
				new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));

		PassagemOnibusInterestadual pInterestadual = viacaoXYZ.emitePassagemOnibusInterestadual("S�o Paulo",
				"Rio de Janeiro", new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));

		// Exibe detalhes da passagem
		pUrbano.exibeDetalhes();

		pInterestadual.exibeDetalhes();
	}

}
