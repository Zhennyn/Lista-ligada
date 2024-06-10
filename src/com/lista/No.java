package com.lista;

public class No {

    private No proximo;
    private Object elemento;

    public No(No proximo){
        this.proximo = proximo;
    }

    public No getProximo(){
        return proximo;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }

    public Object getElemento(){
        return elemento;
    }

    public void setElemento(Object elemento){
        this.elemento = elemento;
    }

}
