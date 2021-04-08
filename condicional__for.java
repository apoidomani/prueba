/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional_for;
import java.util.Scanner;

/**
 *
 * @author pc06
 */
public class condicional__for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner entrada= new Scanner (System.in);
        System.out.println("ingrese numero del 1 al 100");
        numero = entrada.nextInt(); 
        for (int i=0; i<numero; i++)
            System.out.println(i);
    }
    
}
