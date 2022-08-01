package br.dio.testes2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Digite um valor do desconto (numero inteiro): ");
            int desconto = input.nextInt();
            System.out.println("Digite um valor do produto antes do desconto: ");
            int precoAntigo = input.nextInt();
            int precoNovo = (precoAntigo - (precoAntigo * desconto / 100));
            System.out.println(" O preço com desconto é igual: " + precoNovo);
        } catch (InputMismatchException e) {
            System.out.println("Erro. Digite um número");
        }
    }
}


