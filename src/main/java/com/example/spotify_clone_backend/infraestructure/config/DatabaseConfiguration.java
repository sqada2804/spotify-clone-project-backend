package com.example.spotify_clone_backend.infraestructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({ "fr.sergi.spotifyclone.usercontext.repository", "fr.sergi.spotifyclone.catalogcontext.repository" })
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}
