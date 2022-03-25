package com.example.bootbasic.controller;

import com.example.bootbasic.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticlesForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticlesForm(ArticleForm form) {
        System.out.println(form.toString());
        return "articles/new";
    }


}
