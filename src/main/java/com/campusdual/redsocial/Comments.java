package com.campusdual.redsocial;

import java.util.Date;

public class Comments {

    private String content;
    private Date senderDate;
    private Users senderName;

    public Comments(String content, Users senderName) {
        this.content = content;
        this.senderDate = new Date();
        this.senderName = senderName;
    }

    public String getContent() {
        return content;
    }

    public Users getSenderName() {
        return senderName;
    }

    @Override
    public String toString() {
        return "Comentario [texto=" + content + ", fecha=" + senderDate + ", propietario=" + senderName.getUsername() + "]";
    }
}