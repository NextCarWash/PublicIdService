package ch.nextcarwash.backend.tagservice;

import ch.nextcarwash.backend.tagservice.model.TagEntity;
import ch.nextcarwash.backend.tagservice.repo.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;

/**
 * Verwaltet die Eigenschaften aka "Tags"
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(TagServiceConfiguration.class)
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    @PostConstruct
    private void init() {
        System.out.println("======================");
        System.out.println(" Ich bin gestartet!!!");
        System.out.println("======================");

        TagEntity tag = new TagEntity();
        tag.setPublicId("TG1234");
        tag.setName("Waschstrasse");
        tagRepository.save(tag);
    }

    public static void main(String[] args) {
        // Will configure using accounts-server.yml
        System.setProperty("spring.config.name", "tag-service");

        SpringApplication.run(TagService.class, args);
    }
}
