package com.example.SittersProject.postables.model;

import com.example.SittersProject.user.model.User;

import java.time.LocalDateTime;

public class Comment {
    private String text;
    private Float rating;
    private LocalDateTime postedDate;
    private User author;

    public Comment(String text, Float rating, LocalDateTime postedDate, User author) {
        this.text = text;
        this.rating = rating;
        this.postedDate = postedDate;
        this.author = author;
    }

    public Comment(String text, float rating, LocalDateTime now) {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public LocalDateTime getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }



}
