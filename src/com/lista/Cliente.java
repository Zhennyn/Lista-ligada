package com.lista;

public class Cliente {
    private long codigo;
    private String razaoSocial;
    private String endereco;
    private double previsaoVendas;

    public Cliente(long c, String r, String e, double p) // construtor classe Cliente
    {
        codigo = c;
        razaoSocial = r;
        endereco = e;
        previsaoVendas = p;
    }

    public String toString() {
        return "Codigo: " + codigo + "Razão Social:" + razaoSocial;
    }

    public void atualizaRazaoSocial(String razao) {
        razaoSocial = razao;
    }

    public void atualizaPrevisao(double previsao) {
        previsaoVendas = previsao;
    }

    public void mudaEndereco(String endereco) {
        endereco = endereco;
    }
}