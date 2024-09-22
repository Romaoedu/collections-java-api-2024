package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {

        //Criar uma lista de números inteiros
        List<Integer>listaNumerosInteiros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar a function com expressão lambida para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os números no Steam e armazenalos em outra lista
        List<Integer>numerosDobrados = listaNumerosInteiros.stream().map(dobrar).toList();

        numerosDobrados.forEach(System.out::println);
    }
}
