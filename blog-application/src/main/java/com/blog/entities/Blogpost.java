package com.blog.entities;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Blogpost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // use Integer

    private String title;
    private String content;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publishDate;

    private String image;

    @ManyToOne
    private User user;

    // No-args constructor
    public Blogpost() {}

    // Getters and Setters using correct types
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public LocalDate getPublishDate() { return publishDate; }
    public void setPublishDate(LocalDate publishDate) { this.publishDate = publishDate; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    @Override
    public String toString() {
        return "Blogpost [id=" + id + ", title=" + title + ", content=" + content + ", publishDate=" + publishDate + ", image=" + image + "]";
    }
}
