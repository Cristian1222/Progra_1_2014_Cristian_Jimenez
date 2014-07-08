/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author Dinier
 */
public class ejercicio4 {
    
     private int[] vec;
    
    public void cargar(int vecs) {
      
        vec=new int[10];
        for(int f=0;f<10;f++) {
            
            vec[f]=vecs;
        }
    }
    
    public String verificarOrdenado() {
        String a="";
        int ordenado=1;
        for(int f=0;f<9;f++) {
            if (vec[f+1]<vec[f]) {
                  ordenado=0; 
                
            }
            
      
            if(ordenado==1)
            {
           a="Esta ordenado de menor a mayor";
            }
            else
            {
            a="No esta ordenado de menor a mayor";
            }
            
        }
        return a;
    }
    
    
    
}
