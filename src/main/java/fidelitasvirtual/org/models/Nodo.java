package fidelitasvirtual.org.models;

class Nodo {
    Tiquete tiquete;
    Nodo siguiente;

    public Nodo(Tiquete tiquete) {
        this.tiquete = tiquete;
        this.siguiente = null;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}