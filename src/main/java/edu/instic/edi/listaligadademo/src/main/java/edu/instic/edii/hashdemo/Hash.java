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
public class Hash<K, V> {
    
    private int tamanho;
    private int quantReal; 
    private ListaLigada<K, V>[] tabela; 

    public Hash() {
        this(997);
    }
    public Hash(int tamanho) {
        this.tamanho = tamanho;
        this.tabela = new ListaLigada[tamanho];
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new ListaLigada<>();
        }
    }
    public int hash(K chave) {
        int hashCod=chave.hashCode();
	return Math.abs(hashCod % tamanho);
    } 

    public V procurar(K chave) {
        return tabela[hash(chave)].obter(chave);
    }
    
    public void adicionar(K chave, V valor) {
        tabela[hash(chave)].add(chave, valor);
        quantReal++;   
    }
    
    public V remover(K chave){ 
        V valor = tabela[hash(chave)].remover(chave);
        quantReal--;
        return valor;
    }
    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("[" + i + "] " + tabela[i]);
        }
    }
    public int getQuantReal() {
        return quantReal;
    }

    public int getTamanho() {
        return tamanho;
    }
}
