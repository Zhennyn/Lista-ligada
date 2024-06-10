package com.lista;

public class CadastroCliente {
    public static void main(String[] args) {
        Lista listaClientes = new Lista();
        listaClientes.imprimeLista();
        Cliente c = new Cliente(221, "Produtos excelentes LTDA",
                "Rua sem fim, 200",
                5000.0);

        
        listaClientes.insereInicio(c); 
        listaClientes.imprimeLista();
        listaClientes.insereInicio(new Cliente(185, "Negócios Importantes SA",
                "Avenida Principal, 10",
                12000.0));

        listaClientes.imprimeLista();
        listaClientes.insereInicio(new Cliente(443, "Parceiros Críticos LTDA",
                "Rua dos negócios, 2000",
                7000.0));
        listaClientes.imprimeLista();

        
        c = (Cliente) listaClientes.buscaElemento(2);
        if (c != null) {
            System.out.println("Elemento da posicao 2 da Lista Ligada");
            System.out.println(c);
        }

        Cliente clienteRemovido = (Cliente) listaClientes.removeInicio();
        System.out.println("Elemento removido da Lista Ligada");
        System.out.println(c);
        listaClientes.imprimeLista();
        // liberando toda a lista
        System.out.println("Liberando toda a lista");
        listaClientes.liberaLista();
        listaClientes.imprimeLista();
    }
}