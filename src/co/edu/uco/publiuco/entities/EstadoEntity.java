package co.edu.uco.publiuco.entities;


import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;


public final class EstadoEntity {

    private UUID identificador;
    private String nombre;
    private TipoEstadoEntity tipoEstado;

    public EstadoEntity(UUID identificador, String nombre, TipoEstadoEntity tipoEstado) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setTipoEstado(tipoEstado);
    }

    private final void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private final void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private final void setTipoEstado(final TipoEstadoEntity tipoEstado) {

        this.tipoEstado = tipoEstado;
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final TipoEstadoEntity getTipoEstado() {
        return tipoEstado;
    }

}
