package com.mycompany.myapp.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.BooleanFilter;
import tech.jhipster.service.filter.DoubleFilter;
import tech.jhipster.service.filter.Filter;
import tech.jhipster.service.filter.FloatFilter;
import tech.jhipster.service.filter.InstantFilter;
import tech.jhipster.service.filter.IntegerFilter;
import tech.jhipster.service.filter.LongFilter;
import tech.jhipster.service.filter.StringFilter;

/**
 * Criteria class for the {@link com.mycompany.myapp.domain.BedInventory} entity. This class is used
 * in {@link com.mycompany.myapp.web.rest.BedInventoryResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /bed-inventories?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class BedInventoryCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private LongFilter bedCount;

    private LongFilter occupied;

    private LongFilter onCylinder;

    private LongFilter onLMO;

    private LongFilter onConcentrators;

    private InstantFilter lastModified;

    private StringFilter lastModifiedBy;

    private LongFilter bedTypeId;

    private LongFilter hospitalId;

    private Boolean distinct;

    public BedInventoryCriteria() {}

    public BedInventoryCriteria(BedInventoryCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.bedCount = other.bedCount == null ? null : other.bedCount.copy();
        this.occupied = other.occupied == null ? null : other.occupied.copy();
        this.onCylinder = other.onCylinder == null ? null : other.onCylinder.copy();
        this.onLMO = other.onLMO == null ? null : other.onLMO.copy();
        this.onConcentrators = other.onConcentrators == null ? null : other.onConcentrators.copy();
        this.lastModified = other.lastModified == null ? null : other.lastModified.copy();
        this.lastModifiedBy = other.lastModifiedBy == null ? null : other.lastModifiedBy.copy();
        this.bedTypeId = other.bedTypeId == null ? null : other.bedTypeId.copy();
        this.hospitalId = other.hospitalId == null ? null : other.hospitalId.copy();
        this.distinct = other.distinct;
    }

    @Override
    public BedInventoryCriteria copy() {
        return new BedInventoryCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public LongFilter getBedCount() {
        return bedCount;
    }

    public LongFilter bedCount() {
        if (bedCount == null) {
            bedCount = new LongFilter();
        }
        return bedCount;
    }

    public void setBedCount(LongFilter bedCount) {
        this.bedCount = bedCount;
    }

    public LongFilter getOccupied() {
        return occupied;
    }

    public LongFilter occupied() {
        if (occupied == null) {
            occupied = new LongFilter();
        }
        return occupied;
    }

    public void setOccupied(LongFilter occupied) {
        this.occupied = occupied;
    }

    public LongFilter getOnCylinder() {
        return onCylinder;
    }

    public LongFilter onCylinder() {
        if (onCylinder == null) {
            onCylinder = new LongFilter();
        }
        return onCylinder;
    }

    public void setOnCylinder(LongFilter onCylinder) {
        this.onCylinder = onCylinder;
    }

    public LongFilter getOnLMO() {
        return onLMO;
    }

    public LongFilter onLMO() {
        if (onLMO == null) {
            onLMO = new LongFilter();
        }
        return onLMO;
    }

    public void setOnLMO(LongFilter onLMO) {
        this.onLMO = onLMO;
    }

    public LongFilter getOnConcentrators() {
        return onConcentrators;
    }

    public LongFilter onConcentrators() {
        if (onConcentrators == null) {
            onConcentrators = new LongFilter();
        }
        return onConcentrators;
    }

    public void setOnConcentrators(LongFilter onConcentrators) {
        this.onConcentrators = onConcentrators;
    }

    public InstantFilter getLastModified() {
        return lastModified;
    }

    public InstantFilter lastModified() {
        if (lastModified == null) {
            lastModified = new InstantFilter();
        }
        return lastModified;
    }

    public void setLastModified(InstantFilter lastModified) {
        this.lastModified = lastModified;
    }

    public StringFilter getLastModifiedBy() {
        return lastModifiedBy;
    }

    public StringFilter lastModifiedBy() {
        if (lastModifiedBy == null) {
            lastModifiedBy = new StringFilter();
        }
        return lastModifiedBy;
    }

    public void setLastModifiedBy(StringFilter lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public LongFilter getBedTypeId() {
        return bedTypeId;
    }

    public LongFilter bedTypeId() {
        if (bedTypeId == null) {
            bedTypeId = new LongFilter();
        }
        return bedTypeId;
    }

    public void setBedTypeId(LongFilter bedTypeId) {
        this.bedTypeId = bedTypeId;
    }

    public LongFilter getHospitalId() {
        return hospitalId;
    }

    public LongFilter hospitalId() {
        if (hospitalId == null) {
            hospitalId = new LongFilter();
        }
        return hospitalId;
    }

    public void setHospitalId(LongFilter hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final BedInventoryCriteria that = (BedInventoryCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(bedCount, that.bedCount) &&
            Objects.equals(occupied, that.occupied) &&
            Objects.equals(onCylinder, that.onCylinder) &&
            Objects.equals(onLMO, that.onLMO) &&
            Objects.equals(onConcentrators, that.onConcentrators) &&
            Objects.equals(lastModified, that.lastModified) &&
            Objects.equals(lastModifiedBy, that.lastModifiedBy) &&
            Objects.equals(bedTypeId, that.bedTypeId) &&
            Objects.equals(hospitalId, that.hospitalId) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            bedCount,
            occupied,
            onCylinder,
            onLMO,
            onConcentrators,
            lastModified,
            lastModifiedBy,
            bedTypeId,
            hospitalId,
            distinct
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "BedInventoryCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (bedCount != null ? "bedCount=" + bedCount + ", " : "") +
            (occupied != null ? "occupied=" + occupied + ", " : "") +
            (onCylinder != null ? "onCylinder=" + onCylinder + ", " : "") +
            (onLMO != null ? "onLMO=" + onLMO + ", " : "") +
            (onConcentrators != null ? "onConcentrators=" + onConcentrators + ", " : "") +
            (lastModified != null ? "lastModified=" + lastModified + ", " : "") +
            (lastModifiedBy != null ? "lastModifiedBy=" + lastModifiedBy + ", " : "") +
            (bedTypeId != null ? "bedTypeId=" + bedTypeId + ", " : "") +
            (hospitalId != null ? "hospitalId=" + hospitalId + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
