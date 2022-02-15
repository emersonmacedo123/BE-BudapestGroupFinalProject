package com.example.SittersProject.Model;

import java.time.LocalDateTime;

public class Comment {
    private String text;
    private Float rating;
    private LocalDateTime postedDate;
    private userEntity author;

    public Comment(String text, Float rating, LocalDateTime postedDate, userEntity author) {
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

    public userEntity getAuthor() {
        return author;
    }

    public void setAuthor(userEntity author) {
        this.author = author;
    }



}
