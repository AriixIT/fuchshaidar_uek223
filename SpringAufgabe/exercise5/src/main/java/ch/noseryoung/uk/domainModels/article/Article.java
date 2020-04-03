package ch.noseryoung.uk.domainModels.article;
import javax.persistence.*;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int value;



    //Constructor and getter and setter
    public Article() {
    }

    public int getId() {
        return id;
    }

    public Article setId(int id) {
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

    public int getValue() {
        return value;
    }

    public Article setValue(int value) {
        this.value = value;
        return this;
    }
}
