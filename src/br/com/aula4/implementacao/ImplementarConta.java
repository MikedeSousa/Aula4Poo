package br.com.aula4.implementacao;

import br.com.aula4.beans.Cliente;
import br.com.aula4.beans.ContaCorrente2;

public class ImplementarConta {

	public static void main(String[] args) {

		// 1o. Capturar o dados do Cliente

		Cliente cli1 = new Cliente();

		cli1.setNome("Fausto Silva");
		cli1.setCpf("1234567");
		cli1.setFone("9878787");

		Cliente cli2 = new Cliente("Ana Maria Braga", "9999999", "123459800");

		// 2o. Gerar a Conta Corrente

		ContaCorrente2 cc1 = new ContaCorrente2();

		cc1.setAgencia(1010);
		cc1.setConta(150025);
		cc1.setSaldo(100);
		cc1.setCliente(cli1);

		System.out.println("ag:" + cc1.getAgencia() + " cc:" + cc1.getConta() + " saldo:" + cc1.getSaldo() + " Cliente:"
				+ cc1.getCliente().getNome() + " fone:" + cc1.getCliente().getFone());

		cli1.setFone("xxxxxxxx");

		System.out.println("Cliente:" + cli1.getNome() + " Fone:" + cli1.getFone());

		System.out.println("ag:" + cc1.getAgencia() + " cc:" + cc1.getConta() + " saldo:" + cc1.getSaldo() + " Cliente:"
				+ cc1.getCliente().getNome() + " fone:" + cc1.getCliente().getFone());

		ContaCorrente2 cc2 = new ContaCorrente2(1010, 150015, 50, cli2);

		System.out.println("ag:" + cc2.getAgencia() + " cc:" + cc2.getConta() + " saldo:" + cc2.getSaldo() + " Cliente:"
				+ cc2.getCliente().getNome() + " fone:" + cc2.getCliente().getFone());

	}

}
