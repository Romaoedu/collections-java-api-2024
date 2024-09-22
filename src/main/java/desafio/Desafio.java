package desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Desafio {


    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//        // Desafio 1 - Mostre a lista na ordem numérica:
//       // numeros.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//
//       // Desafio 2 - Imprima a soma dos números pares da lista:
//        BinaryOperator<Integer> soma = Integer::sum;
//       int novaLista = numeros.stream().filter(n-> n % 2 == 0).reduce(0, soma);
//        System.out.println(novaLista);
//
//        // Desafio 3 - Verifique se todos os números da lista são positivos:
//        numeros.stream().filter(n-> n > 0).forEach(System.out::println);*/

        // Desafio 4 - Remova todos os valores ímpares:
        /* numeros.stream().filter(n-> n % 2 == 0).toList().forEach(System.out::println);*/

        // Desafio 5 - Calcule a média dos números maiores que 5:
     /*   BinaryOperator<Integer> soma = Integer::sum;
      List<Integer> maiorQueCinco = numeros.stream().filter(n-> n > 5).toList();
        double media = maiorQueCinco.stream().mapToDouble(Integer::doubleValue).average().orElse(Double.NaN);
        System.out.println(media);*/

        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
        /*numeros.stream().filter(n-> n> 10).forEach(System.out::println);*/

        // Desafio 7 - Encontrar o segundo número maior da lista:
        // numeros.stream().sorted(Comparator.reverseOrder()).skip(1). limit(1).forEach(System.out::println);

        // Desafio 8 - Somar os dígitos de todos os números da lista:
        /*int somarDigitos =  numeros.stream().map(n-> + 1).reduce(0, Integer::sum);
        System.out.println(somarDigitos);
*/
        //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
       /* List<Integer>listarnumerosDistintos  = numeros.stream().distinct().toList();
        System.out.println(listarnumerosDistintos);*/

        //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        // numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).toList().forEach(System.out::println);

        //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        // numeros.stream().map(n-> n * n).toList().forEach(System.out::println);

        // Encontre o produto de todos os números da lista:
       /* int produto =  numeros.stream().reduce(1, (a, b)-> a * b);
        System.out.println(produto);*/

        // Desafio 13 - Filtrar os números que estão dentro de um intervalo entre 5 e 10:
        // numeros.stream().filter(n-> n > 4 && n <=10).forEach(System.out::println);

        // Desafio 14 - Encontre o maior número primo da lista:
        //numeros.stream().filter(n-> n % 2 == 0).sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);

        // Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        //numeros.stream().filter(n-> n < 0).forEach(System.out::println);

        // Desafio 17 - Filtrar os números primos da lista:
        //numeros.stream().filter(n-> n % 2 == 0).forEach(System.out::println);

        // Desafio 18 - Verifique se todos os números da lista são iguais:
        /*Boolean todosNumerosIguais = numeros.stream().distinct().count() == 1;
        System.out.println(todosNumerosIguais ? "True" : "False");*/

        //Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
        //numeros.stream().filter(n-> n % 3 == 0 || n % 5 == 0).reduce(Integer::sum).stream().forEach(System.out::println);

        Optional<String>optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");
        System.out.println(result);

    }
}
