package com.example.spotify_clone_backend.catalogcontext.applicationValueObjects.vo;

import jakarta.validation.constraints.NotBlank;

public record SongAuthorVO(@NotBlank String value) {

}
