package com.example.sendmessage.model;

import java.io.Serializable;

public class Message implements Serializable {
    private String user;
    private String message;
//si no se crea constructor por defecto java utiliza
    //constructor vacio

    //si existe un constructor con parametros tengo que implementar el vacio si o si

    public Message(String user, String message) {
        this.user = user;
        this.message = message;
    }

    public Message() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "Message{" +
                "user='" + user + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
