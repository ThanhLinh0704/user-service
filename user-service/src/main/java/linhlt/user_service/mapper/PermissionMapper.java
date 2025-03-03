package linhlt.user_service.mapper;

import linhlt.user_service.dto.request.PermissionRequest;
import linhlt.user_service.dto.request.UserRequest;
import linhlt.user_service.dto.response.PermissionResponse;
import linhlt.user_service.dto.response.UserResponse;
import linhlt.user_service.entity.Permission;
import linhlt.user_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest permissionRequest);
    PermissionResponse toPermissionResponse(Permission permission);
}
