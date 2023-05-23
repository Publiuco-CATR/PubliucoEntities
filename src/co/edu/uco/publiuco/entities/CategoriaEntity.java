package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilBoolean;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class CategoriaEntity {
    private UUID identificador;
    private CategoriaEntity categoriaPadre;
    private boolean tienePadre;
    private String nombre;
    private String descripcion;
    private EstadoEntity estado;

    private CategoriaEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoriaPadre(CategoriaEntity.create());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoEntity.create());
        setTienePadre(UtilBoolean.getDefaultValue());
    }

    public CategoriaEntity(UUID identificador, CategoriaEntity categoriaPadre, String nombre, String descripcion, EstadoEntity estado, boolean tienePadre) {
        super();
        setIdentificador(identificador);
        setCategoriaPadre(categoriaPadre);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
        setTienePadre(tienePadre);
    }


    public boolean tienePadre() {
		return tienePadre;
	}

	public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaEntity getCategoriaPadre() {
        return categoriaPadre;
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

    public CategoriaEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public CategoriaEntity setCategoriaPadre(final CategoriaEntity categoriaPadre) {
        if(tienePadre()) {
            this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaEntity.create());
        }else {
			this.categoriaPadre = (CategoriaEntity) UtilObject.getNullValue();
        }
    	return this;
    }

    public CategoriaEntity setNombre(final String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public CategoriaEntity setDescripcion(final String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public CategoriaEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoEntity.create());
        return this;
    }
    public static CategoriaEntity create (){
        return new CategoriaEntity();
    }
    public CategoriaEntity setTienePadre(boolean tienePadre) {
		this.tienePadre = UtilBoolean.getDefault(tienePadre);
		return this;
	}
}
