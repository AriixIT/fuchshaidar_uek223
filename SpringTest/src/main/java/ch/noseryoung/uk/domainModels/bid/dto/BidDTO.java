package ch.noseryoung.uk.domainModels.bid.dto;

import ch.noseryoung.uk.domainModels.user.User;

public class BidDTO {

    private int id;

    private int amount;

    private User user;

    public BidDTO(){}

    // Getters and setters
    public int getId() {
        return id;
    }

    public BidDTO setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public BidDTO setUser(User user) {
        this.user = user;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public BidDTO setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
