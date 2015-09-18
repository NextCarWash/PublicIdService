package ch.nextcarwash.backend.tagservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by surech on 17.09.15.
 */
@SpringBootApplication
@EntityScan("ch.nextcarwash.backend.tagservice.model")
@EnableJpaRepositories("ch.nextcarwash.backend.tagservice.repo")
public class TagServiceConfiguration {
}
