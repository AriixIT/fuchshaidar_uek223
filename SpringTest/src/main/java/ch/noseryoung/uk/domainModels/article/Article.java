package ch.noseryoung.uk.domainModels.article;

import javax.persistence.*;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private float value;

    public Article(){}

    public String getId() {
        return id;
    }

    public Article setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Article setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Article setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getValue() {
        return value;
    }

    public Article setValue(float value) {
        this.value = value;
        return this;
    }
}
