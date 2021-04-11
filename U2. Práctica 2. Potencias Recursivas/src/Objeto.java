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
        
    public int Potencia(int x, int y){
        
        if(y == 1){
           x = x * 1;
           return x;  
        }
        y--;
        x = x * Potencia(x, y);
        return x;
    }

}
