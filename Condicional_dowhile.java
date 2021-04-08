/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional_dowhile;
import java.util.Scanner;
/**
 *
 * @author pc06
 */
public class Condicional_dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i=1;
        System.out.println("numero del 1 al 100");
        Scanner  entrada = new Scanner (System.in);
       int numero;
       numero =entrada.nextInt();        
        do {
            System.out.println(i);
            i++;
       }
        while (i<numero );
    }
    
}
