package br.dio.testes2;

import java.util.Scanner;
//Escreva um algoritmo para ler o número total de eleitores de um município,
// o número de votos brancos, nulos e válidos. Calcule e imprima
// o percentual que cada um representa em relação ao total de eleitores.

public class porcentagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Digite  o total de habitantes:");
        int habitantes = input.nextInt();
        System.out.println(" Digite  o total de votos brancos:");
        int brancos =  input.nextInt();
        System.out.println(" Digite  o total de votos nulos:");
        int nulos = input.nextInt();
        System.out.println(" Digite  o total de votos válidos:");
        int validos = input.nextInt();


        int pBrancos = (brancos *100)/habitantes;
        int pNulos = (nulos * 100)/habitantes;
        int pValidos = (validos * 100)/habitantes;


        System.out.println("Brancos: " + pBrancos + "%");

        System.out.println("Nulos: " + pNulos + "%");

        System.out.println("Validos: " + pValidos + "%");
    }
}

