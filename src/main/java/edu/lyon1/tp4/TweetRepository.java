package edu.lyon1.tp4;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TweetRepository extends CrudRepository<Tweet,Integer> {
    List<Tweet> findAllByAuteurOrderByDateDesc(String auteur);

    List<Tweet> findAllByOrderByDateDesc();

}
