package ch.nextcarwash.backend.tagservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Entität für die Kategorisierung einer Anlage
 */
@Entity
@Table(name = "tag")
public class TagEntity extends PublicIdEntity {

    /** Name des Tags. Dieses wird dem Benutzer angezeigt */
    @Column(name="name", nullable = false, unique = true)
    private String name;

    /** Beschreibung des Tags */
    @Column(name="description")
    private String description;

    public TagEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
