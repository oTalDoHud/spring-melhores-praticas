package com.hudson.fullcicle.application.usercases;

import com.hudson.fullcicle.application.ports.IUserInteractor;
import com.hudson.fullcicle.application.ports.IUserPort;
import com.hudson.fullcicle.domain.entity.User;

public class UserInteractorImpl implements IUserInteractor {

    private final IUserPort iUserPort;

    public UserInteractorImpl(IUserPort iUserPort) {
        this.iUserPort = iUserPort;
    }

    @Override
    public User createuser(User userDomain) {
        return iUserPort.createuser(userDomain);
    }
}
