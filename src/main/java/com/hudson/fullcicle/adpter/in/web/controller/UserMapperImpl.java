package com.hudson.fullcicle.adpter.in.web.controller;

import com.hudson.fullcicle.adpter.in.web.controller.models.UserReponse;
import com.hudson.fullcicle.adpter.in.web.controller.models.UserRequest;
import com.hudson.fullcicle.domain.entity.User;
import org.springframework.stereotype.Service;

public class UserMapperImpl implements IUserMapper {

    @Override
    public User requestToDomain(UserRequest userRequest) {
        return new User(userRequest.name(), userRequest.password());
    }

    @Override
    public UserReponse domainToResponse(User userDomain) {
        return new UserReponse(userDomain.name());
    }
}
