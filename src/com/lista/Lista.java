package com.lista;

public class Lista {
    private No inicio;

    public Lista() {
        this.inicio = null;
    }

    public void insereInicio(Object elemento) { // METODO PARA ADICIONAR ELEMENTO NO INICIO DA LISTA

        No novoNo = new No(null, elemento); // 1_criar novo nó com o elemento desejado;
        novoNo.setProximo(this.inicio); // 2_ Nó criado aponta(se liga) a lista
        this.inicio = novoNo; // 3_inicio da lista recebe novo nó criado
        //
        if (this.inicio != null) {
            No auxiliar = this.inicio;
            while (auxiliar.getProximo() != null) {
                auxiliar = auxiliar.getProximo();
            }
            auxiliar.setProximo(novoNo);
        } else {
            this.inicio = novoNo;
        }
    }

    public Object getInicio() {
        return this.inicio;
    }

    public Object removeInicio() {
        No auxiliar = this.inicio;
        this.inicio = auxiliar.getProximo();
        return auxiliar.getElemento();
    }

    public void imprimeLista() {
        No auxiliar = this.inicio;
        System.out.println("Inicio da Lista Ligada");
        while (auxiliar != null) {
            System.out.println(auxiliar.getElemento());
            auxiliar = auxiliar.getProximo();
        }
        System.out.println("Final da Lista Ligada");
    }

    public Object buscaElemento(long posicao) {
        No auxiliar = this.inicio;
        while ((posicao > 0) && (auxiliar != null)) {
            if (posicao == 1)
                return auxiliar.getElemento();
            posicao--;
            auxiliar = auxiliar.getProximo();
        }
        return null;
    }

    public void liberaLista() {
        while (inicio != null) {
            inicio = inicio.getProximo();

        }
    }
}