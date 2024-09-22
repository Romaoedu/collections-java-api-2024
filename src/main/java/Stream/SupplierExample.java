package Stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {



    public static void main(String[] args) {
        // Usar o Supplier oara obter uma lista com 5 saudações
        Supplier<String> saudacao = () -> "Olá seja bem vindo";

        //Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaucacoes = Stream.generate(saudacao).limit(5).toList();

        listaSaucacoes.stream().forEach(System.out::println);
    }

}

