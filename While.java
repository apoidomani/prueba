/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalespoidomani;

/**
 *
 * @author pc06
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=1;
        while (num<=100){
            if(num%2==0||num%3==0){
                    System.out.println(num);
            num++;
        }
    }
    }
}
    
