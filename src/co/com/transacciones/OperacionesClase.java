package co.com.transacciones;

public class OperacionesClase implements OperacionesInterface{

	@Override
	public String insertarEmpleado(int id, String nombre) {
		boolean transaccion = false;
		System.out.println( "Se inserto el empleado con nombre " + nombre);
		transaccion = true;
		if (transaccion){
			return "Se realizó el insert";
		}else {
			return "No Se realizó el insert";
		}
	}

	@Override
	public String actualizarEmpleado(String nombre) {
		System.out.println("Se actualizó el empleado " + nombre);
		return "Se realizó la actualización";
	}

	@Override
	public String borrarEmpleado(int id) {
		System.out.println("Se borro el empleado " + id);
		return "Se realizó el borrado";
	}

	@Override
	public String consultarEmpleado(int id) {
		System.out.println("Se consultó el empleado " + id);
		return "Se realizó la consulta";
	}

}
