package tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;

class BonusServiceTest {
	static BonusService bonus = new BonusService();
	
	@Test
	void bonusDeveRetornarException() {
		assertThrows(IllegalArgumentException.class, () -> bonus.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
	}
	
	@Test
	void bonusDeveRetornarPositivo() {
		BigDecimal big = bonus.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));
		assertEquals(new BigDecimal("250.00"), big);
	}
	
	@Test
	void bonusDeveRetornarSalarioExatamente10000() {
		BigDecimal big = bonus.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));
		assertEquals(new BigDecimal("1000.00"), big);
	}

}
