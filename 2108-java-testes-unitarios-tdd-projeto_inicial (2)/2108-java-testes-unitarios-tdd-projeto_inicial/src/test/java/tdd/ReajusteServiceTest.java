package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;

public class ReajusteServiceTest {
	private ReajusteService reajuste;
	private Funcionario fun;
	
	@BeforeEach
	void inicializarMetodos() {
		System.out.println("Inicio de cenário");
		this.reajuste = new ReajusteService();
		fun = new Funcionario("Andrew", LocalDate.now(), new BigDecimal("1000.00"));
	}
	
	@AfterEach
	void finalizandoMetodos() {
		System.out.println("Finalizando cenário");
	}
	
	@BeforeAll
	static void mensagemInicial() {
		System.out.println("Inicializando teste");
	}
	
	@AfterAll
	static void mensagemFinal() {
		System.out.println("Teste Finalizado");
	}
	
	@Test
	public void reajusteDesempenhoA_Desejar() {
		BigDecimal sal = reajuste.reajustarSalario(fun, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), sal);
	}
	
	@Test
	public void reajusteDesempenhoBom() {
		BigDecimal sal = reajuste.reajustarSalario(fun, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), sal);
	}
	
	@Test
	public void reajusteDesempenhoOtimo() {
		BigDecimal sal = reajuste.reajustarSalario(fun, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), sal);
	}
}
