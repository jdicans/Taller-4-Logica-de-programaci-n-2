// 1. Clase Vehiculo: contiene la información básica y métodos del vehículo
class Vehiculo {
    private String modelo;
    private String marca;
    private int anioFabricacion;

    // Constructor
    public Vehiculo(String modelo, String marca, int anioFabricacion) {
        this.modelo = modelo;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    // 2. Método para mostrar información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de Fabricación: " + anioFabricacion);
        System.out.println("-------------------------------");
    }

    // 3. Método para simular el arranque del vehículo
    public void arrancar() {
        System.out.println("El vehículo " + marca + " " + modelo + " ha arrancado correctamente.");
    }

    // Getters (opcional)
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
}

// 4. Clase principal con pruebas de escritorio
public class GestionVehiculos {
    public static void main(String[] args) {
        // Crear vehículos
        Vehiculo v1 = new Vehiculo("Civic", "Honda", 2019);
        Vehiculo v2 = new Vehiculo("Model 3", "Tesla", 2023);
        Vehiculo v3 = new Vehiculo("Ranger", "Ford", 2015);

        // Mostrar información y arrancar
        System.out.println("=== Registro de Vehículos ===");
        v1.mostrarInformacion();
        v1.arrancar();

        v2.mostrarInformacion();
        v2.arrancar();

        v3.mostrarInformacion();
        v3.arrancar();
    }
}
