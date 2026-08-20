import java.util.Scanner;

public class Senha {

        public int senha = 1234;

        public boolean verificar (int senha){
            return (this.senha==senha);
        }

        public String resp(int senha) {

        if (verificar(senha)) {
            return "Acesso Permitido";
        } else {
            return "Acesso Bloqueado";
        }
    }
}