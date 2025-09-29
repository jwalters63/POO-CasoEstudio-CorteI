public class SistemaVehiculos {

    public static void procesarVehiculos(Vehiculo[] vehiculos) {
        for (Vehiculo v : vehiculos) {
            v.mover();
            System.out.println(v.obtenerDetalles());

            if (v instanceof Combustible c) {
                System.out.println("Nivel de combustible (antes): " + c.obtenerNivelCombustible());
                c.recargarCombustible();
                System.out.println("Nivel de combustible (después): " + c.obtenerNivelCombustible());
            }

            if (v instanceof Mantenimiento m) {
                m.realizarMantenimiento();
            }

            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        procesarVehiculos(new Vehiculo[]{
                new Automovil("Toyota", "Corolla", 2020, 40.0),
                new Bicicleta("Trek", "Mountain", 2022, 21),
                new Motocicleta("Suzuki", "Avenis", 2025, 250)
        });
    }
}