/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class Agua extends Liquido{
    private Double pureza;

    public Agua(Double litros) {
        super(litros, "incoloro");
        pureza = 1.0;
    }

    @Override
    public Liquido mezclar(Liquido liquido) {
        Agua nuevo = new Agua(this.litros);
        String color = this.color + "-" + liquido.color;
        nuevo.setLitros(this.litros + liquido.litros);
        if(liquido.getClass().equals(Lejia.class.getSimpleName()) || liquido.getClass().equals(Agua.class.getSimpleName())){
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
