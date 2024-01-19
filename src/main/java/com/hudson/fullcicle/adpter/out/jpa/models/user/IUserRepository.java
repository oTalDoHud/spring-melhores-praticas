package com.hudson.fullcicle.adpter.out.jpa.models.user;

import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserEntity, Long> {
}
