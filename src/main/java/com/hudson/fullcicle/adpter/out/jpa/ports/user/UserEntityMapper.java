package com.hudson.fullcicle.adpter.out.jpa.ports.user;

import com.hudson.fullcicle.adpter.out.jpa.models.user.UserEntity;
import com.hudson.fullcicle.domain.entity.User;

public class UserEntityMapper implements IUserEntityMapper {

    @Override
    public User entityToDomain(UserEntity userEntity) {
        return new User(userEntity.getName(), userEntity.getPassword());
    }

    @Override
    public UserEntity domainToEntity(User userDomain) {
        return new UserEntity(null, userDomain.name(), userDomain.password());
    }
}
