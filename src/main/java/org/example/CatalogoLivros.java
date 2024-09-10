package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatalogoLivros {

    List<Livro> catalogo = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        catalogo.add(livro);
    }

    public List<Livro> pesquisaAutor(String autor) {

        List<Livro> list = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.getAutor().equals(autor))
                list.add(livro);
        }
        return list;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoPublicacao) {
        List<Livro> list = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (anoPublicacao == livro.getAnoPublicacao())
                list.add(livro);
        }
        return list;
    }

    public Livro pesquisarPorTitulo(String titulo) {

        for (Livro livro : catalogo) {
            if (livro.getTitulo().equals(titulo)){
                System.out.println(livro);
                break;
            }
        }
        return null;
    }
}