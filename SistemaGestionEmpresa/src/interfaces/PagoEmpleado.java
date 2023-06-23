package interfaces;

import clases.Empleado;

public interface PagoEmpleado extends Pago{
void calcularSueldoNeto(Empleado empleado);
}
