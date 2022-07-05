package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusteService;

public class ReajusteServiceTest {
	static ReajusteService reajuste = new ReajusteService();
	
	@Test
	public void reajusteDesempenhoA_Desejar() {
		BigDecimal sal = reajuste.reajustarSalario(new Funcionario("Andrew", LocalDate.now(), new BigDecimal("1000.00")), Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), sal);
	}
	
	@Test
	public void reajusteDesempenhoBom() {
		BigDecimal sal = reajuste.reajustarSalario(new Funcionario("Andrew", LocalDate.now(), new BigDecimal("1000.00")), Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), sal);
	}
	
	@Test
	public void reajusteDesempenhoOtimo() {
		BigDecimal sal = reajuste.reajustarSalario(new Funcionario("Andrew", LocalDate.now(), new BigDecimal("1000.00")), Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), sal);
	}
}
