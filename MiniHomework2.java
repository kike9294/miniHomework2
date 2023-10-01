/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minihomework2;

import ioutils.IOUtils;

/**
 *
 * @author enriq
 */
public class MiniHomework2 {

    public static void main(String[] args) {
        IOUtils userInput = new IOUtils();
        
        System.out.println("Welcome to GitHub!");
        
        String name = userInput.getUserText("What is your name?");
        int age = userInput.getUserInt("How old are you?", 0);
        
        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old.");
    }
}
