package com.example.spotify_clone_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com/example/spotify_clone_backend/usercontext/repository")
public class SpotifyCloneBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpotifyCloneBackendApplication.class, args);
	}

}
