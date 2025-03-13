package org.example;

public class Main {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to a class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Gary");

//        System.out.println(friend1.numOfFriends);
//        System.out.println(friend2.numOfFriends);
//        System.out.println(friend3.numOfFriends);

//        System.out.println(Friend.numOfFriends);

        Friend.showFriends();
    }
}