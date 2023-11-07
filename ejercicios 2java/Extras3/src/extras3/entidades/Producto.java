/*
 Los Productos
tienen como atributos: descripción, precio de lista, stock y tipo de producto; además de un método
especial calcularPrecioPublico que retornará el precio de lista más un 25% si el producto es de
tipo “Lácteo”, un 35% si el producto es de tipo “Limpieza” y un 45% para cualquier otro tipo de
producto.
 */
package extras3.entidades;

/**
 *
 * @author USURIO
 */
public class Producto {
    private String descripcion;
    private double precioLista;
    private int stock;
    private String tipo;

    public Producto(String descripcion, double precioLista, int stock, String tipo) {
        this.descripcion = descripcion;
        this.precioLista = precioLista;
        this.stock = stock;
        this.tipo = tipo;
    }
    
    public double calcularPrecioPublico(){
        double precioPublico;
        switch(tipo.toLowerCase()){
            case "lacteo":
                precioPublico= precioLista+(precioLista*0.25);
               break;
            case "limpieza":
                precioPublico=precioLista+(precioLista*0.35);
                break;
                
            default:
                precioPublico=precioLista+(precioLista*0.45);
        }
        
        
        return precioPublico;
    }
    
    
}
