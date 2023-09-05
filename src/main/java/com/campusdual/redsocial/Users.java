package com.campusdual.redsocial;

import java.util.ArrayList;
import java.util.List;

public class Users {

    //--------------------------------------------VARIABLES----------------------------------------------
    private String username;
    private List<Users> followed;
    private List<Posts> posts;

    //--------------------------------------------CONSTRUCT----------------------------------------------
    public Users (String username){
        this.username = username;
        this.followed = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    //--------------------------------------------GETTERS----------------------------------------------
    public String getUsername() {
        return username;
    }
    public List<Users> getFollowed() {
        return followed;
    }
    public List<Posts> getPosts() {
        return posts;
    }

    //--------------------------------------------METHODS----------------------------------------------

    //------Method follow-user---------
    public void followUser(Users user){
        followed.add(user);
    }

    //------Method Unfollow-user---------
    public void unfollowUser(Users user){
        followed.remove(user);
    }

    //------Method add-Post---------
    public void addPost(Posts post){
        posts.add(post);
    }

    //------Method remove-Post---------
    public void removePost(Posts post){
        posts.remove(post);
    }

    //------Method list-Post---------
    public void listPosts(){
        for (Posts p : posts) {
            System.out.println(p);
        }
    }

    //------Method list-Comments---------
    /*public void listComments(){
        for (Posts p : posts) {
            for (Comments c : p.getComments()) {
                if(c.getSenderName() == this){
                    System.out.println(c);
                }
            }
        }
    }*/

    //------Method number-Comments---------
    public void numberComments(Posts post){
        System.out.println("El post tiene " + post.getComments().size() + " comentarios.");
    }

    //------Method show-Wall---------
    public void showWall(){
        List<Posts> wall = new ArrayList<>();
        for (Users userFollow: followed) {
            wall.addAll(userFollow.getPosts());
        }
        // Ordenar los posts por fecha en orden descendente (los más recientes primero)
        wall.sort((post1, post2) -> post2.getPostDate().compareTo(post1.getPostDate()));

        //Mostrar los primeros 10 posts
        int cont = 0;
        for (Posts p : wall) {
            if (cont < 10){
                System.out.println(p);
                cont++;
            } else {
                break;
            }
        }
    }

    //------Method suggest-friends---------
    public List<Users> suggestMutualFriends(Users otherUser){
        List<Users> seggests = new ArrayList<>();

        for (Users us: followed) {
            for (Users followedAnother: us.getFollowed()) {
                if (us == followedAnother){
                    seggests.add(us);
                }
            }
        }

        seggests.remove(this);
        seggests.removeAll(followed);

        return seggests;
    }
}