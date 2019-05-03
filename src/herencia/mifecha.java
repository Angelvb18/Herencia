/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Angel
 */
public class mifecha extends Date{
    private Color color;

    public mifecha(Color color, long date) {
        super(date);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public mifecha() {
        super();
    }
    
    @Override
    public String toString() {
        return "mifecha{" + "color=" + color + '}'+super.toString();
    }
    
     
}
