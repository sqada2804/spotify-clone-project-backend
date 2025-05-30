package com.example.spotify_clone_backend.catalogcontext.repository;

import com.example.spotify_clone_backend.catalogcontext.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
