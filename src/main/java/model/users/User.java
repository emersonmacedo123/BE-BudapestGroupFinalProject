package main.java.model.users;

import main.java.model.comments.Comment;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Float averageRating;
    private List<Comment> commentList;
    private final Float INITIAL_RATING = 2.5F;

    public User(int id, String firstName, String lastName, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.averageRating = INITIAL_RATING;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Float averageRating) {
        this.averageRating = averageRating;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public void setNewComment(Comment newComment){
        if (commentList == null) {
            commentList = new ArrayList<Comment>();
        }
        commentList.add(newComment);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", averageRating=" + averageRating +
                ", commentList=" + commentList +
                '}';
    }

}
