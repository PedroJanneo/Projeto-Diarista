package br.com.classes;

public class Cliente extends Pessoa{
//saldo


	@Override
public void depositar(double valor) {
		var saldoAtual = getSaldo();
		var novoSaldo = saldoAtual + valor;
		novoSaldo = valor + (valor*0.10); 
		setSaldo(novoSaldo);
			
		}

		

@Override
public void sacar(double valor) {
	var saldoAtual = getSaldo();
	var novoSaldo = saldoAtual - valor;
	if ( valor > novoSaldo) {
		System.out.println("saldo insuficiente");
	}else {
		setSaldo(novoSaldo);
	}
	
			
		}
	


}