package br.dio.testes;

import java.util.Scanner;

// Não de forma surpreendente, existe uma fórmula com a qual
// podemos calcular facilmente o número de peças de um jogo do tipo duplo-N,
// para um número N natural qualquer: ((N+1)*(N+2))/2. Bom, não é porque a fórmula
// existe que não temos um problema para você: estamos precisando da sua ajuda para
// escrever um programa que, dado o valor N, use esta fórmula para calcular e imprimir
// quantas peças existem num jogo de dominó do tipo duplo-N.
public class domino {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um valor para N");
            int n = leitor.nextInt();
            while (n <= 0 | n >=10000){
                System.out.println(" Valor de N inválido! Digite novamente");
                n = leitor.nextInt();
            }
            System.out.println("Quantidade de peças que existem no jogo do tipo duplo N é dado por ((N+1) * (N+2)/2)");
            System.out.println(((n+1) * (n+2)/2));
        }
    }

