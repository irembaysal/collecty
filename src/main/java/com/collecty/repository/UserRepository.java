package com.collecty.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import com.collecty.entity.User;

@Repository
public interface UserRepository extends GraphRepository<User>{

	//@Query("MATCH (n:`User`) WHERE n.`username` = {  }")
	public List<User> findByUsername(String username);
}
