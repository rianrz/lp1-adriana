import java.util.Scanner;

public class Temperatura {
    public static void execute(){
        int[] medias = {24, 24,24,22,19,18,18,19,20,22,23,24};

        for(int i = 1; i <= 12; i++){
            if(medias[i] > 18){
                IO.println("Temperatura Agradavel");
            }
            else{
                IO.println("Frio");
            }
        }
    }
}