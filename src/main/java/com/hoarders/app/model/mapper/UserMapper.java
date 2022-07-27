package com.hoarders.app.model.mapper;

import com.hoarders.app.model.dto.UserDto;
import com.hoarders.app.model.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "username", source = "username")
    User dtoToUser(UserDto userDto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "username", source = "username")
    UserDto userToDto(User user);

}
