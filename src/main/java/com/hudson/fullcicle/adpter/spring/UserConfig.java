package com.hudson.fullcicle.adpter.spring;

import com.hudson.fullcicle.adpter.in.web.controller.IUserMapper;
import com.hudson.fullcicle.adpter.in.web.controller.UserMapperImpl;
import com.hudson.fullcicle.adpter.out.jpa.ports.user.IUserEntityMapper;
import com.hudson.fullcicle.adpter.out.jpa.models.user.IUserRepository;
import com.hudson.fullcicle.adpter.out.jpa.ports.user.UserEntityMapper;
import com.hudson.fullcicle.adpter.out.jpa.ports.user.UserRepositoryPort;
import com.hudson.fullcicle.application.ports.IUserInteractor;
import com.hudson.fullcicle.application.ports.IUserPort;
import com.hudson.fullcicle.application.usercases.UserInteractorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public IUserMapper iUserMapper() {
        return new UserMapperImpl();
    }

    @Bean
    public IUserEntityMapper iUserEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    public IUserPort iUserPort(IUserEntityMapper iUserEntityMapper, IUserRepository iUserRepository) {
        return new UserRepositoryPort(iUserEntityMapper, iUserRepository);
    }

    @Bean
    public IUserInteractor iUserInteractor(IUserPort iUserPort) {
        return new UserInteractorImpl(iUserPort);
    }

}
