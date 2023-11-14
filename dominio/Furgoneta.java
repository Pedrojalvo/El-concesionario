import java.util.ArrayList;
import java.util.List;

class Furgoneta extends Vehiculo {
    private double capacidadM3;

    public Furgoneta(double precioBase, double capacidadM3) {
        super(precioBase);
        this.capacidadM3 = capacidadM3;
    }

    public double calcularPrecioFinal() {
        return precioBase * Math.pow(capacidadM3, 1.0 / 3) / 2;
    }
}