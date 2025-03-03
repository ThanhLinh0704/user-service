package linhlt.user_service.mapper;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import linhlt.user_service.dto.request.UserRequest;
import linhlt.user_service.dto.response.UserResponse;
import linhlt.user_service.entity.Role;
import linhlt.user_service.entity.User;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-03T11:34:22+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.username( userRequest.getUsername() );
        user.password( userRequest.getPassword() );
        user.firstName( userRequest.getFirstName() );
        user.lastName( userRequest.getLastName() );
        user.birthday( userRequest.getBirthday() );

        return user.build();
    }

    @Override
    public UserResponse toUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.id( user.getId() );
        userResponse.username( user.getUsername() );
        userResponse.firstName( user.getFirstName() );
        userResponse.lastName( user.getLastName() );
        userResponse.birthday( user.getBirthday() );
        Set<Role> set = user.getRoles();
        if ( set != null ) {
            userResponse.roles( new LinkedHashSet<Role>( set ) );
        }

        return userResponse.build();
    }

    @Override
    public void updateUser(User user, UserRequest userRequest) {
        if ( userRequest == null ) {
            return;
        }

        user.setUsername( userRequest.getUsername() );
        user.setPassword( userRequest.getPassword() );
        user.setFirstName( userRequest.getFirstName() );
        user.setLastName( userRequest.getLastName() );
        user.setBirthday( userRequest.getBirthday() );
    }
}
