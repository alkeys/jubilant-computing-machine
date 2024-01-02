import dispositivos.*;
import ventas.Orden;
import  pc.Computadora;
// Created: 09.04.2020 21:43
public class Mundopc {
    public static void main(String[] args) {
        Orden orden1 = new Orden();//primera orden
        //creamos la computadora HP
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP-Teclado");
        Mouse mouseHP = new Mouse("Bluetooth", "HP");
        Computadora computadora1 = new Computadora("HP", monitorHP, tecladoHP, mouseHP);

        //agregamos la computadora a la orden
        orden1.agregarComputadora(computadora1);
        orden1.mostraOrden();

    }
}