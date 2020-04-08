package ch.noseryoung.uk.domainModels.article;

import ch.noseryoung.uk.domainModels.authority.Authority;

import java.util.List;

public interface ArticleService {
    Article create(Article article);

    List<Article> findAll();

    Article findById(String id);

    Article updateById(String id, Article article);

    void deleteById(String id);
}
