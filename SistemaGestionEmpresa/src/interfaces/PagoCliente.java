package interfaces;

import clases.Empleado;
import clases.Empresa;

public interface PagoCliente extends Pago{
void contratarServicio(Empresa empresa, Empleado empleado);
}
