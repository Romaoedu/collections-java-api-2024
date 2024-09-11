package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public int contarConvidados(){

        return convidadoSet.size();
    }

    public void removerConvidadoPorConvite(int codigoConvite){

        for (Convidado convidado : convidadoSet){
            if (convidado.getCodigoConvite() == codigoConvite)
                convidadoSet.remove(convidado);
            break;
        }

    }
    public void exibirConvidados(){
        for (Convidado convidado : convidadoSet){
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Eduardo", 1);
        conjuntoConvidados.adicionarConvidado("Mateus", 2);
        conjuntoConvidados.adicionarConvidado("Wallace", 3);

       // conjuntoConvidados.removerConvidadoPorConvite(2);
        conjuntoConvidados.exibirConvidados();
    }



}
