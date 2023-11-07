/*
Clase Juego: esta clase posee los siguientes atributos: 2 Jugadores y Revolver

Métodos:
• llenarJuego(Jugador jugador1,Jugador jugador2, Revolver r): este método recibe los 2 jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el
gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al
siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se
debe mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto, usando los
atributos de la clase Juego.
 */
package extra4;

/**
 *
 * @author USURIO
 */
public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Revolver revolver;

   
    
    
    
    public void llenarJuego(Jugador j1,Jugador j2, Revolver r){
        jugador1=j1;
        jugador2=j2;
        revolver=r;
        
    }
    public void ronda(){
        do{
            jugador1.disparo(revolver);
            if(!jugador1.isMojado())
            jugador2.disparo(revolver);
            
        }while(!jugador1.isMojado()&&!jugador2.isMojado());
        if(jugador1.isMojado()){
        System.out.println("El jugador que se mojo fue "+jugador1.getNombre());
        }else{
            System.out.println("El jugador que se mojo fue "+jugador2);
        }
            
        
    }
}
