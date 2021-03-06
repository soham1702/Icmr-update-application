package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A BedTransactions.
 */
@Entity
@Table(name = "bed_transactions")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class BedTransactions implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "occupied", nullable = false)
    private Long occupied;

    @Column(name = "on_cylinder")
    private Long onCylinder;

    @Column(name = "on_lmo")
    private Long onLMO;

    @Column(name = "on_concentrators")
    private Long onConcentrators;

    @NotNull
    @Column(name = "last_modified", nullable = false)
    private Instant lastModified;

    @NotNull
    @Column(name = "last_modified_by", nullable = false)
    private String lastModifiedBy;

    @ManyToOne
    private BedType bedType;

    @ManyToOne
    @JsonIgnoreProperties(
        value = { "state", "district", "taluka", "city", "municipalCorp", "hospitalType", "suppliers" },
        allowSetters = true
    )
    private Hospital hospital;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public BedTransactions id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOccupied() {
        return this.occupied;
    }

    public BedTransactions occupied(Long occupied) {
        this.setOccupied(occupied);
        return this;
    }

    public void setOccupied(Long occupied) {
        this.occupied = occupied;
    }

    public Long getOnCylinder() {
        return this.onCylinder;
    }

    public BedTransactions onCylinder(Long onCylinder) {
        this.setOnCylinder(onCylinder);
        return this;
    }

    public void setOnCylinder(Long onCylinder) {
        this.onCylinder = onCylinder;
    }

    public Long getOnLMO() {
        return this.onLMO;
    }

    public BedTransactions onLMO(Long onLMO) {
        this.setOnLMO(onLMO);
        return this;
    }

    public void setOnLMO(Long onLMO) {
        this.onLMO = onLMO;
    }

    public Long getOnConcentrators() {
        return this.onConcentrators;
    }

    public BedTransactions onConcentrators(Long onConcentrators) {
        this.setOnConcentrators(onConcentrators);
        return this;
    }

    public void setOnConcentrators(Long onConcentrators) {
        this.onConcentrators = onConcentrators;
    }

    public Instant getLastModified() {
        return this.lastModified;
    }

    public BedTransactions lastModified(Instant lastModified) {
        this.setLastModified(lastModified);
        return this;
    }

    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public BedTransactions lastModifiedBy(String lastModifiedBy) {
        this.setLastModifiedBy(lastModifiedBy);
        return this;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public BedType getBedType() {
        return this.bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public BedTransactions bedType(BedType bedType) {
        this.setBedType(bedType);
        return this;
    }

    public Hospital getHospital() {
        return this.hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public BedTransactions hospital(Hospital hospital) {
        this.setHospital(hospital);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BedTransactions)) {
            return false;
        }
        return id != null && id.equals(((BedTransactions) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BedTransactions{" +
            "id=" + getId() +
            ", occupied=" + getOccupied() +
            ", onCylinder=" + getOnCylinder() +
            ", onLMO=" + getOnLMO() +
            ", onConcentrators=" + getOnConcentrators() +
            ", lastModified='" + getLastModified() + "'" +
            ", lastModifiedBy='" + getLastModifiedBy() + "'" +
            "}";
    }
}
