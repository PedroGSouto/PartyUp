package com.example.partyup.Chat;

public class Chat {
    public String message;
    public String messageDate;
    public String messageTime;
    public String sentBy;

    public Chat(){

    }

    public Chat(String message, String messageDate, String messageTime, String sentBy) {
        this.message = message;
        this.messageDate = messageDate;
        this.messageTime = messageTime;
        this.sentBy = sentBy;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public String getSentBy() {
        return sentBy;
    }
}
