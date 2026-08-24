import java.util.Scanner;

public class Multiplo {
    public int num1, num2;

    public Multiplo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String resposta() {

        double result = num1 % num2;

        if(result == 0){
            return "Os numeros sao multiplos";
        }
        else{
            return "Os numeros não são multiplo";
        }
    }
}