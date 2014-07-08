/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Estudiante
 */
public class ejercicio2 {
     private int[] vecs1;
    private int[] vecs2;
    private int[] vecsuma;
  
    public void cargar(int vecsa) { 
      vecs1=new int[4];
        for(int f=0;f<vecs1.length;f++) {
          
            
                vecs1[f]= vecsa;
                break;
            }
    }
    public void cargar2(int vecss)
    {
        vecs2=new int[4];
        for(int f=0;f<vecs2.length;f++) {
          
            
                vecs2[f]= vecss;
                break;
            
        }
    }
   
 
    public int vecsumar()
           
    {
        vecsuma=new int[4];
        int vs=0;
        for (int f = 0; f < 4; f++) {
            vecsuma[f]=vecs1[f]+vecs2[f];
            vs=vecsuma[f];
          
        }
        for (int f = 0; f < 4; f++) {
           vs=vecsuma[f]; 
        }
  return vs;
    
    }
    
    
    
}
