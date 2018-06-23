package gt.edu.umg;

import java.util.Scanner;
public class Main {

	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main iniciar = new Main();
		iniciar.gasolinera();
	}
	public void gasolinera() {
		int opc;
		Cola c = new Cola();
		Gasolinera v = new Gasolinera();
		do {
			System.out.println("Sistema de control de Gasolinera UMG");
			System.out.println("1. Generar Ticket");
			System.out.println("2. Listar registros");
			System.out.println("3. Eliminar Ticket");
			System.out.println("4. Salir");
			opc = sc.nextInt();
			sc.nextLine();
			switch(opc) {
			case 1:
				String nombre;
				String nit;
				float gasolina;
				int tipo;
				System.out.println("Nombre: ");
				nombre = sc.nextLine();
				v.setNombre(nombre);
				System.out.println("NIT: ");
				nit = sc.nextLine();
				v.setNit(nit);
				System.out.println("Galones de gasolina: ");
				gasolina = sc.nextFloat();
				v.setCantidad(gasolina);
				System.out.println("Tipo de gasolina: \n");
				System.out.println("1. Super");
				System.out.println("2. Regular");
				System.out.println("3. Diesel");
				tipo = sc.nextInt();
				v.setTipoGas(tipo);
				c.insertar(v);
				break;
			case 2:
				c.listar();
			}
		}while(opc!= 4);
	}
}