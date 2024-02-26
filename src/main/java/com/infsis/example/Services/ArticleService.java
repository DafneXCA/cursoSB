package com.infsis.example.Services;

import com.infsis.example.DTOs.ArticleDTO;
import com.infsis.example.DTOs.UserDTO;

import java.util.List;

public interface ArticleService {
    List<ArticleDTO> getArticles();
    ArticleDTO getArticleById(Integer userId);

    ArticleDTO saveArticle(UserDTO userDTO);

    ArticleDTO updateArticle(Integer userId, UserDTO userDTO);
    void delete(Integer userId);
}
