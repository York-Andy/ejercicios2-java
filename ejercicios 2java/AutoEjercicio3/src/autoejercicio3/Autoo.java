
package autoejercicio3;


public class Autoo {

    
    public static void main(String[] args) {
          Auto gold = new Auto ("Rojo", "ABC");
          Rueda rueda1= new Rueda ("Pirelli");
          Rueda rueda2= new Rueda ("Pirelli");
          Rueda rueda3= new Rueda ("Pirelli");
          Rueda rueda4= new Rueda ("Pirelli");
          
          gold.avanzar(50);
          gold.retroceder(25424424);
          gold.llenarTanque();
          rueda1.desinfar();
          rueda2.pinchar();
          rueda2.inflar();
          
          
    }
    
}
