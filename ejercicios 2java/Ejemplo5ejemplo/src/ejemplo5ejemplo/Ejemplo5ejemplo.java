/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo5ejemplo;

/**
 *
 * @author Lenovo
 */
public class Ejemplo5ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colegio murialdo=new Colegio();
        Alumno alumno=new Alumno(1234, "luna", "tomas", 1);
        murialdo.agregarAlumno(2345, "lopez");
        murialdo.agregarAlumno(7654, "perez");
        murialdo.agregarAlumno(5678, "$sigas");
        murialdo.ListarAlumnos();
        murialdo.ListarAlumnos( "$");
        //murialdo.borrarAlumno(2345);
        murialdo.ListarAlumnos();
        
    }
    
}
