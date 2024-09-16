package MAP;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class EstoqueProdutos {

    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();

    }

    public void adicionarProduto(Long code, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(code, new Produto(code, nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque() {
        double valorTotal = 0d;

        if (!estoqueProdutosMap.isEmpty()){
            for (Produto produto : estoqueProdutosMap.values()){
                valorTotal += produto.getQuantidade()*produto.getPreco();
            }
        }
                return valorTotal;
    }

    public Produto obterMaiorValor(){

        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MAX_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                if (produto.getPreco()>maiorPreco){
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }



    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "Mochila", 1, 50.0);
        estoqueProdutos.adicionarProduto(2L, "Camisa verde musgo", 2, 125.0);


        System.out.println(estoqueProdutos);
    }

}
