public class Motocicleta extends Vehiculo implements Combustible, Mantenimiento {
    private int cilindrada;
    private double nivelCombustible;
    private static final double CAPACIDAD_TANQUE = 20.0;

    public Motocicleta(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
        this.nivelCombustible = 0.0; // arranca vacía (ajuste si quiere)
    }

    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("La motocicleta " + marca + " " + modelo +
                    " está acelerando con " + cilindrada + " cc");
            nivelCombustible = Math.max(0.0, nivelCombustible - 0.3); // consumo
        } else {
            System.out.println("La motocicleta " + marca + " " + modelo + " no tiene combustible.");
        }
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() +
                ", Cilindrada: " + cilindrada +
                ", Combustible: " + nivelCombustible + " litros";
    }

    @Override
    public void recargarCombustible() {
        nivelCombustible = CAPACIDAD_TANQUE;
        System.out.println("La motocicleta " + marca + " " + modelo + " ha sido recargada con combustible.");
    }

    @Override
    public double obtenerNivelCombustible() {
        return nivelCombustible; // sin efectos secundarios
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Cambiando aceite de la motocicleta " + marca + " " + modelo);
    }
}