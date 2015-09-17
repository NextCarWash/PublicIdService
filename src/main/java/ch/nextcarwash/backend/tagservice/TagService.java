package ch.nextcarwash.backend.tagservice;

import ch.nextcarwash.backend.tagservice.repo.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

/**
 * Verwaltet die Eigenschaften aka "Tags"
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(TagServiceConfiguration.class)
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public static void main(String[] args) {
        // Will configure using accounts-server.yml
        System.setProperty("spring.config.name", "tag-service");

        SpringApplication.run(TagService.class, args);
    }
}
