/*
El Motor puede trabajar con 3 velocidades distintas (ALTA, MEDIA y BAJA) y un
comportamiento consumirAgua que cada vez que se lo invoca consume 10 litros si trabaja a
velocidad ALTA, 5 litros si trabaja a velocidad MEDIA y 1 litro si trabaja a velocidad BAJA; otro
comportamiento cambiarVelocidad que cada vez que se lo usa, cambia la velocidad de Alta a
Media y de Media a Baja y vuelve a empezar.
 */
package extra5;

/**
 *
 * @author USURIO
 */
public class Motor {
    private TanqueDeAgua tanque;
    private String velocidad;

    public Motor(TanqueDeAgua tanque) {
        this.tanque = tanque;
    }

    public String getVelocidad() {
        return velocidad;
    }
    
    
   public void consumirAgua(){
       switch(velocidad.toLowerCase()){
           case "alta":
               tanque.setCarga(tanque.getCarga()-10);
               break;
           case "media":
               tanque.setCarga(tanque.getCarga()-5);
               break;
           case "baja":
               tanque.setCarga(tanque.getCarga()-1);
               break;
       }
   }
   public void cambiarVelocidad(){
       
        switch(velocidad.toLowerCase()){
           case "alta":
              velocidad="media";
               break;
           case "media":
               velocidad="baja";
               break;
           case "baja":
               velocidad="alta";
               break;
               
        }
   }
   
   public double cargadetanque(){//buscar otra solución
       return tanque.getCarga();
   }
   
}
