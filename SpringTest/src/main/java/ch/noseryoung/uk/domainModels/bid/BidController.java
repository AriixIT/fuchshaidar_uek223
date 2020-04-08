package ch.noseryoung.uk.domainModels.bid;

import ch.noseryoung.uk.domainModels.bid.dto.BidDTO;
import ch.noseryoung.uk.domainModels.bid.dto.BidMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bids")
public class BidController {

    private BidService bidService;

    private BidMapper bidMapper;

    @Autowired
    public BidController(BidService service, BidMapper bidMapper) {
        this.bidService = service;
        this.bidMapper = bidMapper;
    }

    @PostMapping({"/", ""})
    public ResponseEntity<BidDTO> create(@RequestBody BidDTO bid) {
        return new ResponseEntity<>(bidMapper.toDTO(bidService.create(bidMapper.fromDTO(bid))), HttpStatus.CREATED);
    }

    @GetMapping({"/", ""})
    public ResponseEntity<List<BidDTO>> getAll() {
        return new ResponseEntity<>(bidMapper.toDTOs(bidService.findAll()), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BidDTO> getById(@PathVariable String id) {
        return new ResponseEntity<>(bidMapper.toDTO(bidService.findById(id)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BidDTO> updateById(@PathVariable String id, @RequestBody BidDTO bid) {
        return new ResponseEntity<>(bidMapper.toDTO(bidService.updateById(id, bidMapper.fromDTO(bid))), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id) {
        bidService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
