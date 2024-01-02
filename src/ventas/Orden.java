package ventas;
import pc.Computadora;

public class Orden {
    private int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    public Orden(){
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    public void  agregarComputadora(Computadora computadora){
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de computadoras: " + MAX_COMPUTADORAS);
        }
    }
    public void mostraOrden(){
        System.out.println("Orden #: " + idOrden);
        System.out.println("Computadoras de la orden #: " + idOrden);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
