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
public class Alumno {
private Integer legajo;
private String apellido;
private String nombre;
private int aniocursado;

    public Alumno() {
        Set<String>apellido=new TreeSet<>();

    public Alumno(Integer legajo, String apellido, String nombre, int aniocursado) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.aniocursado = aniocursado;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniocursado() {
        return aniocursado;
    }

    public void setAniocursado(int aniocursado) {
        this.aniocursado = aniocursado;
    }

  
}
