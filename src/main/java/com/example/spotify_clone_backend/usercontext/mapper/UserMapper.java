package com.example.spotify_clone_backend.usercontext.mapper;

import com.example.spotify_clone_backend.usercontext.ReadUserDTO;
import com.example.spotify_clone_backend.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTO(User entity);
}
