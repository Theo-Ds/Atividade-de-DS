package com.company;

import java.util.Random;

public class BackEND {

    Random Numeros = new Random();

    private String[] Operacoes = {
            "+",
            "-",
            "*"
    };
    public int Sortear(){
        return Numeros.nextInt(100);

    }

    public String Sinal(){
        return Operacoes[Numeros.nextInt(3)];

    }
}
