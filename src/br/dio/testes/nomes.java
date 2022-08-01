package br.dio.testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class nomes {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        String[] nominhos = new String[5];
        System.out.println("Digite cinco nomes e o valor desejado da posição para consulta:");

        try {
            for (int i = 0; i < nominhos.length; i++) {
                nominhos[i] = input.nextLine();
            }
            int pos = input.nextInt();
            System.out.println("O nome encontrado na posição escolhida é: " + nominhos[pos]);
        } catch (InputMismatchException e) {
            System.out.println("Erro. Digite um número inteiro no ultimo valor");
        }

    }
}




