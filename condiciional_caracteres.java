/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;

import java.util.Scanner;

/**
 *
 * @author pc06
 */
public class condiciional_caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner entrada= new Scanner (System.in);
          char caracter;
        
        System.out.println("ingrese un caracter y dire si es vocal");
        
        caracter=entrada.next().charAt(0);
        
        String nomdia;
        switch(caracter)
          {  
          case 'a': System.out.println("es vocal:A");
                  break;
          case 'e': System.out.println("es vocal; E");
                  break;
          case 'i': System.out.println("es vocal: I");
                  break;
          case 'o': System.out.println("es vocal: O");
                  break;
          case 'u': System.out.println("es vocal: U");
                  break;
          
          default: nomdia="caracter invalido";
                  break;
        }
       
        
            
        
    }
    
}
    
    

