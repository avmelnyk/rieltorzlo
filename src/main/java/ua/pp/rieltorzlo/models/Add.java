package ua.pp.rieltorzlo.models;

import javax.persistence.*;

@Entity
@Table(name = "adds")
public class Add {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String header;
    private String description;
    private String author;

    public Add() {
    }
    public Add( String header, String description, String author) {
        this.header = header;
        this.description = description;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Add{" +
                "id=" + id +
                ", header='" + header + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
