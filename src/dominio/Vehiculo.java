
import java.util.ArrayList;
import java.util.List;

abstract class Vehiculo {
    protected double precioBase;

    public Vehiculo(double precioBase) {
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();
}

class VehiculoTurismo extends Vehiculo {
    public VehiculoTurismo(double precioBase) {
        super(precioBase);
    }

    public double calcularPrecioFinal() {
        return precioBase;
    }
}

public class Concesionario {
    private List<Vehiculo> vehiculos;

    public Concesionario() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarYCalcularPrecioTotal() {
        double precioTotal = 0;

        System.out.println("Vehículos en el concesionario:");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Precio final: " + vehiculo.calcularPrecioFinal());
            precioTotal += vehiculo.calcularPrecioFinal();
        }

        System.out.println("\nPrecio total de los vehículos: " + precioTotal);
    }

    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        VehiculoTurismo vehiculoTurismo = new VehiculoTurismo(10000);
        Furgoneta furgoneta = new Furgoneta(20000, 8);

        concesionario.agregarVehiculo(vehiculoTurismo);
        concesionario.agregarVehiculo(furgoneta);

        concesionario.mostrarYCalcularPrecioTotal();
    }
}
