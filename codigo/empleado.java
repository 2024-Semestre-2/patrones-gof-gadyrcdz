public class Empleado {
    // Define la clase Empleado

    private final String nombre;
    private final String posicion;
    private final String funcion;
    // Declara tres variables constantes de tipo String para almacenar el nombre, la posición y la función del empleado

    public Empleado(String nombre, String posicion, String funcion) {
        // Constructor de la clase Empleado que recibe el nombre, la posición y la función como parámetros
        this.nombre = nombre;
        this.posicion = posicion;
        this.funcion = funcion;
        // Inicializa las variables de instancia con los valores recibidos
    }

    public void printCurrentFuncion() {
        // Método para imprimir la información actual del empleado en la impresora
        Impresora impresora = Impresora.getInstance();
        // Obtiene la única instancia de la clase Impresora utilizando el método getInstance()
        
        impresora.print("Empleado: " + nombre + "\n" +
            "Posición: " + posicion + "\n" +
            "Función: " + funcion + "\n");
        // Usa la instancia de impresora para imprimir el nombre, posición y función del empleado
    }
}
