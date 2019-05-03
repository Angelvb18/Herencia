/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.awt.Color;

/**
 *
 * @author Angel
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Herncia es un 
         que es ? 
        reutilizar una clase ya existente para crear una mejor
        Herenia simple es en la que una clase solo puede tener un padre la cual se le llama super indirect 
        herencia multiple es cuando puede heredar de varias clases
        - pasos para herencia 
           o|1.modificar la cabecrea de clase hija incluyendo la palabra Extends y el nombre de la super clase indirecta(padre) class Alumno Extends persona
           b|2.modificar los constructires de ka clase inuscando alguna de los constructore de la superclase super();
           ----------------------------------------------------------------------------------------------------------------
         3.en conflicto de interes se usa super.
        
        */
        // long date son los milesegundos trancurridos desde el primero de 1/1/1970 000000
        //una puper clase d/i , puede ser instanciada a cualquiera de sus sub clases d/i
        mifecha f = new mifecha();
        f.setColor(Color.YELLOW);
        System.out.println(f);
        
    }
        
    
}
