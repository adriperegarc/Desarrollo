/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Vodka extends Liquido implements Graduable {
    
    private Double grados;

    public Vodka(Double litros, Double grados) {
        super(litros, "incoloro");
        if(grados < 0){
            this.grados = 0.0;
        }
        else if(grados > 1){
            this.grados = 1.0;
        }else{
            this.grados = grados;
        }
    }

    
    @Override
    public Liquido mezclar(Liquido liquido) {
        if(! liquido.getClass().equals(Agua.class.getSimpleName()) || ! liquido.getClass().equals(Cola.class.getSimpleName())){
            return null;
        }
        Copa c = new Copa(this, liquido);
        c.setLitros(this.getLitros() + liquido.getLitros());
        c.setColor(this.color + "-" + liquido.color);
        return c;
    }

    public Double getGrados() {
        return this.grados;
    }
    
    
    
    
    
}
