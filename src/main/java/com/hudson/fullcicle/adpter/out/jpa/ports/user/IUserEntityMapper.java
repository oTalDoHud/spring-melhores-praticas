package com.hudson.fullcicle.adpter.out.jpa.ports.user;

import com.hudson.fullcicle.adpter.out.jpa.models.user.UserEntity;
import com.hudson.fullcicle.domain.entity.User;

public interface IUserEntityMapper {

    User entityToDomain(UserEntity save);

    UserEntity domainToEntity(User userDomain);
}
