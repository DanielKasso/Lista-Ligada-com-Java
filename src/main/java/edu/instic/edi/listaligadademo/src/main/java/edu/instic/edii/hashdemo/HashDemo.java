/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.instic.edii.hashdemo;





/**
 *
 * @author D.N.Kasso
 */
public class HashDemo {

    public static void main(String[] args) {
        Hash<String, String> hash = new Hash<>(7);
     
        hash.adicionar("Angola", "1975");
        hash.adicionar("Senegal", "2002");
        hash.adicionar("Namibia", "1968");
        hash.adicionar("Egipto", "2001");
        hash.adicionar("Marrocos", "1998");
        hash.adicionar("Libia", "1979");
        hash.adicionar("Tunisia", "1998");
        hash.adicionar("Senegal", "1994"); // duplicado: valor sera actualizado
        hash.adicionar("Etiopia", "2004");
        hash.adicionar("Zambia", "1993");
        hash.adicionar("RDC", "2002");
        hash.adicionar("Ruanda", "1998");
        hash.adicionar("Nigeria", "1976");
        hash.adicionar("Quenia", "1998");  
        hash.adicionar("Gana", "2002");

        System.out.println("Hash Senegal: "+hash.hash("Senegal"));
        System.out.println("Tamanho da tabela: " + hash.getTamanho());
        System.out.println("Quantidade real:" + hash.getQuantReal());
        System.out.println();
        hash.imprimir();
        
        System.out.println("Valor removido: " +hash.remover("Zambia"));
        System.out.println("Depois de remover");
        System.out.println("Quantidade real: " + hash.getQuantReal());
        hash.imprimir();
        
        
    }
}
 