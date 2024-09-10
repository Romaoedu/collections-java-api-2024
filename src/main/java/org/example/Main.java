package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

 //Lista de Tarefas*

/*ListaTarefas list = new ListaTarefas();
list.adicionarTarefa("Tarefa 1");
list.adicionarTarefa("Emitir NF");
list.adicionarTarefa("Investir");
list.adicionarTarefa("Comprar coisa");

list.removerTarefa("Comprar coisa");


list.obeterDescricaoTarefas();

*/

        //Carrinho de Compras*
        /*CarrinhoDeCompras car = new CarrinhoDeCompras();
        car.adicionarItem("Manteiga", 5.69, 1);
        car.adicionarItem("Ovos", 12.0, 1);
        car.adicionarItem("Pão", 6.69, 3);

        car.removeItem("Ovos");

        car.exibirItens();
        System.out.println(car.calcularValorCarrinho());*/


        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O guia do mochileiros das galaxias", "Douglas Adams", 1979);
        catalogoLivros.adicionarLivro("O restaurante no fim do universo", "Douglas Adams", 1980);
        catalogoLivros.adicionarLivro(" universo", "Douglas Adams", 1980);
        catalogoLivros.adicionarLivro(" universo", "Douglas Adams", 1980);
        catalogoLivros.pesquisarPorTitulo(" universo");
    }

}