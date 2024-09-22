package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);



        // Usar consumer para imprimir números para no Stream

        numeros.stream().filter(p -> p % 2 == 0).forEach(System.out::println);

    }

    }

