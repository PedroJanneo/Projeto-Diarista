package br.com.classes;

public class Diarista extends Pessoa{
	//chave pix
	
	

@Override
	public void depositar(double valor) {
	var saldoAtual = getSaldo();
	var novoSaldo = saldoAtual + valor;
	setSaldo(novoSaldo);
		
	}
	@Override
public void sacar(double valor) {
		var saldoAtual = getSaldo();
		var novoSaldo = saldoAtual - valor;
		setSaldo(novoSaldo);
		
	}
}
