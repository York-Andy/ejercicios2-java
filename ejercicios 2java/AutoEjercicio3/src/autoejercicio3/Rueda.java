package autoejercicio3;

public class Rueda {

    private String marca;

    private double presion = 28;

    public Rueda(String marca) {
        this.marca = marca;

    }

    public void pinchar() {
        presion = 0;
        System.out.println("La rueda esta pinchada ");

    }

    public void inflar() {
        presion = 28;
        System.out.println("La rueda esta a su maxima presion ");
    }

    public void desinfar() {
        presion -= 0.5;
        System.out.println("La rueda se desinflo, ahora tiene " + presion + " psi");
    }
}
