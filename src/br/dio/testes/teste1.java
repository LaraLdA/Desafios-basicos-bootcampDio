package br.dio.testes;
import java.util.InputMismatchException;
import java.util.Scanner;

//Faça um programa que leia um valor qualquer e apresente umamensagem dizendo em qual dos seguintes intervalos
// ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Caso o valor não esteja em nenhum destes
// intervalos, deverá ser impressa a mensagem: “Fora de intervalo”.
//O símbolo ( representa "maior que". Por exemplo:
//[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
//(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
public class teste1 {

    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor numérico: ");
        try {
            double valor = leitor.nextDouble();

            while (valor < 0 | valor > 100) {
                System.out.println(" Valor Fora do intervalo! Digite novamente");
                valor = leitor.nextDouble();
            }
            if (valor >= 0 && valor <= 25) {
                System.out.println("\n Intervalo [0,25]");
            } else if (valor > 25 && valor <= 50) {
                System.out.println("\n Intervalo (25,50]");
            } else if (valor > 50 && valor <= 75) {
                System.out.println("\n Intervalo (50,75]  ");
            } else if (valor > 75 && valor <= 100) {
                System.out.println(" \n Intervalo (75,100] ");
            }
        }catch (InputMismatchException e) {
                System.out.println("Erro. Digite um número");
            }


        }
    }

