import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc06
 */
public class ejercicio3Poidomani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        String nombrealumno;
        double evaluacion1;
        double evaluacion2;
        double evaluacionfinal;
        System.out.println("nombre del alumno");
        nombrealumno= entrada.nextLine ();
        System.out.println("nota 1 evaluacion");
        evaluacion1= entrada.nextDouble();
        System.out.println("nota 2 evalucion");
        evaluacion2= entrada.nextDouble();
        evaluacionfinal= (evaluacion1 + evaluacion2/2);
        System.out.println("nota final:" + evaluacionfinal);
    }
    
}
