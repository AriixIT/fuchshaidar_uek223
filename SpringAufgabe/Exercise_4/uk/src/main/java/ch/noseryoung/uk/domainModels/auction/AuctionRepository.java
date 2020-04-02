package ch.noseryoung.uk.domainModels.auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public interface AuctionRepository extends JpaRepository<Auction, Integer> {

}