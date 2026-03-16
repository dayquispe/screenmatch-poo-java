package br.com.alura.screenmatch.desafiosObjetosDistintos.desafio6;

import java.util.ArrayList;

public class PrincipalDesafio6 {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> listaDeContas  = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria(65, 5455);
        ContaBancaria conta2 = new ContaBancaria(45, 5465);
        ContaBancaria conta3 = new ContaBancaria(4, 425);
        ContaBancaria conta4 = new ContaBancaria(7, 10120);

        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);

        double maior = listaDeContas.getFirst().getSaldo();

        for(ContaBancaria conta: listaDeContas){
            if (conta.getSaldo() > maior){
                maior = conta.getSaldo();
            }
        }
        System.out.println("O maior saldo é de R$" + maior);
    }
}
