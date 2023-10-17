/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import sun.applet.Main;

/**
 *
 * @author giosi
 */
public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }
    
    public int obterTotalTarefas(){
        return tarefaList.size();
    }
    
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    
    public static void main(String[] args) {
        ListaTarefa lt = new ListaTarefa();
        
        lt.adicionarTarefa("Tarefa 1");
        lt.adicionarTarefa("Tarefa 2");
        lt.adicionarTarefa("Tarefa 3");
        System.out.println("O nº total de tarefas no elemento é: " + lt.obterTotalTarefas());
        lt.obterDescricoesTarefas();
    }
}
