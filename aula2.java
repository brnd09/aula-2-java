package com.mycompany.aula;

import java.util.Scanner;

public class Aula_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Valores inteiros
        int vr = 10;
        int ch = 0;
        int qtdtentativas = 0;

        //Loop de tentativas
        while ((vr != ch) && (qtdtentativas < 10)) {

            System.out.println("Tenta outra vez: ");
            ch = teclado.nextInt();

            qtdtentativas = qtdtentativas + 1;

            if ((qtdtentativas >= 2) && (qtdtentativas <= 4));
            {
                System.out.println("Dica, chute um numero de 1 a 1000.");
            }
            if (ch == vr) {
                System.out.println("Parabens, voce acertou");
            }

        }

    }
}
