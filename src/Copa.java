
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Copa extends Liquido implements Graduable{
    
    private Graduable alcohol;
    private Liquido mezcla;

    public Copa(Graduable alcohol, Liquido mezcla) {
        super(mezcla.litros, mezcla.color);
        Liquido a = (Liquido) alcohol;
        Liquido m = (Liquido) mezcla;
        super.setColor(a.color + "-" + m.color);
        super.setLitros(a.litros + m.litros);
        this.alcohol = alcohol;
        this.mezcla = mezcla;
    }

    
    
    
    
    @Override
    public Double getGrados() {
        return (this.getGrados() * mezcla.getLitros()) / this.litros;
    }

    @Override
    public Liquido mezclar(Liquido liquido) {
        try {
            throw new NoSePuedeMezclarException("No se puede mezclar"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (NoSePuedeMezclarException ex) {
            return null;
        }
    }

    public Graduable getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Graduable alcohol) {
        this.alcohol = alcohol;
    }

    public Liquido getMezcla() {
        return mezcla;
    }

    public void setMezcla(Liquido mezcla) {
        this.mezcla = mezcla;
    }
    
    
    
    
}
