package org.tic.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import org.tic.entities.Article;

@RepositoryRestController
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
