/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Lejia extends Liquido{
    private Double pureza;

    public Lejia(Double litros) {
        super(litros, "incoloro");
        pureza = 1.0;
    }

    @Override
    public Liquido mezclar(Liquido liquido) {
        Lejia nuevo = new Lejia(this.litros);
        String color = this.color + "-" + liquido.color;
        nuevo.setLitros(this.litros + liquido.litros);
        if(liquido.getClass().equals(Agua.class.getSimpleName()) || liquido.getClass().equals(Lejia.class.getSimpleName())){
            nuevo.setPureza(this.pureza);
        }else{
            nuevo.setPureza(this.litros / liquido.litros);   
        }
        return nuevo;
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        this.pureza = pureza;
    }
   
    
   
    
    
}
