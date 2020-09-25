package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BackEND Sorteios = new BackEND();
        Scanner SC = new Scanner(System.in);
        int Numero1 = 0;
        int Numero2 = 0;
        String Operador = "";
        int Pontos = 0;
        int Erros = 0;
        int Resposta = 0;
        int Resposta_Correta = 0;

        System.out.println("===== Números Aleatórios =====");
        System.out.println("Bem Vindo ao um Jogo que vai Testar Sua Lógica!");
        System.out.println("Enquanto Acertar o Jogo Contiuna, " +
                "Você Pode Errar até 3 Vezes");
        System.out.println("Boa Sorte!");
        System.out.println("===========================================================");

        while(Erros < 3){
            Numero1 = Sorteios.Sortear();
            Numero2 = Sorteios.Sortear();
            Operador = Sorteios.Sinal();

            System.out.println(
                    "A conta é: " + Numero1 + " " + Operador + " " + Numero2 + " = ?"
            );

            if(Operador.equals("+")){

                Resposta_Correta = Numero1 + Numero2;

            }else if(Operador.equals("-")){

                Resposta_Correta = Numero1 - Numero2;

            }else if(Operador.equals("*")){

                Resposta_Correta = Numero1 * Numero2;

            }

            Resposta = Integer.parseInt(SC.nextLine());

            if(Resposta == Resposta_Correta){
                Pontos++;
                System.out.println("Você Acertou!");

            }else{
                Erros++;
                System.out.println("Você Errou! Esse é o seu " + Erros + "° Erro");
            }
        }

        System.out.println("Você Obteve " + Pontos + " Acertos!");


    }
}
