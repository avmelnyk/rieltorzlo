package ua.pp.rieltorzlo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "ads")
public class Ad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String header;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Ad() {
    }

    public Ad(String header, String description, User user) {
        this.header = header;
        this.description = description;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad ad = (Ad) o;
        return Objects.equals(id, ad.id) &&
                Objects.equals(header, ad.header) &&
                Objects.equals(description, ad.description) &&
                Objects.equals(user, ad.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, header, description, user);
    }
}
