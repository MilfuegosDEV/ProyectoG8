package fidelitasvirtual.org.models;

public class Cola {
    private Nodo cabeza;
    private Nodo cola;

    public Cola() {
        cabeza = cola = null;
    }

    private boolean estaVacia() {
        return cabeza == null;
    }

    public void agregar(Tiquete tiquete) {
        Nodo nuevo = new Nodo(tiquete);
        if (estaVacia()) {
            cabeza = cola = nuevo;
            return;
        }
        cola.setSiguiente(nuevo);
        cola = nuevo;
    }

    public Tiquete eliminar() {
        if (estaVacia()) {
            return null;
        }
        Tiquete tiquete = cabeza.getTiquete();
        cabeza = cabeza.getSiguiente();
        if (cabeza == null) {
            cola = null;
        }
        return tiquete;
    }

    public int longitud() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getTiquete() + " -> ");
            actual = actual.getSiguiente();
        }
        System.out.println("null");
    }

    @Override
    public String toString() {
        if (this.estaVacia()) {
            return "Caja: ...";
        }
        StringBuilder sb = new StringBuilder();
        Nodo actual = cabeza;

        sb.append("Caja: ");
        while (actual != null) {
            sb.append(actual.getTiquete().getUsuario().getNombre());
            if (actual.getSiguiente() != null) {
                sb.append(" <- ");
            }
            actual = actual.getSiguiente();
        }
        sb.append(" <- Final de la cola");

        return sb.toString();
    }
}