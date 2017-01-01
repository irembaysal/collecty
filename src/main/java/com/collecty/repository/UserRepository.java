package com.collecty.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.collecty.entity.User;

@Repository
public interface UserRepository extends GraphRepository<User>{

}
