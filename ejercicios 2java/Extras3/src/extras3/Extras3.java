/*
En un nuevo proyecto, nos piden modelar e implementar lo siguiente:
Definir un paquete de nombre “entidades” con las clases: Cliente, Producto y Vendedor. En otro
paquete de nombre “Negocio” tendremos la clase Venta que posee como atributos: un Cliente, el
Vendedor y 3 Productos, además de un método calcularTotal que sumará los precios públicos de
los productos y hará un descuento de acuerdo a la ciudad en donde vive el Cliente: si es de San
Luis, posee un descuento del 10% y si es de otra provincia un 15% de descuento. Los Productos
tienen como atributos: descripción, precio de lista, stock y tipo de producto; además de un método
especial calcularPrecioPublico que retornará el precio de lista más un 25% si el producto es de
tipo “Lácteo”, un 35% si el producto es de tipo “Limpieza” y un 45% para cualquier otro tipo de
producto.

Desde el método main de una clase TestComercio se pide:
a) Crear 3 Productos.
b) Crear un Cliente y un Vendedor.
c) Crear una Venta del Vendedor creado en el punto b para el Cliente creado en el punto b y
con los 3 productos del punto a.
d) Solicitar a la Venta que informe el total.
 */
package extras3;

import extras3.Negocio.Venta;
import extras3.entidades.Cliente;
import extras3.entidades.Producto;
import extras3.entidades.Vendedor;

/**
 *
 * @author USURIO
 */
public class Extras3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Producto p1=new Producto("SanCor",400, 30,"lacteo");
       Producto p2=new Producto("Ayudin",290, 20,"limpieza");
       Producto p3=new Producto("cereal",100, 45,"cualquiera");
       Cliente yo=new Cliente("Entre Rios");
       Vendedor v=new Vendedor();
       Venta v1=new Venta(yo, v, p1, p2, p3);
       
       v1.calcularTotal();
       
        
    }
    
}
