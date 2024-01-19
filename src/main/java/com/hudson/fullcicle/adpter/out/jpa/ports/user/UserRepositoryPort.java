package com.hudson.fullcicle.adpter.out.jpa.ports.user;

import com.hudson.fullcicle.adpter.out.jpa.models.user.IUserRepository;
import com.hudson.fullcicle.adpter.out.jpa.models.user.UserEntity;
import com.hudson.fullcicle.application.ports.IUserPort;
import com.hudson.fullcicle.domain.entity.User;

public class UserRepositoryPort implements IUserPort {

    private final IUserEntityMapper iUserEntityMapper;

    private final IUserRepository IUserRepository;

    public UserRepositoryPort(IUserEntityMapper iUserEntityMapper, IUserRepository iUserRepository) {
        this.iUserEntityMapper = iUserEntityMapper;
        IUserRepository = iUserRepository;
    }

    @Override
    public User createuser(User userDomain) {
        return iUserEntityMapper.entityToDomain(
                IUserRepository.save(iUserEntityMapper
                        .domainToEntity(userDomain)));
    }

}
