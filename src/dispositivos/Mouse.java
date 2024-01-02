package dispositivos;

public class Mouse extends DispositivoEntrada {
    private int idMouse;
    private static int contadorMouse;

    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idMouse = ++contadorMouse;

    }

    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                ", " + super.toString()+
                '}';
    }
}
