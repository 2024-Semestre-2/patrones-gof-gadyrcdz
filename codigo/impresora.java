public class Impresora { 
    // Define la clase Impresora
    private static Impresora impresora;
    // Declara una variable estática de tipo Impresora llamada impresora para almacenar la única instancia de esta clase (patrón Singleton)

    private int numeroPaginas;
    // Declara una variable entera para contar el número de páginas impresas

    private Impresora() {
        // Constructor privado para evitar que se creen instancias de la clase desde fuera de la misma (parte del patrón Singleton)
    }

    public static Impresora getInstance() {
        // Método estático para obtener la única instancia de la clase Impresora
        if (impresora == null) {
            // Si la instancia no ha sido creada aún (es null), la crea
            impresora = new Impresora();
        }
        return impresora;
        // Retorna la instancia de Impresora
    }

    public void print(String text) {
        // Método público para imprimir texto y el número de páginas impresas hasta el momento
        System.out.println(text +
                "\n" + "Número de páginas impresas hoy: " + ++numeroPaginas +
                "\n" + "---------");
        // Imprime el texto proporcionado, incrementa en 1 el contador de páginas impresas y lo muestra
    }
}
