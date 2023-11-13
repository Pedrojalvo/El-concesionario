import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private List<VehiculoTurismo> vehiculos;

    public Concesionario() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(VehiculoTurismo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarYCalcularPrecioTotal() {
        double precioTotal = 0;

        System.out.println("Vehículos en el concesionario:");

        for (VehiculoTurismo vehiculo : vehiculos) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() +
                    " - Precio: " + vehiculo.calcularPrecioFinal());
            precioTotal += vehiculo.calcularPrecioFinal();
        }

        System.out.println("\nPrecio total de los vehículos: " + precioTotal);
    }

    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        VehiculoTurismo vehiculo1 = new VehiculoTurismo("Marca1", "Modelo1", 10000, 5);
        VehiculoTurismo vehiculo2 = new VehiculoTurismo("Marca2", "Modelo2", 12000, 7);

        concesionario.agregarVehiculo(vehiculo1);
        concesionario.agregarVehiculo(vehiculo2);

        concesionario.mostrarYCalcularPrecioTotal();
    }
}
