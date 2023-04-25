package co.edu.uco.publiuco.entities;

import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

import java.util.UUID;

public class ComentarioRevisorEntity {
    private UUID identificador;
    private RevisorRevisionEntity revisorRevision;
    private TipoComentarioRevisorEntity tipoComentarioRevisor;
    private String comentario;


    public ComentarioRevisorEntity(UUID identificador, RevisorRevisionEntity revisorRevision, TipoComentarioRevisorEntity tipoComentarioRevisor, String comentario) {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setRevisorRevision(revisorRevision);
        setTipoComentarioRevisor(tipoComentarioRevisor);
        setComentario(comentario);

    }

    public UUID getIdentificador() {
        return identificador;
    }

    public RevisorRevisionEntity getRevisorRevision() {
        return revisorRevision;
    }

    public TipoComentarioRevisorEntity getTipoComentarioRevisor() {
        return tipoComentarioRevisor;
    }

    public String getComentario() {
        return comentario;
    }

    private ComentarioRevisorEntity setIdentificador(UUID identificador) {
        this.identificador = identificador;
        return this;
    }

    private ComentarioRevisorEntity setRevisorRevision(RevisorRevisionEntity revisorRevision) {
        this.revisorRevision = revisorRevision;
        return this;
    }

    private ComentarioRevisorEntity setTipoComentarioRevisor(TipoComentarioRevisorEntity tipoComentarioRevisor) {
        this.tipoComentarioRevisor = tipoComentarioRevisor;
        return this;
    }

    private ComentarioRevisorEntity setComentario(String comentario) {
        this.comentario = UtilText.applyTrim(comentario);
        return this;
    }
}
