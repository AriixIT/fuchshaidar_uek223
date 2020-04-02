package ch.noseryoung.uk.domainModels.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository repository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository){
        this.repository = articleRepository;
    }

    @Override
    public Article create(Article article) {
        return repository.save(article);
    }

    @Override
    public List<Article> findAll() {
        return repository.findAll();
    }

    @Override
    public Article findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Article updateById(int id, Article article) {
        if(repository.existsById(id)) {
            article.setId(id);
            repository.save(article);

            return article;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
