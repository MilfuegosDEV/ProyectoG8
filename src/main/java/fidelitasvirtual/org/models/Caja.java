package fidelitasvirtual.org.models;

import java.time.LocalDate;

public class Caja extends Cola {
    public final int max;
    public Caja(int max) {
        super();
        this.max = max;
    }

    @Override
    public void agregar(Tiquete tiquete) {
        if (!this.estaLlena()) {
            super.agregar(tiquete);
            return;
        }
        throw new UnsupportedOperationException("No se puede agregar el tiquete, porque la cola esta llena");
    }

    @Override
    public Tiquete eliminar() {
        Tiquete tiquete =  super.eliminar();
        tiquete.setFechaAtencion(LocalDate.now());
        return tiquete;
    }

    private boolean estaLlena(){
        return super.longitud() > max;
    }
}
