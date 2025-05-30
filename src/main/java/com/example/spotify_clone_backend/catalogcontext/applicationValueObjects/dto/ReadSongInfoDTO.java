package com.example.spotify_clone_backend.catalogcontext.applicationValueObjects.dto;

import com.example.spotify_clone_backend.catalogcontext.applicationValueObjects.vo.SongAuthorVO;
import com.example.spotify_clone_backend.catalogcontext.applicationValueObjects.vo.SongTitleVO;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class ReadSongInfoDTO {
    private SongTitleVO title;

    private SongAuthorVO author;

    @NotNull
    private byte[] cover;

    @NotNull
    private String contentType;

    @NotNull
    private boolean isFavorite;

    @NotNull
    private UUID publicId;

    public SongTitleVO getTitle() {
        return title;
    }

    public void setTitle(SongTitleVO title) {
        this.title = title;
    }

    public SongAuthorVO getAuthor() {
        return author;
    }

    public void setAuthor(SongAuthorVO author) {
        this.author = author;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public UUID getPublicId() {
        return publicId;
    }

    public void setPublicId(UUID publicId) {
        this.publicId = publicId;
    }
}
