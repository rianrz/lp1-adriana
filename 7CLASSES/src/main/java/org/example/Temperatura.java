package org.example;

import java.util.Scanner;

public class Temperatura {
    static int[] medias = {24, 24,24,22,19,18,18,19,20,22,23,24};

    public static void execute(){
        for(int i = 0; i <= 12; i++){
            if(medias[i] > 18){
                System.out.println("Temperatura Agradavel");
            }
            else{
                System.out.println("Frio");
            }
        }
    }

    public String executa2(int i){
        if( medias[i-1] > 18){
            return "Temperatura Agradeavel";
        }
        else{
            return "Frio";
        }
    }
}