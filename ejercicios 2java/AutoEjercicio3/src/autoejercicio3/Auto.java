package autoejercicio3;

import autoejercicio3.Rueda;

public class Auto {

    private String color;

    private String patente;

    private int combustible = 50;

    private Rueda rueda1;

    private Rueda rueda2;

    private Rueda rueda3;

    private Rueda rueda4;

    public void Auto(String color, String patente) {
    }

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;

    }

    public void avanzar(double metros) {
        double consumo = metros / 10;
        if (combustible > consumo) {
            combustible -= consumo;
            System.out.println("El auto avanzo " + metros);
        } else {
            System.out.println("No hay combustible suficiente ");
        }

    }

    public void retroceder(double metros) {
        double consumo = metros / 10;
        if (combustible > consumo) {
            combustible -= consumo;
            System.out.println("El auto retrocedio " + metros);
        } else {
            System.out.println("No hay combustible suficiente ");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public void llenarTanque() {
        combustible = 50;
        System.out.println("El tanque esta lleno ");

    }

}
