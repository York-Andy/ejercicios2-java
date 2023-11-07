/*
 En un nuevo proyecto, nos piden modelar e implementar lo siguiente:
Para regar un parque se dispone de una Bomba, la cual posee un Motor y este un Tanque de Agua.
El Tanque de Agua tiene una capacidad máxima es de 10.000 litros y los comportamientos para
saber si su capacidad está al límite o vacía y otro cargar que cada vez que se lo invoca carga 500
litros. El Motor puede trabajar con 3 velocidades distintas (ALTA, MEDIA y BAJA) y un
comportamiento consumirAgua que cada vez que se lo invoca consume 10 litros si trabaja a
velocidad ALTA, 5 litros si trabaja a velocidad MEDIA y 1 litro si trabaja a velocidad BAJA; otro
comportamiento cambiarVelocidad que cada vez que se lo usa, cambia la velocidad de Alta a
Media y de Media a Baja y vuelve a empezar. La Bomba tiene un comportamiento regar que hace
que el Motor consuma agua hasta que su tanque quede completamente vacío y otro
comportamiento mostrarInfor que muestra por pantalla la carga inicial del tanque, la velocidad del
motor.
Se pide desde el método main de una clase TestRegar:
a) Crear un Tanque y llenarlo con 5000 litros de agua.
b) Crear un Motor con este Tanque y que trabaje a velocidad Media.
c) Crear una Bomba con el motor instanciado en el punto b.
d) Hacer que la Bomba riegue y al finalizar invocar al método mostrarInfo.
 */
package extra5;

/**
 *
 * @author USURIO
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TanqueDeAgua t=new TanqueDeAgua(5000);
        Motor m=new Motor();
        
        
    }
    
}
