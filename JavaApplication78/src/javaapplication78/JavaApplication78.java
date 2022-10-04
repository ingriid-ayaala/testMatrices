/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication78;

/**
 *
 * @author ingri
 */
public class JavaApplication78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]= new int[3][4];
        System.out.println("numeros 0 "+ matriz);
        
        matriz [0][0] = 15;
        matriz [1][1]= 3;
        matriz [2][2]= 5;
        
            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j]=alea(0,9);
                }
           }
            System.out.println("VISUALIZAR LA TABLA");
            for (int i = 0; i < matriz.length; i++){//visualizar
                
                for (int j = 0; j < matriz[0].length; j++){   
                System.out.print("\t"+matriz[i][j]);
                }
                System.out.println("");
            }
        }
        
        
        public static int alea(int li, int ls){//función de JAVA
            return (int)((Math.round(Math.random()*(ls-li))+li));
        }
    
}
