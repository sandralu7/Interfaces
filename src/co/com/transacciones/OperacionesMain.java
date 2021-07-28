package co.com.transacciones;

public class OperacionesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperacionesInterface operacionesI = new OperacionesClase();
		
		String retorno = operacionesI.insertarEmpleado(1, "Pedro");
		operacionesI.actualizarEmpleado("Pablo");
		operacionesI.borrarEmpleado(1);
		operacionesI.consultarEmpleado(1);
		
		System.out.println(retorno);
		
		

	}

}
