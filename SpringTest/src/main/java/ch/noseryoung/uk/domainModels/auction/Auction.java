package ch.noseryoung.uk.domainModels.auction;

import ch.noseryoung.uk.domainModels.article.Article;
import ch.noseryoung.uk.domainModels.bid.Bid;
import ch.noseryoung.uk.domainModels.user.User;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "auction")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false, name = "fixed_price")
    private float fixedPrice;

    @Column(nullable = false, name = "starting_price")
    private float startingPrice;

    @Column(nullable = false, name = "is_public")
    private boolean isPublic;

    @OneToMany()
    @JoinColumn(name = "bids")
    private Set<Bid> bids;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Auction(){}

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

    public boolean isPublic() {
        return isPublic;
    }

    public Auction setPublic(boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    public Article getArticle() {
        return article;
    }

    public Auction setArticle(Article article) {
        this.article = article;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Auction setUser(User user) {
        this.user = user;
        return this;
    }

    public Set<Bid> getBids() {
        return bids;
    }

    public Auction setBids(Set<Bid> bids) {
        this.bids = bids;
        return this;
    }

}
