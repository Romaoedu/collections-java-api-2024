package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contato {

    private String nome;
    private int numeroTelefone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return numeroTelefone == contato.numeroTelefone && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroTelefone);
    }
}
