import clases.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  System.out.println("Hola Mundo");
        // Instanciar objetos de las clases desarrolladas

        // Crear objetos de las clases Dirección
        Direccion direccion1 = new Direccion("Principal", 25, 5001, "Puerto Triunfo", "Medellin");

        // Crear objetos de las clases Empresa
        Empresa empresa1 = new Empresa("VanDigital", "C17812800", direccion1);

        // Crear objetos de las clases Departamento
        Departamento departamento1 = new Departamento("Sistemas", "Sis", CategoriaDpto.TECNOLOGIA, "Penthouse", empresa1);

        // Crear objetos de las clases Empleado
        Empleado empleado1 = new Empleado("001IT", "1234567", "Iromi", "Bravo", "Activo", 37, "Soltera", 1000, "Analista", direccion1, departamento1);

        Cliente cliente1 = new Cliente("001CLI", "9876543", "Juan", "Pérez", "Activo", 30, "Casado", empresa1, empleado1);

        Cliente cliente2 = new Cliente("002CLI", "1478523", "Angel", "Bueno", "Activo", 20, "Soltero", empresa1, empleado1);

        // Crear una lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);

        // Mostrar los clientes
        for (Cliente cliente : clientes) {
            System.out.println("------------Clientes----------");
            System.out.println(cliente);
        }

        // Crear una lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado1);

        // Mostrar los empleados
        for (Empleado empleado : empleados) {
            System.out.println("------------Empleados----------");
            System.out.println(empleado);

        // Implementación de la interfaz Pago para el empleado
        System.out.println("------------Pago de empleados----------");
        empleado1.cobrar();
        empleado1.pagar();

        // Implementación de la interfaz PagoCliente (+ContratarServicio)
        System.out.println("------------Cliente contrata servicio----------");
        cliente1.contratarServicio(empresa1,empleado1);

        // Implementación de la interfaz PagoEmpresa (+PagarImpuesto)
        System.out.println("------------Empresa paga Impuestos----------");
        empresa1.pagarImpuestos();




        // Mostrar información de los objetos creados
/*      System.out.println("----------------------------");
        System.out.println(empleado1);
        System.out.println("----------------------------");
        System.out.println(departamento1);
        System.out.println("----------------------------");
        System.out.println(empresa1);
        System.out.println("----------------------------");
*/
        }
    }
}