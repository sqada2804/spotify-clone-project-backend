package com.example.spotify_clone_backend.catalogcontext.repository;

import com.example.spotify_clone_backend.catalogcontext.domain.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}
