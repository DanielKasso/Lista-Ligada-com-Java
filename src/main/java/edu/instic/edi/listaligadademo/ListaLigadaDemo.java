/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.instic.edi.listaligadademo;

/**
 *
 * @author D.N.Kasso
 */
public class ListaLigadaDemo {

    public static void main(String[] args) {
       
//        ListaLigada<Integer> lista = new ListaLigada<>();
//        lista.adicionar(14);
//        lista.adicionar(13);
//        lista.adicionar(14);
//        lista.adicionar(14);
        ListaLigada<String> lista = new ListaLigada<>();
        lista.adicionar("Daniel");
        lista.adicionar("Pedro");
        lista.adicionar("Danieljhj");
        lista.adicionar("Daniel");
        
        System.out.println(lista.toString());
        System.out.println(lista.eliminarSeEPalindromoC(2));
        System.out.println(lista.toString());
//        lista.adicionar(15);
//        lista.adicionar(16);
//        lista.adicionar(17);
//        lista.adicionar(18);
        //lista.adicionar(19);
//        System.out.println("Antes de movimentar");
//        System.out.println(lista.toString());
//        lista.movimentarMetadesB();
//        System.out.println("Depois de movimentar");
//        System.out.println(lista.toString());
//        
//        System.out.println("Tamanho: " +lista.extensao());
//        System.out.println(lista.toString());
////        lista.adicionarFim(13);
//        lista.eliminarEmImpares();
//        //lista.eliminarEmPares();
//            
//        System.out.println(lista.toString());
//        System.out.println("Tamanho: " +lista.extensao());
        
    }
    
}
