package Servico;

import java.util.List;
import java.util.function.Predicate;

import entities.Produtos;

public class ServicoDeProduto {
	public double avg(List<Produtos> prod, Predicate<Produtos> criteria) {
		int cont = 0;
		double sum = 0.0;	
		for (Produtos p : prod) {
			if (criteria.test(p)) {
				sum += p.getPrice();
				cont ++;
			}
		}
		return sum / cont;
	}

}
