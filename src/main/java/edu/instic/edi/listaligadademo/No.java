/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.instic.edi.listaligadademo;

/**
 *
 * @author D.N.Kasso
 * @param <T>
 */
public class No<T> {
    private T dado;
    private No<T> seguinte;

    public No(T dado) {
        this.dado = dado;
        this.seguinte = null;
    }
    
     public No(T dado, No<T> seguinte) {
        this.dado = dado;
        this.seguinte = seguinte;
    }
    
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getSeguinte() {
        return seguinte;
    }

    public void setSeguinte(No<T> seguinte) {
        this.seguinte = seguinte;
    }

    @Override
    public String toString() {
        return "No{" + "dado=" + dado + ", seguinte=" + seguinte + '}';
    }
    
    
}
