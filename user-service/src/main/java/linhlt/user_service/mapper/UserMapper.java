package linhlt.user_service.mapper;

import linhlt.user_service.dto.request.UserRequest;
import linhlt.user_service.dto.response.UserResponse;
import linhlt.user_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserRequest userRequest);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserRequest userRequest);
}
