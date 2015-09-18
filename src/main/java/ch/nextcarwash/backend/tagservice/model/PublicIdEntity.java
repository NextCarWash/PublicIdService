package ch.nextcarwash.backend.tagservice.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Eine Basisklasse für alle Entitäten mit öffentlichem Schlüssel
 */
@MappedSuperclass
public abstract class PublicIdEntity extends CreateTimeTrackEntity {
    /** Öffentlicher Schlüssel dieser Entität */
    @Column(name = "PUBLIC_ID", nullable = false, unique = true)
    private String publicId;

    /**
     * @return Öffentlicher Schlüssel dieser Entität
     */
    public String getPublicId() {
        return publicId;
    }

    /**
     * @param publicId Öffentlicher Schlüssel dieser Entität
     */
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublicIdEntity that = (PublicIdEntity) o;

        if (publicId != null ? !publicId.equals(that.publicId) : that.publicId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return publicId != null ? publicId.hashCode() : 0;
    }
}
