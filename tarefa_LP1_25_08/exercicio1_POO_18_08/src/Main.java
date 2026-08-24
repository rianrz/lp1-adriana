void main() {
    IO.println("Informe qual Método vc quer executar:");
    Scanner sc = new Scanner(System.in);
    int resp = sc.nextInt();

    if(resp == 1){
        IO.println("Você escolheu Multiplo!!");
        IO.println("Informe o primeiro numero:");
        int num1=sc.nextInt();

        IO.println("Informe o segundo numero:");
        int num2=sc.nextInt();

        Multiplo nums = new Multiplo(num1, num2);

        IO.print(nums.resposta());

    }
    if(resp == 2){
        IO.println("Você escolheu Senha!!");
        IO.println("Informe qual é a senha");
        int senha = sc.nextInt();
        Senha jorge = new Senha();
        IO.println(jorge.resp(senha));
    }
    if(resp == 3){
        IO.println("Você escolheu Temperatura!!");
        Temperatura.execute();
    }
    if(resp == 4){
        Desconto.execute();
    }
    if(resp == 5){
        IO.println("informe a quantidade de dias do aluguel:");
        int dia=sc.nextInt();

        IO.println("informe a distancia total percorrida:");
        int dist=sc.nextInt();
        Aluguel fi = new Aluguel(dia, dist);
        IO.println(fi.Calc(dia, dist));
    }
    if(resp == 6){
        Camelo.execute();
    }
    if(resp == 7){
        System.out.print("Informe a distancia percorrida:");
        double dist = sc.nextDouble();
        System.out.print("Informe o preço do compustivel:");
        double preco = sc.nextDouble();
        Viagem g = new Viagem(dist, preco);
        IO.println(g.outsaida());
    }


}
