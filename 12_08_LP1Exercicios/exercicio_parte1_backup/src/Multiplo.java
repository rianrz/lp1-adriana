import java.util.Scanner;

public class Multiplo {
    public static void main (String[] args){
        int num1, num2,result;

        Scanner sc = new Scanner(System.in);

        IO.println("Informe o primeiro numero:");
        num1=sc.nextInt();

        IO.println("Informe o segundo numero:");
        num2=sc.nextInt();

        result = num1 % num2;

        if(result == 0){
            System.out.println("Os numeros sao multiplos");
        }
        else{
            System.out.println("Os numeros não são multiplo");
        }
    }
}
