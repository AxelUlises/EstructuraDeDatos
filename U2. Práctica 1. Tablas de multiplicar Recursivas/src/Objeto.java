/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axelulises
 */
public class Objeto {
    
    public Objeto() {
    }
    
    public int TablasMultiplicar(int a, int b){
        int num = a;  
        if(a>0 && b>0){
           b--;
           a = a + TablasMultiplicar(a, b);
           System.out.println(num + "X" + (b+1) + " = " + a); 
           return a;  
        }
        return 0;
    }
}
