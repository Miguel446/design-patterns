package criacionais.abstractfactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

// No abstract factory existe apenas uma fábrica(EmpresaOnibus) e é a partir dela que as outras classes são instanciadas
// Este design pattern é recomendado quando os produtos a serem desenvolvidos são bem definidos
// por exemplo, não faria sentido implementar uma classe ConcreteEmpresaAerea a partir da classe EmpresaOnibus
public class MinhaApp {

	public static void main(String[] args) {
		// Empresas de ônibus
		EmpresaOnibus viacaoXYZ = new ConcreteEmpresaOnibus();

		// Emite passagens
		PassagemOnibusUrbano pUrbano = viacaoXYZ.emitePassagemOnibusUrbano("São Paulo", "Campinas",
				new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));

		PassagemOnibusInterestadual pInterestadual = viacaoXYZ.emitePassagemOnibusInterestadual("São Paulo",
				"Rio de Janeiro", new GregorianCalendar(2016, Calendar.APRIL, 20, 8, 30));

		// Exibe detalhes da passagem
		pUrbano.exibeDetalhes();

		pInterestadual.exibeDetalhes();
	}

}
