package com.example.bootbasic.controller;

import com.example.bootbasic.dto.ArticleForm;
import com.example.bootbasic.entity.Article;
import com.example.bootbasic.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired // auto-generate object from abstract
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticlesForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticlesForm(ArticleForm form) {
        System.out.println(form.toString());

        //DTO to Entity
        Article article = form.toEntity();

        //let Repository save Entity in DB
        Article saved = articleRepository.save(article);

        return "articles/new";
    }


}
