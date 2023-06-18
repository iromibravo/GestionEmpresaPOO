import Clases.*;

public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hola Mundo");
        // Instanciar objetos de las clases desarrolladas

        // Crear objetos de las clases Dirección
        Direccion direccion1 = new Direccion("Principal", 25, 5001, "Puerto Triunfo", "Medellin");
        Direccion direccion2 = new Direccion("Diagonal", 75, 5001, "Robledo", "Medellin");


        // Crear objetos de las clases Empresa
        Empresa empresa1 = new Empresa("VanDigital", "C17812800", direccion1);
        Empresa empresa2 = new Empresa("CodeBit", "C17784512", direccion2);


        // Crear objetos de las clases Departamento
        Departamento departamento1 = new Departamento("Sistemas", "Sis", CategoriaDpto.TECNOLOGIA, "Penthouse", empresa1);
        Departamento departamento2 = new Departamento("Ventas", "Ser", CategoriaDpto.VENTAS, "Piso 1", empresa1);
        Departamento departamento3 = new Departamento("Recursos Humanos", "RRHH", CategoriaDpto.SERVICIOS, "Piso 2", empresa1);

        // Crear objetos de las clases Empleado
        Empleado empleado1 = new Empleado("001IT", 1234567, "Iromi", "Bravo", "Activo", 37, "Soltera", 1000, "Analista", direccion1, departamento1);
        Empleado empleado2 = new Empleado("002IT", 12345678, "Santiago", "Lopez", "Activo", 38, "Casado", 5000, "Ingeniero", direccion1, departamento1);
        Empleado empleado3 = new Empleado("003AD", 123456789, "Yuliana", "Contreras", "Activo", 32, "Soltera", 800, "Auxiliar", direccion2, departamento2);



        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        System.out.println(direccion1);
        System.out.println(direccion2);

        System.out.println(empresa1);
        System.out.println(empresa2);

    }
}