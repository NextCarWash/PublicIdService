package ch.nextcarwash.backend.tagservice.model;

import javax.persistence.*;

/**
 * Created by surech on 15.02.14.
 */
@MappedSuperclass
public abstract class BaseEntity {

    /**
     * Technischer Primärschlüssel. Wird von JPA vergeben
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    /**
     * @return Technischer Primärschlüssel
     */
    public Long getId() {
        return id;
    }
}
