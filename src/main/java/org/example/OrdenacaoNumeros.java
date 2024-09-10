package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdenacaoNumeros {

    List<Integer>listaNumerosInteiros = new ArrayList<>();

    public void adicionarNumero(int numero){

        listaNumerosInteiros.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(listaNumerosInteiros);
    }

    public void ordenarDescendente(){
        Collections.reverse(listaNumerosInteiros);
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(17);
        ordenacaoNumeros.adicionarNumero(45);
        ordenacaoNumeros.adicionarNumero(32);
        ordenacaoNumeros.adicionarNumero(99);

        ordenacaoNumeros.ordenarDescendente();
        System.out.println(ordenacaoNumeros);
    }
}
