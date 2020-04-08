package ch.noseryoung.uk.domainModels.auction;

import ch.noseryoung.uk.domainModels.article.Article;

import java.util.List;

public interface AuctionService {
    Auction create(Auction auction);

    List<Auction> findAll();

    Auction findById(String id);

    Auction updateById(String id, Auction auction);

    void deleteById(String id);

    List<Auction> getAllByUser(String userId);

    List<Auction> filterAllAuctionsWithNoBidsMade(List<Auction> auctions);

    List<Article> getArticlesOfAuctionsWithBidByUser(String userId);
}
