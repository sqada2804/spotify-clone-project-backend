package com.example.spotify_clone_backend.catalogcontext.repository;

import com.example.spotify_clone_backend.catalogcontext.domain.SongContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {
}
