package ch.noseryoung.uk.domainModels.auction;
import org.springframework.beans.factory.annotation.Autowired;
import ch.noseryoung.uk.domainModels.user.User;
import org.hibernate.annotations.Type;
import ch.noseryoung.uk.domainModels.article.Article;
import javax.persistence.*;
import org.springframework.web.bind.annotation.*;

@Entity

@Table(name = "auction")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String description;

    @Column(name = "fixed_price")
    private float fixedPrice;

    @Column(name = "starting_price")
    private float startingPrice;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean is_public;

    //Entität
    @OneToOne
    @JoinTable(name = "id_article")
    private Article article ;

    @ManyToOne
    @JoinTable(name = "id_user")
    private User user ;


    //Constructor and getter and setter
    public Auction() {
    }

    public int getId() {
        return id;
    }

    public Auction setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Auction setDescription(String description) {
        this.description = description;
        return this;

    }

    public float getFixedPrice() {
        return fixedPrice;
    }

    public Auction setFixedPrice(float fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;

    }

    public float getStartingPrice() {
        return startingPrice;
    }

    public Auction setStartingPrice(float startingPrice) {
        this.startingPrice = startingPrice;
        return this;

    }

    public Boolean getIs_public() {
        return is_public;
    }

    public Auction setIs_public(Boolean is_public) {
        this.is_public = is_public;
        return this;

    }



}
