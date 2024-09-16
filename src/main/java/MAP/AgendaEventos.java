package MAP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.*;

@Data
@AllArgsConstructor

public class AgendaEventos {

    Map<LocalDate, Evento> listaEventos;

    public AgendaEventos(){
        this.listaEventos =new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){

        listaEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){

        Map<LocalDate, Evento>eventoTreeMap = new TreeMap<>(listaEventos);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){


        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento>eventoTreeMap = new TreeMap<>(listaEventos);
        for (Map.Entry<LocalDate, Evento> entry:eventoTreeMap.entrySet()){

            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximoEvento = entry.getValue();
                proximaData = entry.getKey();
                System.out.println("O proximo evento " + proximoEvento +" Acontecera na data " + proximaData);
                break;
            }

        }

    }

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 16), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 29), "Evento 2", "Atração 2");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }


}
