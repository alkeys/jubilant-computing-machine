package dispositivos;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String Marca;

    public DispositivoEntrada(String tipoEntrada, String Marca) {
        this.tipoEntrada = tipoEntrada;
        this.Marca = Marca;
    }


    public String toString() {
        return "Tipo de entrada: " + tipoEntrada + "\nMarca: " + Marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
}