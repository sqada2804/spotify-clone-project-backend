package com.example.spotify_clone_backend.catalogcontext.applicationValueObjects.dto;

import com.example.spotify_clone_backend.catalogcontext.applicationValueObjects.vo.SongAuthorVO;
import com.example.spotify_clone_backend.catalogcontext.applicationValueObjects.vo.SongTitleVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record SaveSongDTO(@Valid SongTitleVO songTitleVO,
                         @Valid SongAuthorVO songAuthorVO,
                         @NotNull byte[] cover,
                         @NotNull String coverContentType,
                         @NotNull byte[] file,
                         @NotNull String fileContentType) {
}
