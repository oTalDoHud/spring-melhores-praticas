package com.hudson.fullcicle.adpter.in.web.controller;

import com.hudson.fullcicle.adpter.in.web.controller.models.UserReponse;
import com.hudson.fullcicle.adpter.in.web.controller.models.UserRequest;
import com.hudson.fullcicle.application.ports.IUserInteractor;
import com.hudson.fullcicle.domain.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final IUserMapper IUserMapper;

    private final IUserInteractor iUserInteractor;

    public UserController(IUserMapper iUserMapper, IUserInteractor iUserPort) {
        IUserMapper = iUserMapper;
        this.iUserInteractor = iUserPort;
    }


    @PostMapping
    public UserReponse createUser(@RequestBody UserRequest userRequest) {
        User userDomain = IUserMapper.requestToDomain(userRequest);
        User userSaved = iUserInteractor.createuser(userDomain);
        return IUserMapper.domainToResponse(userSaved);
    }
}
