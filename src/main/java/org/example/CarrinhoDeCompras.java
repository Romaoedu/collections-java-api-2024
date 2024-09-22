package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item>itens = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
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
        double soma = 0d;
        for (Item i : itens){
            soma = soma + i.getPreco() * i.getQuantidade();
        }
        return soma;
    }

    public void exibirItens(){

        itens.stream().forEach(System.out::println);

    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Item 1", 10, 1);
        carrinhoDeCompras.exibirItens();
    }
}
