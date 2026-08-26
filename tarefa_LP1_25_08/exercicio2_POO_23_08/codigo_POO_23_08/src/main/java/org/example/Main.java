package org.example;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // COLUNA 1 (LOJA DE ROUPAS)
        // ==========================================
        System.out.println("--- 1. PRODUTO ---");
        Produto ternoSlim = new Produto("Terno Slim Fit", "G", 599.90);
        ternoSlim.aplicaDesconto(10.0);
        ternoSlim.exibeEtiqueta();
        ternoSlim.verificaTamanho("G");

        System.out.println("\n--- 2. FUNCIONÁRIO ---");
        Funcionario vendedorCarlos = new Funcionario("Carlos Silva", "Vendedor", 2021);
        vendedorCarlos.baterPonto();
        vendedorCarlos.solicitarAumento(5.0);

        System.out.println("\n--- 3. CLIENTE ---");
        Cliente clienteRian = new Cliente("Rian Paes", "123.456.789-00", 850.00);
        clienteRian.realizarCompra(250.0);
        clienteRian.solicitarTroca("Camisa Social");
        clienteRian.adicionarSaldo(100.0);


        // ==========================================
        // COLUNA 2 (CICLISMO / PARQUE)
        // ==========================================
        System.out.println("\n--- 4. ATIVIDADE LAZER ---");
        AtividadeLazer passeioTrilha = new AtividadeLazer("Trilha das Araucárias", 45, "Moderado");
        passeioTrilha.iniciarAtividade();
        passeioTrilha.registrarParada("Mirante Principal");
        passeioTrilha.finalizarAtividade();

        System.out.println("\n--- 5. PARQUE ---");
        Parque parqueEstadual = new Parque("Parque Estadual", 500, true);
        parqueEstadual.abrirParque();
        parqueEstadual.Lotacao(320);
        parqueEstadual.manutencaoTrilha("Trilha do Rio");

        System.out.println("\n--- 6. EQUIPAMENTO ---");
        Equipamento bikeTrilha = new Equipamento("Mountain Bike Aro 29", "Ótimo", false);
        bikeTrilha.realizarAluguel();
        bikeTrilha.inspecionar();
        bikeTrilha.realizarDevolucao();


        // ==========================================
        // COLUNA 3 (MÁSCARAS / EXPOSIÇÃO)
        // ==========================================
        System.out.println("\n--- 7. MÁSCARA ---");
        Mascara mascaraIoruba = new Mascara("Proteção e Ritual", "MadrePérola e Madeira", "Iorubá");
        mascaraIoruba.descrevaObra();
        mascaraIoruba.compatibilidadeExposicao("Metal");
        mascaraIoruba.solicitarRestauracao();

        System.out.println("\n--- 8. EXPOSIÇÃO ---");
        Exposicao mostraAncestral = new Exposicao("Ancestralidade em Arte", "Sala A2", 150);
        mostraAncestral.abrirExposicao();
        mostraAncestral.venderIngressos(5);
        mostraAncestral.encerrarVisitacao();

        System.out.println("\n--- 9. CURADOR ---");
        Curador especialistaBeatriz = new Curador("Dra. Beatriz Santos", "Arte Africana Tradicional", 12);
        especialistaBeatriz.catalogarObra("Máscara Ritualística Iorubá");
        especialistaBeatriz.aprovarObra();
        especialistaBeatriz.guiar(15);


        // ==========================================
        // COLUNA 4 (ESBOÇO DE CABELO / ARTE)
        // ==========================================
        System.out.println("\n--- 10. ESBOÇO CABELO ---");
        EsbocoCabelo estudoEspetado = new EsbocoCabelo("Cabelo Anime Espetado", "G-Pen / Nanquim", 35);
        estudoEspetado.aplicarSombra();
        estudoEspetado.ajustarLinha();
        estudoEspetado.exportarEsboco();

        System.out.println("\n--- 11. ARTISTA ---");
        Artista desenhistaLucas = new Artista("Lucas Mendes", "Intermediário", 42);
        desenhistaLucas.praticar();
        desenhistaLucas.salvarPortifolio();
        desenhistaLucas.pedirFeedback();

        System.out.println("\n--- 12. MEIO ---");
        Meio mesaDigital = new Meio("Mesa Digitalizadora Wacom", true, "Digital HD");
        mesaDigital.prepararSuperficie();
        mesaDigital.verificarDisponibilidade();
        mesaDigital.limparTela();
    }
}