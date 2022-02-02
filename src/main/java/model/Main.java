package main.java.model;

import main.java.model.comments.Comment;
import main.java.model.users.User;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                1,
                "Emerson",
                "macedo",
                "emerson@gmail.com");


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime dateNow = LocalDateTime.now();
//        System.out.println(dtf.format(dateNow));


        Comment testComment = new Comment(
                "This user is a piece of s***",
                2F,
                LocalDateTime.now());

        user.setNewComment(testComment);
        System.out.println(user.toString());

        Comment testComment2 = new Comment(
                "This is the second comment",
                2F,
                LocalDateTime.now());

        user.setNewComment(testComment2);
        System.out.println(user.toString());
    }



}
