/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_rana_saltarina;

/**
 *
 * @author jean
 */
public class prueba {
    
    
    
    
    public static void main(String[] args){
        
        double [][] angulos = new double[10][2];
        
        angulos[0][0] = 1.0;
        angulos[0][1] = 0.0;
        
        angulos[1][0] = 0.98;
        angulos[1][1] = 0.17;
        
        angulos[2][0] = 0.93;
        angulos[2][1] = 0.34;
        
        angulos[3][0] = 0.88;
        angulos[3][1] = 0.5;
        
        angulos[4][0] = 0.76;
        angulos[4][1] = 0.64;
        
        angulos[5][0] = 0.64;
        angulos[5][1] = 0.76;
        
        angulos[6][0] = 0.5;
        angulos[6][1] = 0.86;
        
        angulos[7][0] = 0.3;
        angulos[7][1] = 0.93;
        
        angulos[8][0] = 0.17;
        angulos[8][1] = 0.98;
        
        angulos[9][0] = 0.0;
        angulos[9][1] = 1;
        
        
        int r = 90;
        
        int xAux = 300+r;
        int yAux = 300;
        
        int x,y;
        
        for(int i = 9; i>=0;i-- ){
            
            x = (int)(r*angulos[i][0])+xAux;
            y = (int)(r*angulos[i][1])+yAux;
            
            System.out.println("punto : ("+x+","+y+")");
            
        }
    }
}
