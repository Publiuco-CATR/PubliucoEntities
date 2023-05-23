package co.edu.uco.publiuco.entities;


import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;


public final class EstadoEntity {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private TipoEstadoEntity tipo;


    private EstadoEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setTipo(TipoEstadoEntity.create());
    }


    public EstadoEntity(UUID identificador, String nombre, TipoEstadoEntity tipo, String descripcion) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setTipo(tipo);
    }

    public final EstadoEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public final EstadoEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }
    
    public final EstadoEntity setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public final EstadoEntity setTipo(final TipoEstadoEntity tipoEstado) {

        this.tipo = UtilObject.getDefault(tipoEstado, TipoEstadoEntity.create());
        return this;
    }

    public final UUID getIdentificador() {
        return identificador;
    }

    public final String getNombre() {
        return nombre;
    }

    public final TipoEstadoEntity getTipo() {
        return tipo;
    }
    
    public String getDescripcion() {
		return descripcion;
	}

    public static EstadoEntity create(){
        return new EstadoEntity();
    }
}
