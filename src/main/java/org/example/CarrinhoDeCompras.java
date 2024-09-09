package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item>itens = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
    }

    public void removeItem(String nome){

        List removeItens = new ArrayList<>();
        for (Item i : itens ){
            if(i.getNome().equals(nome)){
            removeItens.add(i);
            }
        }
        itens.removeAll(removeItens);
    }

    public double calcularValorCarrinho(){
        double soma = 0;
        for (Item i : itens){
            soma = soma + i.getPreco();
        }
        return soma;
    }

    public void exibirItens(){

        System.out.println(itens.toString());

    }
}
