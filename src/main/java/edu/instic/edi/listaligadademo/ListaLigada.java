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
public class ListaLigada<T>{
    private No<T> cabeca;
    
    public void adicionar(T dado){
        No<T> novoNo = new No<>(dado);
        if(cabeca == null)
            this.cabeca = novoNo;
        else{
            novoNo.setSeguinte(cabeca); // para ligar
            this.cabeca = novoNo;
        }
    }
    
//    public void adicionarPrincipio(T dado){
//        No<T> novoNo = new No<>(dado);
//        if(this.cabeca != null){
//            novoNo.setSeguinte(cabeca); // para ligar
//            this.cabeca = novoNo;
//        }      
//    }
    public void adicionarFim(T dado){
        No<T> novoNo = new No<>(dado);
        No<T> cursor = this.cabeca;
        
        while(cursor.getSeguinte() != null){
            cursor = cursor.getSeguinte();
        }
        cursor.setSeguinte(novoNo);
    }
    
    public int extensao(){
        int cont = 1;
        if(this.cabeca == null)
            return 0;
        No<T> cursor = this.cabeca;
        while(cursor.getSeguinte() != null){
            cursor = cursor.getSeguinte();
            cont++;
        }
        return cont;
    }
    
    public void eliminarEmPares(){
        int c = 1;
        if( this.extensao() >= 1 ){
            this.cabeca = this.cabeca.getSeguinte();
            No<T> ponteiro = cabeca;
            while( c < this.extensao() ){
                ponteiro.setSeguinte(ponteiro.getSeguinte().getSeguinte()); //Liga com o proximo do proximo
                ponteiro = ponteiro.getSeguinte(); // avanca o ponteiro uma vez, para o proximo no.
                c++;
            }
        }
    }
    
    public void eliminarEmParesA(){
        int c = 1;
        int tamanho = this.extensao();
        if( tamanho >= 1 ){
            this.cabeca = this.cabeca.getSeguinte();
            tamanho--;
            No<T> ponteiro = cabeca;
            while( c < tamanho ){
                ponteiro.setSeguinte(ponteiro.getSeguinte().getSeguinte());
                ponteiro = ponteiro.getSeguinte();
                c++;
                tamanho--;
            }
        }
    }
    public void eliminarEmImpares(){
        int c = 0;     
        if( this.extensao() >= 2 ){
            No<T> ponteiro = cabeca;
            while( c <= this.extensao()){
                ponteiro.setSeguinte(ponteiro.getSeguinte().getSeguinte());
                ponteiro = ponteiro.getSeguinte();
                c += 2;
            }
        }
    }
    public void eliminarEmImparesA(){
        int c = 0;   
        int tamanho = this.extensao();
        if( tamanho >= 2 ){
            No<T> ponteiro = cabeca;
            while( c <= tamanho ){
                ponteiro.setSeguinte(ponteiro.getSeguinte().getSeguinte());
                ponteiro = ponteiro.getSeguinte();
                c += 2;
                tamanho--;
            }
        }
    }
    //sabendo que a lista tem pelo menos dois elementos
    public void movimentarMetades(){
        if( this.extensao() >= 2 ){
            No<T> p1 = this.cabeca;
            int tamanho = this.extensao();
            int metade = tamanho / 2;
            int c = 0;
            while( c < metade - 1 ){
                p1 = p1.getSeguinte();
                c++;
            }
            No<T> p2 = p1;
            while( c < tamanho - 1 ){
                p2 = p2.getSeguinte();
                c++;
            }         
            p2.setSeguinte(this.cabeca);
            this.cabeca = p1.getSeguinte();
            p1.setSeguinte(null);
        }
    }
    
    public void movimentarMetadesB(){    
        if( this.extensao() >= 2 ){
            No<T> last = this.cabeca;
            No<T> antesMid = this.cabeca;
            No<T> mid = this.cabeca;
            int pos = 1;
            int tamanho = this.extensao();
            while( last.getSeguinte() != null ){
                last = last.getSeguinte();
                pos++;
                if( pos == tamanho / 2 + 1 )
                    mid = last;
                else if( pos == tamanho / 2 )
                    antesMid = last;
            }
            last.setSeguinte(this.cabeca);
            this.cabeca = mid;
            antesMid.setSeguinte(null);
        }
    }
    
    public void mov(){
        int m = this.extensao() / 2;
        No<T> ponteiro = cabeca;
        while(ponteiro.getSeguinte() != null){
            ponteiro = ponteiro.getSeguinte();
        }
        ponteiro.setSeguinte(cabeca);
        ponteiro = cabeca;
        int c = 0;
        while( c < m - 1){
            ponteiro = ponteiro.getSeguinte();
            c++;
        }
        cabeca = ponteiro.getSeguinte();
        ponteiro.setSeguinte(null);
    }
    
    public boolean eliminarSeEPalindromo(int pos){
        int tamanho = this.extensao();
        if( pos >= 0 && pos < tamanho ){
            if( tamanho >= 3 ){
               if( pos == 0 || pos == tamanho - 1 )
                   return false;
               No<T> noExtremo1 = this.cabeca;
               No<T> noExtremo2 = noExtremo1.getSeguinte().getSeguinte();
               int posicao = 0;
               while( posicao < pos - 1 ){
                   noExtremo1 = noExtremo1.getSeguinte();
                   noExtremo2 = noExtremo2.getSeguinte();
                   posicao++;
               }
               String dadoExtremo1 = String.valueOf(noExtremo1.getDado());
               String dadoExtremo2 = String.valueOf(noExtremo2.getDado());
               if( dadoExtremo1.compareToIgnoreCase(dadoExtremo2) == 0 ){
                   noExtremo1.setSeguinte(noExtremo2);
                   return true;
               }
           }
        }
        return false;
    }
    
    public boolean eliminarSeEPalindromoB(int pos){
        
        int tamanho = this.extensao();
        if( pos >= 0 && pos < tamanho ){
            if( tamanho >= 3 ){
               if( pos == 0 || pos == tamanho - 1 )
                   return false;
               No<T> noExtremo1 = this.cabeca;
               No<T> noExtremo2 = noExtremo1.getSeguinte().getSeguinte();
               String dadoExtremo1;
               String dadoExtremo2;
               int posicao = 0;
               while( noExtremo1 != null ){
                   dadoExtremo1 = String.valueOf(noExtremo1.getDado());
                   dadoExtremo2 = String.valueOf(noExtremo2.getDado());
                   if( posicao == pos - 1 &&  dadoExtremo1.compareToIgnoreCase(dadoExtremo2) == 0 ){
                       noExtremo1.setSeguinte(noExtremo2);
                       return true;
                   }
                   noExtremo1 = noExtremo1.getSeguinte();
                   noExtremo2 = noExtremo2.getSeguinte();
                   posicao++;
               }
           }
        }
        return false;
    }
    
     public boolean eliminarSeEPalindromoC(int pos){
        
        int tamanho = this.extensao();
        if( pos >= 0 && pos < tamanho ){
            if( tamanho >= 3 ){
               if( pos == 0 || pos == tamanho - 1 )
                   return false;
               No<T> noExtremo1 = this.cabeca;
               for( int i = 0; i < pos - 1; i++ ){
                   noExtremo1 = noExtremo1.getSeguinte();
               }
               No<T> noExtremo2 = noExtremo1.getSeguinte().getSeguinte();
               String dadoExtremo1 = String.valueOf(noExtremo1.getDado());
               String dadoExtremo2 = String.valueOf(noExtremo2.getDado());
               if( dadoExtremo1.compareToIgnoreCase(dadoExtremo2) == 0 ){
                   noExtremo1.setSeguinte(noExtremo2);
                   return true;
               }
           }
        }
        return false;
    }
     
    @Override
    public String toString() {
        return "ListaLigada{" + "cabeca=" + cabeca + '}';
    }
    
    
}
