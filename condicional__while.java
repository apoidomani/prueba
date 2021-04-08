/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalwhile;
import java.util.Scanner;
/**
 *
 * @author pc06
 */
public class condicional__while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numero;
    Scanner entrada= new Scanner (System.in);
       System.out.println("numero del 1 al 100");
    
       numero= entrada.nextInt ();
        int i =1;
       
        while (i <=numero){ 
            System.out.println(i);
            i++;
        }
    }
    }
    

