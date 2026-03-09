public class ListaDinamica implements ListaOperacoes {

    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista dinâmica criada com sucesso!");
    }

    public void adicionarElemento(String elemento) {

        if (inicioEstaVazio()) {
            this.inicio.setConteudo(elemento);
        } else {

            No aux = this.inicio;
            No novoNo = new No(elemento);

            while (aux.getProx() != null) {
                aux = aux.getProx();
            }

            aux.setProx(novoNo);
        }
    }

    public void exibir() {

        if (inicioEstaVazio()) {
            System.out.println("Não existem elementos na lista dinâmica.");
        } else {

            No aux = this.inicio;

            while (aux != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }

        }
    }

    private boolean inicioEstaVazio() {
        return this.inicio.getConteudo() == null;
    }

    public void removerElemento(String elemento) {

        if (inicioEstaVazio()) {
            System.out.println("Não há elementos a serem removidos.");
            return;
        }

        No aux = inicio;
        No anterior = null;

        while (aux != null) {

            if (aux.getConteudo().equals(elemento)) {

                if (anterior == null) {
                    inicio = aux.getProx();
                } else {
                    anterior.setProx(aux.getProx());
                }

                System.out.println("Elemento removido!");
                return;
            }

            anterior = aux;
            aux = aux.getProx();
        }

        System.out.println("Elemento não encontrado.");
    }

    public boolean procurarElemento(String elemento) {

        No aux = inicio;

        while (aux != null) {

            if (aux.getConteudo() != null && aux.getConteudo().equals(elemento)) {
                System.out.println("Elemento " + elemento + " encontrado!");
                return true;
            }

            aux = aux.getProx();
        }

        System.out.println("Elemento " + elemento + " não existe na lista.");
        return false;
    }

    public int removerTodas(String elemento) {
        int removidos = 0;
        No aux = inicio;
        No anterior = null;

        while (aux != null) {
            if (aux.getConteudo() != null && aux.getConteudo().equals(elemento)) {
                removidos++;

                if (anterior == null) {
                    inicio = aux.getProx();
                    aux = inicio;
                } else {
                    anterior.setProx(aux.getProx());
                    aux = anterior.getProx();
                }
            } else {
                anterior = aux;
                aux = aux.getProx();
            }
        }  return removidos;
    }

    public int contar() {
        int count = 0;
        No aux = inicio;

        while (aux != null && aux.getConteudo() != null) {
            count++;
            aux = aux.getProx();
        }
        return count;
    }

    public int adicionarVarios(String[] elementos) {
        int adicionados = 0;
        for (int i = 0; i < elementos.length; i++) {
            adicionarElemento(elementos[i]);
            adicionados++;
        }
        return adicionados;
    }

    public String obter(int indice) {
      if (indice < 0) 
        return null; 
      
      No aux = inicio;
        int i = 0;

        while (aux != null) {
            if (i == indice) {
                return aux.getConteudo();
            }
            aux = aux.getProx();
            i++;
        }
        return null;
    }

    public boolean inserir(int indice, String elemento) {
        if (indice < 0) 
          return false;
      
        No novo = new No(elemento);

        if (indice == 0) {
            novo.setProx(inicio);
            inicio = novo;
            return true;
        }

        No aux = inicio;
        int i = 0;

        while (aux != null && i < indice - 1) {
            aux = aux.getProx();
            i++;
        }
        if (aux == null) return false;
        novo.setProx(aux.getProx());
        aux.setProx(novo);
        return true;
    }

    public String removerPorIndice(int indice) {
        if (indice < 0) 
          return null;
      
        if (indice == 0) {
            String removido = inicio.getConteudo();
            inicio = inicio.getProx();
            return removido;
        }
        No aux = inicio;
        int i = 0;

        while (aux.getProx() != null && i < indice - 1) {
            aux = aux.getProx();
            i++;
        }
        if (aux.getProx() == null) return null;
        String removido = aux.getProx().getConteudo();
        aux.setProx(aux.getProx().getProx());
        return removido;
    }

    public void limpar() {
        inicio = new No(null);
    }

    public int ultimoIndiceDe(String elemento) {
        int indice = -1;
        int i = 0;
        No aux = inicio;

        while (aux != null) {
            if (aux.getConteudo() != null && aux.getConteudo().equals(elemento)) {
                indice = i;
            }
            aux = aux.getProx();
            i++;
        }
        return indice;
    }

    public int contarOcorrencias(String elemento) {
        int count = 0;
        No aux = inicio;

        while (aux != null) {
            if (aux.getConteudo() != null && aux.getConteudo().equals(elemento)) {
                count++;
            }
            aux = aux.getProx();
        }
        return count;
    }

    public int substituir(String antigo, String novo) {
        int count = 0;
        No aux = inicio;

        while (aux != null) {
            if (aux.getConteudo() != null && aux.getConteudo().equals(antigo)) {
                aux.setConteudo(novo);
                count++;
            }
            aux = aux.getProx();
        }
        return count;
    }
}
