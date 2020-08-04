package ua.pp.rieltorzlo.models;

import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String header;
    private String description;
    private Long authorId;

    public Ad() {
    }
    public Ad(String header, String description, Long authorId) {
        this.header = header;
        this.description = description;
        this.authorId = authorId;
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

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Add{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", description='" + description + '\'' +
                ", authorId='" + authorId + '\'' +
                '}';
    }
}
