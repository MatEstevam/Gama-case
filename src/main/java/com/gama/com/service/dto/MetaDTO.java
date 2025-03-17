package com.gama.com.service.dto;

import com.gama.com.domain.enumeration.AreaDoEnem;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.gama.com.domain.Meta} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class MetaDTO implements Serializable {

    private Long id;

    private Integer valor;

    private AreaDoEnem area;

    private AlunoDTO aluno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public AreaDoEnem getArea() {
        return area;
    }

    public void setArea(AreaDoEnem area) {
        this.area = area;
    }

    public AlunoDTO getAluno() {
        return aluno;
    }

    public void setAluno(AlunoDTO aluno) {
        this.aluno = aluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetaDTO)) {
            return false;
        }

        MetaDTO metaDTO = (MetaDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, metaDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "MetaDTO{" +
            "id=" + getId() +
            ", valor=" + getValor() +
            ", area='" + getArea() + "'" +
            ", aluno=" + getAluno() +
            "}";
    }
}
