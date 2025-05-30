package com.example.spotify_clone_backend.catalogcontext.applicationValueObjects.vo;

import jakarta.validation.constraints.NotBlank;

public record SongTitleVO(@NotBlank String value) {
}
