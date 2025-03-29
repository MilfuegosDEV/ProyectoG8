package fidelitasvirtual.org.models;

import java.time.LocalDate;

public class Tiquete {
    private final int id;
    private Usuario usuario;
    private final LocalDate fechaCreacion;
    private LocalDate fechaAtencion;
    private char tramite;
    private char tipo;

    public Tiquete(int id, Usuario usuario, char tramite, char tipo ) {
        this.id = id;
        this.usuario = usuario;
        this.fechaCreacion = LocalDate.now();
        this.fechaAtencion = null;
        this.tramite = tramite;
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaAtencion(LocalDate fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
    public LocalDate getFechaAtencion() {
        return fechaAtencion;
    }

    public void setTramite(char tramite) {
        this.tramite = tramite;
    }
    public char getTramite() {
        return tramite;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    public char getTipo() {
        return tipo;
    }
    public int getId() {
        return id;
    }
}
