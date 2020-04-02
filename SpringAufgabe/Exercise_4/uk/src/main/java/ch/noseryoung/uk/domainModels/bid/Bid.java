package ch.noseryoung.uk.domainModels.bid;

import ch.noseryoung.uk.domainModels.article.Article;
import ch.noseryoung.uk.domainModels.auction.Auction;
import ch.noseryoung.uk.domainModels.user.User;

import javax.persistence.*;

@Entity
@Table(name = "bid")
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;


    //Entitäten

    @ManyToOne
    @JoinTable(name = "id_user")
    private User user ;

    @ManyToOne
    @JoinTable(name = "id_auction")
    private Auction auction ;

    //Constructor and getter and setter

    public Bid() {
    }


    public int getId() {
        return id;
    }

    public Bid setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Bid setName(String name) {
        this.name = name;
        return this;
    }
}