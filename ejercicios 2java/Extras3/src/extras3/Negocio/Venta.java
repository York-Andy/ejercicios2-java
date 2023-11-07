/*
tendremos la clase Venta que posee como atributos: un Cliente, el
Vendedor y 3 Productos, además de un método calcularTotal que sumará los precios públicos de
los productos y hará un descuento de acuerdo a la ciudad en donde vive el Cliente: si es de San
Luis, posee un descuento del 10% y si es de otra provincia un 15% de descuento.
 */
package extras3.Negocio;

import extras3.entidades.Cliente;
import extras3.entidades.Producto;
import extras3.entidades.Vendedor;

/**
 *
 * @author USURIO
 */
public class Venta {
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;

    public Venta(Cliente cliente, Vendedor vendedor, Producto producto1, Producto producto2, Producto producto3) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
    }
    
    
    
    public void calcularTotal(){
        double calcularTotal;
       if(cliente.getProvincia().equalsIgnoreCase("San Luis")){
           calcularTotal=(producto1.calcularPrecioPublico()+producto2.calcularPrecioPublico()
                   +producto3.calcularPrecioPublico())*0.9;
           System.out.println("EL total a pagar es: "+calcularTotal);
       }else{
           calcularTotal=(producto1.calcularPrecioPublico()+producto2.calcularPrecioPublico()
                   +producto3.calcularPrecioPublico())*0.85;
           System.out.println("EL total a pagar es: "+calcularTotal);
           
       } 
    }
    
}
