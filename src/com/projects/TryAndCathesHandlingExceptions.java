package com.projects;

public class TryAndCathesHandlingExceptions {
    public static void main(String[] args) {
        // a try statement must always have a catch, a finally or both

        //1st example
        try {

        } catch (Exception e) { //no finally

        }

        //2nd example
        try {

        } finally { //no catch

        }

        //3rd example
        try {

        } catch (Exception e) { // both catch and finally are present

        } finally {

        }
    }
}
