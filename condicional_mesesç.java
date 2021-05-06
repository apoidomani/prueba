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
public class condicional_mesesç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner meses= new Scanner (System.in);
        
        System.out.println("ingrese un numero para saber que mes es");
        
        int dia=meses.nextInt();
        
        String nommes;
        switch(mes); { 
            
          case 1: nommes= "enero";
                  break;
          case 2: nommes= "febrero";
                  break;
          case 3: nommes= "marzo";
                  break;
          case 4: nommes= "abril";
                  break;
          case 5: nommes= "mayo";
                  break;
          case 6: nommes= "junio";
                  break;
          case 7: nommes= "julio";
                  break;
          case 8: nommes= "agosto";
                  break;
          case 9: nommes= "septiembre";
                  break;
          case 10: nommes= "octubre";
                  break;
          case 11: nommes= "noviembre";
                  break;
          case 12: nommes= "diciembre";
                  break;
          default: nommes="mes invalido";
                  break;
        }
        System.out.println(nommes);
        
            
        
    }
    
}
    
    

