package gt.edu.umg;

public class Cola {

	private Nodo raiz,cima;
	public Cola() {
		raiz = null;
		cima = null;
	}
	public boolean colaVacia() {
		if (raiz == null) {
			return true;
		}else {
			return false;
		}
	}
	public void insertar(Gasolinera dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.siguiente = null;
		if (colaVacia()) {
			raiz = nuevo;
			cima = nuevo;
		}else {
			cima.siguiente = nuevo;
			cima = nuevo;
		}
	}
	public Gasolinera quitar() {
		if (colaVacia()) {
			System.out.println("Cola Vacia");
			return null;
		}
		Gasolinera aux = raiz.dato;
		if (raiz == cima) {
			raiz = null;
			cima = null;
		}else {
			raiz = raiz.siguiente;
		}
		System.out.println("Eliminado: "+aux);
		return aux;
	}

	public void listar() {
		if(colaVacia ()) {
			
		}else {
			
		Nodo t = raiz;
		while(t != null) {
			System.out.println("Nombre: "+t.dato.getNombre());
			System.out.println("NIT: "+t.dato.getNit());
			System.out.println("Galones: "+ t.dato.getCantidad());
			if (t.dato.getTipoGas() == 1) {
				System.out.println("Combustible: Super");
			}else if(t.dato.getTipoGas()== 2) {
				System.out.println("Combustible: Regular");
			}else if(t.dato.getTipoGas() == 3) {
				System.out.println("Combustible: Diesel");
			}else {
				System.out.println("Combustible: N/A");
				}
			t = t.siguiente;
			
			System.out.println("\n");
		}
	}
	}
}