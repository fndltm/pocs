package com.shonen.poc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
@Entity
public class Contrato extends Base {
    private String nome;

    @Column(name = "empreendimento_id", insertable = false, updatable = false)
    private Long empreendimentoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    private Empreendimento empreendimento;

    @Column(name = "empresa_id", insertable = false, updatable = false)
    private Long empresaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Empresa empresa;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Contrato contrato = (Contrato) o;
        return getId() != null && Objects.equals(getId(), contrato.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
