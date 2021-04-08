/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional_multiplo;
import java.util.Scanner;
/**
 *
 * @author pc06
 */
public class condicional_multiploo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        int numero;
        System.out.println("introduce numero de entrada");
        numero = entrada.nextInt();
        if (numero%10==0) {
            System.out.println("multiplo");
        }
        else {
                
                
            System.out.println("No es multiplo");
                }
    }
   } 

    
    

