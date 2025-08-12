/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.edii.hashdemo;

/**
 *
 * @author D.N.Kasso
 * @param <K>
 * @param <V>
 */
public class ListaLigada<K, V> {
    
    private No<K, V> cabeca;

    public ListaLigada() {
        cabeca = null;
    }
    
    public void add(K chave, V valor){ 
        No<K, V> ponteiro = cabeca;
        No<K, V> novoNo = new No<>(chave, valor);
        
        if(cabeca == null){
            cabeca = novoNo;
        }
        else{
            while(ponteiro.getSeguinte() != null){ 
                if(ponteiro.getChave().equals(chave)){
                    ponteiro.setValor(valor);
                    return;
                }
                ponteiro = ponteiro.getSeguinte();
            }
            if(ponteiro.getChave().equals(chave)){
                ponteiro.setValor(valor);
            }
            else
                ponteiro.setSeguinte(novoNo);
        }
    }
    
    public V obter(K chave) {
        
        for (No<K, V> ponteiro = cabeca; ponteiro != null; ponteiro = ponteiro.getSeguinte()) {
            if (chave.equals(ponteiro.getChave())) { 
                return ponteiro.getValor();
            }
        }
        return null; 
    }
    
    private int extensao(){
        int c = 0;
        No<K, V> ponteiro = cabeca;
        while( ponteiro != null ){
            c++;
            ponteiro = ponteiro.getSeguinte();
        }
        return c;
    }
    public V remover(K chave){
        V valor = null;
        if(cabeca == null) return null;
        if( extensao() > 1 ){
            if(cabeca.getChave().equals(chave)){
                valor = cabeca.getValor();
                cabeca = cabeca.getSeguinte();
            }
            else{
                No<K, V> ponteiro = cabeca;
                while( ponteiro.getSeguinte().getChave() != chave ){
                    ponteiro = ponteiro.getSeguinte();
                }
                valor = ponteiro.getSeguinte().getValor();
                ponteiro.setSeguinte(ponteiro.getSeguinte().getSeguinte());        
            }
        }
        else{
                if(cabeca.getChave().equals(chave)){
                    valor = cabeca.getValor();
                    cabeca = null;
                }
        }
        return valor;
    }
    @Override
    public String toString() {
            No<K, V> current = cabeca;
            StringBuilder result = new StringBuilder();

            while (current != null) {
                result.append("{ ")
                        .append(String.format("%-1s %-1s", current.getChave().toString(), current.getValor().toString()))
                        .append(" } ");

                current = current.getSeguinte();
            }

            return result + "\n";
    }

}
