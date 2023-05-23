package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class TipoEstadoEntity {
    private UUID identificador;
    private String nombre;
    private String descripcion;

    private TipoEstadoEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }
    public TipoEstadoEntity(UUID identificador, String nombre, String descripcion) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }
    
    
    
    public static final TipoEstadoEntity createWithIdentificador(final UUID identificador) {
    	return new TipoEstadoEntity(identificador, UtilText.getDefaultValue(), UtilText.getDefaultValue());
    }
    
    public static final TipoEstadoEntity createWithNombre(final String nombre) {
    	return new TipoEstadoEntity(UtilUUID.getDefaultValue(), nombre, UtilText.getDefaultValue());
    }
    
    public static final TipoEstadoEntity createWithDescripcion(final String descripcion) {
    	return new TipoEstadoEntity(UtilUUID.getDefaultValue(), UtilText.getDefaultValue(), descripcion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


<<<<<<< HEAD
    public TipoEstadoEntity setIdentificador(final UUID identificador) {
=======
    private TipoEstadoEntity setIdentificador(final UUID identificador) {
>>>>>>> 227991b7ee19909cb0b8b027164a6abd743bab8b
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoEstadoEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoEstadoEntity setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public static TipoEstadoEntity create (){
        return new TipoEstadoEntity();
    }
}

