package pc;

import dispositivos.*;

public class Computadora {
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse raton;
    private int idComputadora;
    private static int contadorComputadoras;

    public Computadora() {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" + monitor + "\n" + teclado + "\n" + raton + "\nID: " + idComputadora;
    }
}
