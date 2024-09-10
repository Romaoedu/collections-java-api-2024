package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrdenacaoPessoas {

    List<Pessoa> listaPessoas = new ArrayList<>();

    public void adicionarPessoas(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade(){
        listaPessoas.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
    }


    public void ordenarPorAltura(){

        listaPessoas.sort(Comparator.comparingDouble(Pessoa::getAltura).reversed());
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoas("Eduardo", 34, 1.66);
        ordenacaoPessoas.adicionarPessoas("João", 61, 1.80);
        ordenacaoPessoas.adicionarPessoas("Pedro", 14, 1.52);
        ordenacaoPessoas.adicionarPessoas("Maria", 25, 1.78);

        ordenacaoPessoas.ordenarPorIdade();
       // ordenacaoPessoas.ordenarPorAltura();

        System.out.println(ordenacaoPessoas);
    }
}
