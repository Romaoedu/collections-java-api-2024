package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class AgendaContatos {

    Set<Contato> listaContato;

    public AgendaContatos(){
        this.listaContato = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){

        Contato contato = new Contato(nome, numeroTelefone);
        listaContato.add(contato);
    }

    public void exibirContato(){
        for (Contato contato : listaContato)
            System.out.println(contato);
    }

    public Set<Contato> pesquisaPorNome( String nome){

        Set<Contato>contatoPorNome = new HashSet<>();
        for (Contato contato : listaContato){
            if (contato.getNome().startsWith(nome)){
                contatoPorNome.add(contato);
            }
        }
            return contatoPorNome;
            }


    public void atualizarNumeroContato(String nome, int novoNumero){

        for (Contato contato : listaContato){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumeroTelefone(novoNumero);
                break;
            }

        }

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Eduardo", 979008112);
        agendaContatos.adicionarContato("Eduardo", 979008112);
        agendaContatos.adicionarContato("Joao", 979065434);
        agendaContatos.adicionarContato("Oliver", 976548176);

        agendaContatos.atualizarNumeroContato("Oliver", 1111111);

        System.out.println(agendaContatos.pesquisaPorNome("Eduardo"));
    }

}
