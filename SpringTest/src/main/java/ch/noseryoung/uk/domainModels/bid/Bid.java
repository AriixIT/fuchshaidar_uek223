package ch.noseryoung.uk.domainModels.bid;

import ch.noseryoung.uk.domainModels.auction.Auction;
import ch.noseryoung.uk.domainModels.user.User;

import javax.persistence.*;

@Entity
@Table(name = "bid")
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(nullable = false)
    private int amount;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    public Bid(){}

    // Getters and setters
    public String getId() {
        return id;
    }

    public Bid setId(String id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Bid setUser(User user) {
        this.user = user;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public Bid setAmount(int amount) {
        this.amount = amount;
        return this;
    }

}
