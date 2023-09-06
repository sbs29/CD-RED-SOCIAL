package com.campusdual.redsocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {

    private String contentPost;
    private Date postDate;
    private List<Comments> comments;
    private String senderPost;

    public Posts(String contentPost, String senderPost){
        this.contentPost = contentPost;
        this.senderPost = senderPost;
        this.postDate = new Date();
        this.comments = new ArrayList<>();
    }

    public String getContentPost() {
        return contentPost;
    }

    public void setContentPost(String contentPost) {
        this.contentPost = contentPost;
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
        return "Post: contenido = " + contentPost + " fecha = " + postDate + ", comentarios" + comments.size() + ".";
    }
}