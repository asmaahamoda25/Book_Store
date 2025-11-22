package com.mycompany.bookstore.model;
import com.mycompany.bookstore.util.PasswordUtil;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class Customer {
    private int customerID;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String username;
    private String passwordHash;
    private String communicationPreference;
    private LocalDate accDateCreated;
    private LocalDate accDateUpdated;
    
    private List<Orders> orders;
    private List<Review> reviews;
    private List<WishList> wishList;
    private List<Preference> preferences;

    public Customer(String firstName, String lastName, 
            String address, String phoneNumber, 
            String email, String username, String passwordPlain, 
            String communicationPreference, LocalDate accDateCreated, 
            LocalDate accDateUpdated) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.username = username;
        this.passwordHash = PasswordUtil.hashPassword(passwordPlain);
        this.communicationPreference = communicationPreference;
        this.accDateCreated = accDateCreated;
        this.accDateUpdated = accDateUpdated;
    }

    public Customer()
    {
        this.orders = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.wishList = new ArrayList<>();
        this.preferences = new ArrayList<>();
    }
    
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return passwordHash;
    }

    public void setPassword(String password) {
        this.passwordHash = PasswordUtil.hashPassword(password);
    }

    public String getCommunicationPreference() {
        return communicationPreference;
    }

    public void setCommunicationPreference(String communicationPreference) {
        this.communicationPreference = communicationPreference;
    }

    public LocalDate getAccDateCreated() {
        return accDateCreated;
    }

    public void setAccDateCreated(LocalDate accDateCreated) {
        this.accDateCreated = accDateCreated;
    }

    public LocalDate getAccDateUpdated() {
        return accDateUpdated;
    }

    public void setAccDateUpdated(LocalDate accDateUpdated) {
        this.accDateUpdated = accDateUpdated;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<WishList> getWishList() {
        return wishList;
    }

    public void setWishList(List<WishList> wishList) {
        this.wishList = wishList;
    }

    public List<Preference> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<Preference> preferences) {
        this.preferences = preferences;
    }
 
    
    public boolean checkPassword(String plainPassword) {
        return PasswordUtil.checkPassword(plainPassword, this.passwordHash);
    }
    
}