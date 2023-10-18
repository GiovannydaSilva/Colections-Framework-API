/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giosi
 */
public class CatalogoLivros {
    
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {

            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;

    }
    
    public List<Livro> PesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        
        return livrosPorIntervaloAno;
    }
    
    public Livro pesquisarPorTitulo(String titulo){
        Livro LivroPorTitulo = null;
         if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    LivroPorTitulo = l;
                    break;
                }
            }
         } 
        return LivroPorTitulo;
    }
    
    public static void main(String[] args) {
        CatalogoLivros cl = new CatalogoLivros();
        cl.adicionarLivro("Livro 1", "Autor 1", 2000);
        cl.adicionarLivro("Livro 2", "Autor 2", 2001);
        cl.adicionarLivro("Livro 3", "Autor 3", 2002);
        cl.adicionarLivro("Livro 4", "Autor 4", 2003);
        cl.adicionarLivro("Livro 5", "Autor 5", 2004);
        cl.adicionarLivro("Livro 6", "Autor 6", 2005);
        cl.pesquisarPorAutor("Autor 1");
        System.out.println( cl.PesquisarPorIntervaloAno(2002, 2004));
    }
}
