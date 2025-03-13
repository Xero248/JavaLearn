package org.example;

public class User {

    String Username;
    String email;
    int age;

    User(){
        this.Username = "Guest";
        this.email = "NOT PROVIDED";
        this.age = 0;
    }

    User(String Username){
        this.Username = Username;
        this.email = "NOT PROVIDED";
        this.age = 0;
    }

    User(String Username, String email){
        this.Username = Username;
        this.email = email;
        this.age = 0;
    }

    User(String Username, String email, int age){
        this.Username = Username;
        this.email = email;
        this.age = age;
    }

}
