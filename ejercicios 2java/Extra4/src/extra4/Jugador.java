/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador),
nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está
mojado o no el jugador).

Métodos:

disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() y
siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua,
el jugador se moja; por lo tanto el atributo mojado pasa a true, sino false.
 */
package extra4;

/**
 *
 * @author USURIO
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado=false;

    public String getNombre() {
        return nombre;
    }
    
    
    

    public boolean isMojado() {
        return mojado;
    }
  

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre+id;
        
    }
    
    public void disparo(Revolver r){
        System.out.println("se disparo el arma");
        if(r.mojar()){
            mojado=true;
            System.out.println("El jugador esta mojado");
        }else
            mojado=false;
        
        r.siguienteChorro();
                
    }
  
    @Override
    public String toString() {
        return  nombre;
    }

   
    
    
    
}
