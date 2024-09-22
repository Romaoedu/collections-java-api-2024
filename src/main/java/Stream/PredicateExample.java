package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        List<String>palavras = Arrays.asList("java", "kotlin", "python", "javascrypt", "c", "go", "ruby");

        //Criar um precidate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String>maisCincoPalavras = palavra -> palavra.length() > 5;

        //Usar o Steam para filtrar as palavras com mais de 5 caracteres e em seguida
        // imprimir cada palavra que passou no filtro
        palavras.stream().filter(maisCincoPalavras).forEach(System.out::println);

    }
}
