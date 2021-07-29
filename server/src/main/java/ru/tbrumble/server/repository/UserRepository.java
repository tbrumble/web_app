package ru.tbrumble.server.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.tbrumble.restapi.entity.user.UserEntity;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
}
