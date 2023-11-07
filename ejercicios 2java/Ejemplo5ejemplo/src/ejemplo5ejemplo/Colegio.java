/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo5ejemplo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Lenovo
 */
public class Colegio {
 private Alumno estudiante; 

    public Colegio() {
        Map<Integer,String>acd=new TreeMap<>();
    }

    public Colegio(Alumno estudiante) {
        this.estudiante = estudiante;
    }

    public Alumno getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Alumno estudiante) {
        this.estudiante = estudiante;
    }
 public void agregarAlumno(Integer legajo,String apellido){
  Map<Integer,String>acd=new TreeMap<>();
  acd.put(legajo, apellido);
 }
 public void borrarAlumno(Integer legajo){
 Map<Integer,String>acd=new TreeMap<>();
 acd.remove(legajo );
 }
 public void ListarAlumnos(){
 Map <Integer,String>acd=new TreeMap<>();
     for (Map.Entry<Integer, String> entry : acd.entrySet()) {
         System.out.println("Apellido :"+" "+entry.getValue());
         
     }
 
 }
 public void ListarAlumnos(String a){
 Map <Integer,String>acd=new TreeMap<>();
     for (Map.Entry<Integer, String> entry : acd.entrySet()) {
         if(entry.getValue().equalsIgnoreCase(a)){
             System.out.println("el apellido esta en la lista  :"+entry.getValue());
         }
         
     }
 
 }
}
