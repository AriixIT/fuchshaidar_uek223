package ch.noseryoung.uk.domainModels.auction;

import ch.noseryoung.uk.domainModels.article.Article;
import ch.noseryoung.uk.domainModels.bid.BidService;
import ch.noseryoung.uk.domainModels.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AuctionServiceImpl implements AuctionService {

    AuctionRepository auctionRepository;

    @Autowired
    public AuctionServiceImpl(AuctionRepository repository){
        this.auctionRepository = repository;
    }

    @Override
    public Auction create(Auction auction) {
        return auctionRepository.save(auction);
    }

    @Override
    public List<Auction> findAll() {
        return auctionRepository.findAll();
    }

    @Override
    public Auction findById(String id) {
        return auctionRepository.findById(id).get();
    }

    @Override
    public Auction updateById(String id, Auction auction) {
        if(auctionRepository.existsById(id)) {
            auction.setId(id);
            auctionRepository.save(auction);

            return auction;
        } else {
            throw new NoSuchElementException("No value present");
        }    }

    @Override
    public void deleteById(String id) {
        auctionRepository.deleteById(id);
    }

    @Override
    public List<Auction> getAllByUser(String userId){
        List<Auction> auctionsOfUser = new ArrayList<>();
        for(Auction auction : findAll()){
            if(auction.getUser().getId() == userId){
                auctionsOfUser.add(auction);
            }
        }

        return auctionsOfUser;
    }

    @Override
    public List<Auction> filterAllAuctionsWithNoBidsMade(List<Auction> auctions) {
        List<Auction> auctionsWithBids = new ArrayList<>();
        for(Auction auction : auctions){
            if(auction.getBids().size() > 0){
                auctionsWithBids.add(auction);
            }
        }
        return auctionsWithBids;
    }

    @Override
    public List<Article> getArticlesOfAuctionsWithBidByUser(String userId) {
        List<Auction> auctions = getAllByUser(userId);
        auctions = filterAllAuctionsWithNoBidsMade(auctions);
        List<Article> articles = new ArrayList<>();

        for(Auction auction : auctions){
            articles.add(auction.getArticle());
        }
        return articles;
    }

}
