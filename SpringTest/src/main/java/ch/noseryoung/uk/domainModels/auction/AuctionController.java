package ch.noseryoung.uk.domainModels.auction;

import ch.noseryoung.uk.domainModels.article.Article;
import ch.noseryoung.uk.domainModels.article.dto.ArticleDTO;
import ch.noseryoung.uk.domainModels.article.dto.ArticleMapper;
import ch.noseryoung.uk.domainModels.auction.dto.AuctionDTO;
import ch.noseryoung.uk.domainModels.auction.dto.AuctionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionService auctionService;

    private AuctionMapper auctionMapper;

    private ArticleMapper articleMapper;

    @Autowired
    public AuctionController(AuctionService service, AuctionMapper auctionMapper, ArticleMapper articleMapper) {
        this.auctionService = service;
        this.auctionMapper = auctionMapper;
        this.articleMapper = articleMapper;
    }

    @PostMapping({"/", ""})
    public ResponseEntity<AuctionDTO> create(@RequestBody AuctionDTO auction) {
        return new ResponseEntity<>(auctionMapper.toDTO(auctionService.create(auctionMapper.fromDTO(auction))), HttpStatus.CREATED);
    }

    @GetMapping({"/", ""})
    public ResponseEntity<List<AuctionDTO>> getAll() {
        return new ResponseEntity<>(auctionMapper.toDTOs(auctionService.findAll()), HttpStatus.OK);
    }

    @GetMapping({"/getArticlesOfAuctionsWithBid/{id}"})
    public ResponseEntity<List<ArticleDTO>> getArticlesOfAuctionsWithBid(@PathVariable String id) {
        return new ResponseEntity<>(articleMapper.toDTOs(auctionService.getArticlesOfAuctionsWithBidByUser(id)), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuctionDTO> getById(@PathVariable String id) {
        return new ResponseEntity<>(auctionMapper.toDTO(auctionService.findById(id)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AuctionDTO> updateById(@PathVariable String id, @RequestBody AuctionDTO auction) {
        return new ResponseEntity<>(auctionMapper.toDTO(auctionService.updateById(id, auctionMapper.fromDTO(auction))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        auctionService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
