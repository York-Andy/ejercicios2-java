/*
El Tanque de Agua tiene una capacidad máxima es de 10.000 litros y los comportamientos para
saber si su capacidad está al límite o vacía y otro cargar que cada vez que se lo invoca carga 500
litros.
 */
package extra5;

/**
 *
 * @author USURIO
 */
public class TanqueDeAgua {
    private final double capacidadmaxima=10000;
    private double carga;

    public TanqueDeAgua(double carga) {
        this.carga = carga;
    }
    
    

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
    
    
    
    public void capacidad(){
        if(carga==capacidadmaxima){
            System.out.println("La capacidad esta al limite");
        }else if(carga==0){
            System.out.println("La capacidad esta vacia");
        }else{
            System.out.println("La capacidad es: "+carga);
        }
    }
    
    public void cargar(){
        carga=carga+500;
        //carga+=500;
    }
}
