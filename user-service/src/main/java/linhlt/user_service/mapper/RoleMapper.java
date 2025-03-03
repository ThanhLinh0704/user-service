package linhlt.user_service.mapper;

import linhlt.user_service.dto.request.RoleRequest;
import linhlt.user_service.dto.response.RoleResponse;
import linhlt.user_service.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest roleRequest);
    RoleResponse toRoleResponse(Role role);
}
