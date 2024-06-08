package com.example.chat3;

public class MessageItem {
    private String senderName;
    private String message;
    private String timestamp;

    public MessageItem() {
        // Default constructor required for Firebase
    }

    public MessageItem(String senderName, String message, String timestamp) {
        this.senderName = senderName;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}