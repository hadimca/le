package com.lealpha.learningwhilesleeping.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import java.lang.reflect.Type;
import java.util.stream.Collectors;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
                .map(e -> e.getJavaType()).collect(Collectors.toList()).toArray(new Class[0]));



    }
}
