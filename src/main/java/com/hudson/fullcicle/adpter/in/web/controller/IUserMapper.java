package com.hudson.fullcicle.adpter.in.web.controller;

import com.hudson.fullcicle.adpter.in.web.controller.models.UserReponse;
import com.hudson.fullcicle.adpter.in.web.controller.models.UserRequest;
import com.hudson.fullcicle.domain.entity.User;

public interface IUserMapper {
    User requestToDomain(UserRequest userRequest);

    UserReponse domainToResponse(User userDomain);
}
