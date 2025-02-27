package com.koreait.short_url_project_02.domain.article.article.repository;

import com.koreait.short_url_project_02.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
