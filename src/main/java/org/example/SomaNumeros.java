package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SomaNumeros {

    List<Integer>listNumber = new ArrayList<>();

    public List<Integer> adicionarNumero (int numero){
        listNumber.add(numero);
        return listNumber;
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : listNumber){
            soma = soma + numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){

        int maiorNumero = 0;
        for (Integer numero: listNumber){
            if (numero > maiorNumero)
                maiorNumero = numero;
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){

        int menorNumero = 0;
        for (Integer numero: listNumber){
            if (numero < menorNumero)
                menorNumero = numero;
        }
        return menorNumero;
    }

    public void  exibirNumeros(){

        for (Integer numero : listNumber){
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(17);
        somaNumeros.adicionarNumero(56);
        somaNumeros.adicionarNumero(78);
        somaNumeros.adicionarNumero(12344);
        somaNumeros.adicionarNumero(987);
        somaNumeros.adicionarNumero(-2);

        System.out.println(somaNumeros.encontrarMenorNumero());


      //  somaNumeros.exibirNumeros();


    }

}

