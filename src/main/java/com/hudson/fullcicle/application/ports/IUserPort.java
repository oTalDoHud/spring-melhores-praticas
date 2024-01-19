package com.hudson.fullcicle.application.ports;

import com.hudson.fullcicle.domain.entity.User;

public interface IUserPort {

    User createuser(User userDomain);
}
