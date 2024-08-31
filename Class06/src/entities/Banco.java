package entities;

import java.util.Random;

public class Banco {
	private final int conta;
	private String nome;
	private double saldo;
	private final double TAXA = 5.0;
	
	Random random = new Random();
	
	public Banco(String nome) {
		this.nome = nome;
		this.conta = random.nextInt(9000) + 1000;
		}
	
	public Banco(String nome, double initialDeposit) {
		this.nome = nome;
		this.conta = random.nextInt(9000) + 1000;
		this.depositar(initialDeposit);
	}

	public void sacar(double valor){	
		this.saldo -= valor;
		this.saldo -= TAXA;
		}
	public void depositar(double valor) {
		this.saldo += valor;
		}
	public void imprimirSaldo() {
		System.out.println(this.toString());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getConta() {
		return conta;
	}
	@Override
	public String toString() {
		return String.format("Nome: %s%nConta: %d%nSaldo: %.2f%n", this.nome, this.conta, this.saldo);
	}
	
}
