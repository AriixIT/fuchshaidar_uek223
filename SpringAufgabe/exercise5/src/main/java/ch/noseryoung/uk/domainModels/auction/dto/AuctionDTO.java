package ch.noseryoung.uk.domainModels.auction.dto;

import ch.noseryoung.uk.domainModels.article.Article;
import ch.noseryoung.uk.domainModels.bid.Bid;

import java.util.List;

public class AuctionDTO {

    private int id;

    private String description;

    private float fixedPrice;

    private float startingPrice;

    private List<Article> articles;

    private List<Bid> bids;

    //constructor and getters and setters
    public AuctionDTO() {}

    public int getId() {
        return id;
    }

    public AuctionDTO setId(int id) {
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

    public List<Article> getArticles() {
        return articles;
    }

    public AuctionDTO setArticles(List<Article> article) {
        this.articles = articles;
        return this;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public AuctionDTO setBids(List<Bid> bids) {
        this.bids = bids;
        return this;
    }
}
