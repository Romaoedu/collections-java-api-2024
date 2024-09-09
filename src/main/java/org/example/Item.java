package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PublicKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private String nome;
    private double preco;
    private int quantidade;

    public String toString(){

        return "Produto: "+ nome + " Valor: $" +  preco + " Quantidade: " + quantidade;
    }

}
