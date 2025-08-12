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
public class No<K, V> {
    
    private K chave;
    private V valor;
    private No<K, V> seguinte;

    public No(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
        this.seguinte = null;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public No<K, V> getSeguinte() {
        return seguinte;
    }

    public void setSeguinte(No<K, V> seguinte) {
        this.seguinte = seguinte;
    }
}
