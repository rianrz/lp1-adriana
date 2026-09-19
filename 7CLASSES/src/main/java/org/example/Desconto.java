package org.example;

import java.util.Scanner;

public class Desconto {
    public String execute(double desconto) {
        int arroz = 20, feijao = 40, oleo = 7, acucar = 4, cafe = 30, macar = 3, farinha = 6, fuba = 2, molho = 3, sal = 3;
        double subtotal = arroz+feijao+oleo+acucar+cafe+macar+farinha+fuba+molho+sal;

        if(subtotal > 100){
            desconto = subtotal - (subtotal * 0.1);
            return "Valor Final:"+ desconto + "\n" +
                    "O preço sem desconto:" + subtotal;
        }
        else {
            desconto = subtotal;
            return"Valor Final:"+ desconto + "\n" +
                    "O preço sem desconto:" + subtotal;
        }


    }

}
