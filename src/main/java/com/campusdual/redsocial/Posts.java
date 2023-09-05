package com.campusdual.redsocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {

    private Date postDate;
    private List<Comments> comments;
    private String senderPost;

    public Posts(String senderPost){
        this.senderPost = senderPost;
        this.postDate = new Date();
        this.comments = new ArrayList<>();
    }

    public Date getPostDate(){
        return postDate;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void addComments(Comments comment){
        comments.add(comment);
    }

    @Override
    public String toString(){
        return "Post fecha = " + postDate + ", comentarios" + comments.size() + ".";
    }
}