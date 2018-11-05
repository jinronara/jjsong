package com.jinronara.domain;

import org.springframework.data.repository.CrudRepository;

public interface PostsRepository extends CrudRepository<PostsEntity, Long>{ 
	
}