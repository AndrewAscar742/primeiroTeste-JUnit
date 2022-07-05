package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public BigDecimal reajustarSalario(Funcionario funcionario, Desempenho desp) {
		BigDecimal percentual = funcionario.getSalario().multiply(desp.calcularPercentual());
		return funcionario.getSalario().add(percentual).setScale(2, RoundingMode.HALF_UP);
	}

}
