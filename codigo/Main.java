public class Main {
    public static void main(String[] args) {
        // Método principal donde se crean instancias de Empleado y se imprimen sus funciones

        Empleado andreas = new Empleado("Andreas", "Jefe", "Gestiona la sucursal");
        // Crea un objeto Empleado llamado andreas con el nombre, posición y función especificados
        Empleado julia = new Empleado("Julia", "Consultor", "Asesora a los clientes sobre las quejas");
        // Crea un objeto Empleado llamado julia
        Empleado tom = new Empleado("Tom", "Venta", "Vende los productos");
        // Crea un objeto Empleado llamado tom

        Empleado stefanie = new Empleado("Stefanie", "Desarrollador", "Mantenimiento informático en la sucursal.");
        // Crea un objeto Empleado llamado stefanie

        Empleado matthias = new Empleado("Matthias", "Contable", "Contabilidad financiera de la sucursal.");
        // Crea un objeto Empleado llamado matthias
        andreas.printCurrentFuncion();
        // Llama al método printCurrentFuncion para imprimir la información de andreas
        julia.printCurrentFuncion();
        // Llama al método printCurrentFuncion para imprimir la información de julia
        tom.printCurrentFuncion();
        // Llama al método printCurrentFuncion para imprimir la información de tom
        stefanie.printCurrentFuncion();
        // Llama al método printCurrentFuncion para imprimir la información de stefanie
        matthias.printCurrentFuncion();
        // Llama al método printCurrentFuncion para imprimir la información de matthias
    }
}
