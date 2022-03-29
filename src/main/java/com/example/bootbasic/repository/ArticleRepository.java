package com.example.bootbasic.repository;

import com.example.bootbasic.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
