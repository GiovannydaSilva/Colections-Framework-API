/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author giosi
 */
public class AgendaContactos {
    
    private Set<Contacto> contactoSet;

    public AgendaContactos() {
        this.contactoSet = new HashSet<>();
    }
    
    public void adicionarContacto(String nome, int numero){
        contactoSet.add(new Contacto(nome, numero));
    }
    
    public void exibirContactos(){
        System.out.println(contactoSet);
    }
    
    public Set<Contacto> pesquisarPorNome(String nome){
        Set<Contacto> contactosPorNome = new HashSet<>();
        for (Contacto c : contactosPorNome) {
            if (c.getNome().startsWith(nome)) {
                contactosPorNome.add(c);
            }
        }
        return contactosPorNome;
    }
    
    public Contacto atualizarNumeroContacto(String nome, int novoNumero) {
        Contacto contactoAtualizado = null;
            for (Contacto c : contactoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contactoAtualizado = c;
                    break;
                }
        }
        return contactoAtualizado;
    }

}
