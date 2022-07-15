package com.hoarders.app.model.mapper;

import com.hoarders.app.model.dto.UserDto;
import com.hoarders.app.model.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

    UserDtoMapper MAPPER = Mappers.getMapper(UserDtoMapper.class);

    User dtoToUser(UserDto userDto);

    UserDto userToDto(User user);

}
