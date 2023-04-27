/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Cola extends Liquido{
    private Double cafeina;

    public Cola(Double litros) {
        super(litros, "incoloro");
        cafeina = 1.0;
    }

    @Override
    public Liquido mezclar(Liquido liquido) {
        try {
            throw new NoSePuedeMezclarException("No se puede mezclar"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (NoSePuedeMezclarException ex) {
            return null;
        }
    }

    public Double getCafeina() {
        return cafeina;
    }

    public void setCafeina(Double cafeina) {
        this.cafeina = cafeina;
    }
   
    
   
    
    
}
