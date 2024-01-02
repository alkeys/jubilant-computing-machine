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

        //creamos la computadora ASUS
        Orden orden2 = new Orden();
        Monitor monitorASUS = new Monitor("ASUS", 15);
        Teclado tecladoASUS = new Teclado("Bluetooth", "ASUS-Teclado");
        Mouse mouseASUS = new Mouse("Bluetooth", "ASUS");
        Computadora computadora2 = new Computadora("ASUS", monitorASUS, tecladoASUS, mouseASUS);

        //agregamos la computadora a la orden
        orden2.agregarComputadora(computadora2);
        orden2.mostraOrden();



    }
}