package br.com.aula4.implementacao;

import javax.swing.JOptionPane;

import br.com.aula4.beans.Banco;
import br.com.aula4.beans.Cliente;
import br.com.aula4.beans.ContaCorrente2;
import br.com.aula4.tools.Input;

public class ExecutaConta {

	public static void main(String[] args) {

		// 1° Criar dados do Banco
		Banco bb = new Banco(Input.texto("Digite a razão social: "), Input.inteiro("Digite o idBancário: "));
		System.out.println(bb.getRazao());

		// 2° Capturar dados do Cliente

		Cliente cli = new Cliente(JOptionPane.showInputDialog("Digite o Nome: "), Input.texto("Digite o CPF: "),
				Input.texto("Digite o Fone: "));
		System.out.println(cli.getNome());

		// Abrir a ContaCorrente (Banco + Cliente + CC)

		ContaCorrente2 cc = new ContaCorrente2(Input.inteiro("Digite a Agência: "),
				                             Input.inteiro("Digite a CC: "),
				                             Input.decimal("Digite o Saldo: "),
				                             cli, 
				                             bb);
		
		System.out.println("ag: " + cc.getAgencia() + " cc: " + cc.getConta() + " Cliente: " + cc.getCliente().getNome()
				+ " Banco: " + cc.getBanco().getRazao());

	}

}
