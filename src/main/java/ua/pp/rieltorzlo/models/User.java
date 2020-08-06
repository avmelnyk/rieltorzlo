package ua.pp.rieltorzlo.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue()
    private Long id;
    private  String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    @OneToMany(mappedBy="user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Ad> ads;

    public User(){}

    public User(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
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

    public Set<Ad> getAds() {
        return ads;
    }

    public void setAds(Set<Ad> ads) {
        this.ads = ads;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(email, user.email) &&
                Objects.equals(ads, user.ads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phoneNumber, email, ads);
    }
}
