import java.util.Scanner;

public class Senha {
public static void main(String[] args){
    int senha = 1234;
    int user;

    Scanner sc = new Scanner(System.in);
    IO.println("informe sua senha:");
    user = sc.nextInt();

    if (user == senha){
        IO.println("Acesso Permitido");
    }
    else {
        IO.println("Acesso Bloqueado");
    }
}
}
