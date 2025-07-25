package com.br.effecta.workshopmongo.services;

import com.br.effecta.workshopmongo.domain.Post;
import com.br.effecta.workshopmongo.repository.PostRepository;
import com.br.effecta.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findById(String id) {
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return postRepository.searchTitle(text);
    }

    public List<Post> fullSearch(String text, LocalDate minDate, LocalDate maxDate) {
        return postRepository.fullSearch(text, minDate, maxDate);
    }
}
