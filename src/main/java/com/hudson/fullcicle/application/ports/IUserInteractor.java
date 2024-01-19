package com.hudson.fullcicle.application.ports;

import com.hudson.fullcicle.domain.entity.User;

public interface IUserInteractor {

    User createuser(User userDomain);
}
