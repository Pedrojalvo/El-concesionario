public class VehiculoTurismo {
    private String marca;
    private String modelo;
    private double preciobase;
    private int numPlazas;

    public VehiculoTurismo(String marca, String modelo, double preciobase, int numPlazas) {
        this.marca = marca;
        this.modelo = modelo;
        this.preciobase = preciobase;
        this.numPlazas = numPlazas;
    }

    public double calcularPrecioFinal() {
        if (numPlazas <= 5) {
            return preciobase;
        } else {
            int plazasExtras = numPlazas - 5;
            double aumento = 0.10 * preciobase * plazasExtras;
            return preciobase + aumento;
        }
    }


    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public static void main(String[] args) {
        VehiculoTurismo vehiculo1 = new VehiculoTurismo("Marca1", "Modelo1", 10000, 5);
        System.out.println("Precio final del vehículo 1: " + vehiculo1.calcularPrecioFinal());

        VehiculoTurismo vehiculo2 = new VehiculoTurismo("Marca2", "Modelo2", 10000, 7);
        System.out.println("Precio final del vehículo 2: " + vehiculo2.calcularPrecioFinal());
    }
}
