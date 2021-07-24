package ru.tbrumble.restapi.repository.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.tbrumble.restapi.entity.user.UserEntity;

import java.util.List;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    List<UserEntity> findAll();
}
