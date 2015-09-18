package ch.nextcarwash.backend.tagservice.repo;

import ch.nextcarwash.backend.tagservice.model.TagEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Datenbank-Zugriff auf die Tags
 */
@RepositoryRestResource(collectionResourceRel = "tag", path="tag")
public interface TagRepository extends CrudRepository<TagEntity, Long> {
}
