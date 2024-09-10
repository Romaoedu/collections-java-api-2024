package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public class ListaTarefas {

   private List<Tarefa> toDo;


   public ListaTarefas(){
       this.toDo = new ArrayList<>();
   }

   public void adicionarTarefa(String descricao){
       toDo.add(new Tarefa(descricao));
   }

   public void removerTarefa(String descricao){
       List<Tarefa> tarefaRemoviveis = new ArrayList<>();

       for (Tarefa t : toDo){
            if (t.getDescricao().equals(descricao)){
                tarefaRemoviveis.add(t);
            }
       }

       toDo.removeAll(tarefaRemoviveis);
   }

   public Integer obterNumeroTotalTarefas(){
       return toDo.size();
   }

   public void obeterDescricaoTarefas(){

       if (toDo.size() > 0){
           for (Tarefa t : toDo){
               System.out.println(t.getDescricao());
           }
       } else
           System.out.println("Não existe tarefas a serem exibidas");
   }



}



