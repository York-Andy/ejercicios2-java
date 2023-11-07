/*
 La Bomba tiene un comportamiento regar que hace
que el Motor consuma agua hasta que su tanque quede completamente vacío y otro
comportamiento mostrarInfor que muestra por pantalla la carga inicial del tanque, la velocidad del
motor.
 */
package extra5;

/**
 *
 * @author USURIO
 */
public class Bomba {
    private Motor motor;

    public Bomba(Motor motor) {
        this.motor = motor;
    }
    
    
    public void consumirAgua(){
        while(motor.cargadetanque()!=0)//buscar otra solución
        motor.consumirAgua();
    }
    
    public void mostrarInfor(){
        System.out.println("La carga del tanque es: "+motor.cargadetanque());
        System.out.println("La velocidad del motor es: "+motor.getVelocidad());
        
    }
    
}
