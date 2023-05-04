package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;
import co.edu.uco.publiuco.entities.EstadoEntity;

import java.util.UUID;

public class TipoIdentificacionEntity {
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private EstadoEntity estado;
    public static TipoIdentificacionEntity DEFAULT_OBJECT = new TipoIdentificacionEntity();

    private TipoIdentificacionEntity() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }
    public TipoIdentificacionEntity(UUID identificador, String nombre, String descripcion, EstadoEntity estado) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
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
    
    public EstadoEntity getEstado() {
		return estado;
	}


    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }

    private void setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
    }

    private void setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
    }

    public void setEstado(EstadoEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEntity.getDefaultObject());
	}
    
    public static TipoIdentificacionEntity getDefaultObject (){
        return DEFAULT_OBJECT;
    }
    
}


