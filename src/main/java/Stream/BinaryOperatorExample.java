package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        List<Integer>numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o BinaryOperator com a expressão lambda para somar dois números inteiros

        BinaryOperator<Integer> soma = Integer::sum;

        //Usar o BinaryOperator para somar todos os números no Stream
     /*   int resultado = numeros.stream().reduce(0,soma);*/

        System.out.println(numeros.stream().reduce(0,Integer::sum));
    }


}
