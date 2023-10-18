/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author giosi
 */
public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    
//    public List<Pessoa> ordenarPorNome(Pessoa p){
//        List<Pessoa> pessoaPorNome = new ArrayList<>();
//        Collections.sort(pessoaList, p.getNome());
//    }
    
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
    
    public static void main(String[] args) {
        OrdenacaoPessoa op = new OrdenacaoPessoa();
        op.adicionarPessoa("Sandro", 14, 1.44);
        op.adicionarPessoa("Cristiano", 12, 1.42);
        op.adicionarPessoa("Sérgio", 17, 1.72);
        op.adicionarPessoa("Alexandre", 7, 1.35);
        op.adicionarPessoa("Naya", 6, 1.20);
        op.adicionarPessoa("David", 5, 1.18);
        op.adicionarPessoa("Jorge", 15, 1.50);
        
        System.out.println(op.ordenarPorAltura());
        System.out.println(op.ordenarPorIdade());
        
    }
    
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}
