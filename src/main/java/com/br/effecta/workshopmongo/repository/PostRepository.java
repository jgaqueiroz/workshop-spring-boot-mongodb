package com.br.effecta.workshopmongo.repository;

import com.br.effecta.workshopmongo.domain.Post;
import com.br.effecta.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
