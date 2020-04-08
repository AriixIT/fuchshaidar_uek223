package ch.noseryoung.uk.domainModels.auction.dto;

import ch.noseryoung.uk.domainModels.article.Article;
import ch.noseryoung.uk.domainModels.bid.Bid;
import ch.noseryoung.uk.domainModels.user.User;

import java.util.Set;

public class AuctionDTO {

    private String id;

    private String description;

    private float fixedPrice;

    private float startingPrice;

    private boolean isPublic;

    private Set<Bid> bids;

    private Article article;

    private User user;

    public AuctionDTO(){}

    public String getId() {
        return id;
    }

    public AuctionDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AuctionDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getFixedPrice() {
        return fixedPrice;
    }

    public AuctionDTO setFixedPrice(float fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    public float getStartingPrice() {
        return startingPrice;
    }

    public AuctionDTO setStartingPrice(float startingPrice) {
        this.startingPrice = startingPrice;
        return this;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public AuctionDTO setPublic(boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    public Article getArticle() {
        return article;
    }

    public AuctionDTO setArticle(Article article) {
        this.article = article;
        return this;
    }

    public User getUser() {
        return user;
    }

    public AuctionDTO setUser(User user) {
        this.user = user;
        return this;
    }

    public Set<Bid> getBids() {
        return bids;
    }

    public AuctionDTO setBids(Set<Bid> bids) {
        this.bids = bids;
        return this;
    }

}
