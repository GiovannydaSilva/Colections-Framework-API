/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author giosi
 */
public class CadastroProdutos {
    
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    
    public void adicionarProduto(long codigo, String nome, double preco, int qtd){
        produtoSet.add(new Produto(codigo, nome, preco, qtd));
    }
    
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
        
    }
    
    
}
