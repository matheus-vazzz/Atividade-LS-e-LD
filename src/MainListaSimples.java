public class MainListaSimples {

    public static void main(String[] args) {

        ListaSimples lista = new ListaSimples(10);

        lista.exibirElementos();

        lista.adicionarElemento("Ana");
        lista.adicionarElemento("Carlos");
        lista.adicionarElemento("Pedro");
        lista.adicionarElemento("Ana");
        lista.adicionarElemento("Maria");
        lista.exibirElementos();

        lista.buscarElemento("Pedro");

        lista.removerElemento("Maria");
        lista.exibirElementos();

        System.out.println("Quantidade de elementos: " + lista.contar());

        String[] novos = {"João", "Lucas", "Ana"};
        lista.adicionarVarios(novos);
        lista.exibirElementos();

        System.out.println("Elemento na posição 2: " + lista.obter(2));

        lista.inserir(1, "Marcos");
        lista.exibirElementos();

        lista.removerPorIndice(3);
        lista.exibirElementos();

        lista.contarOcorrencias("Ana");

        lista.ultimoIndiceDe("Ana");

        lista.substituir("Ana", "Beatriz");
        lista.exibirElementos();

        lista.removerTodas("Carlos");
        lista.exibirElementos();

        lista.limpar();
        lista.exibirElementos();
    }
}
