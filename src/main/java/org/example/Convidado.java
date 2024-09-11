package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Convidado {


    private String nome;
    private int codigoConvite;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    public String toString(){

        return "Convidado {" +" nome = " + nome + '\'' + " codigoConvite= " + codigoConvite+ '}';

    }

}
