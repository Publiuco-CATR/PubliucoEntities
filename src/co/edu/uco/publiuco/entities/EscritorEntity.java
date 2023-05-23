package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilUUID;

public class EscritorEntity {
    private UUID identificador;
    private PersonaEntity datosPersona;
    private EstadoEntity estado;

    private EscritorEntity() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaEntity.create());
        setEstado(EstadoEntity.create());
    }
    public EscritorEntity(UUID identificador, PersonaEntity datosPersona, EstadoEntity estado) {
        super();
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaEntity getDatosPersona() {
        return datosPersona;
    }


    public EstadoEntity getEstado() {
        return estado;
    }

    public EscritorEntity setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EscritorEntity setDatosPersona(final PersonaEntity datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaEntity.create());
        return this;
    }


    public EscritorEntity setEstado(final EstadoEntity estado) {
        this.estado = UtilObject.getDefault(estado,EstadoEntity.create());
        return this;
    }
    public static EscritorEntity create (){
        return new EscritorEntity();
    }
}
