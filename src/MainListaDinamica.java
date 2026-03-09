public class MainListaDinamica {

    public static void main(String[] args) {

        ListaDinamica lista = new ListaDinamica();

        lista.exibir();

        lista.adicionarElemento("Arroz");
        lista.adicionarElemento("Feijão");
        lista.adicionarElemento("Batata");
        lista.adicionarElemento("Arroz");
        lista.adicionarElemento("Carne");
        lista.exibir();

        lista.procurarElemento("Batata");

        lista.removerElemento("Carne");
        lista.exibir();

        System.out.println("Quantidade de elementos: " + lista.contar());

        String[] novos = {"Macarrão", "Farofa", "Arroz"};
        lista.adicionarVarios(novos);
        lista.exibir();

        System.out.println("Elemento na posição 2: " + lista.obter(2));

        lista.inserir(1, "Salada");
        lista.exibir();

        lista.removerPorIndice(3);
        lista.exibir();

        lista.contarOcorrencias("Arroz");

        lista.ultimoIndiceDe("Arroz");

        lista.substituir("Arroz", "Frango");
        lista.exibir();

        lista.removerTodas("Feijão");
        lista.exibir();

        lista.limpar();
        lista.exibir();
    }
}
