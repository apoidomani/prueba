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
public class condicional_dias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dias= new Scanner (System.in);
        
        System.out.println("ingrese un numero para saber que dia es");
        
        int dia=dias.nextInt();
        
        String nomdia;
        switch(dia)
          {  
          case 1: nomdia= "lunes";
                  break;
          case 2: nomdia= "martes";
                  break;
          case 3: nomdia= "miercoles";
                  break;
          case 4: nomdia= "jueves";
                  break;
          case 5: nomdia= "viernes";
                  break;
          case 6: nomdia= "sabado";
                  break;
          case 7: nomdia= "domingo";
                  break;
          default: nomdia="dia invalido";
                  break;
        }
        System.out.println(nomdia);
        
            
        
    }
    
}
