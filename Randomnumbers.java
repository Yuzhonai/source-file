/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author yusuph
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] number = new int [3][5];
         for (int i=0; i<3; i++) 
        {
            for (int j=0; j<5; j++){
              number[i][j]= (int)(Math.random()*10);
              System.out.print(number[i][j] );
            }
            System.out.println( );
        }
    }
}