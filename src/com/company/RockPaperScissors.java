package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static  void main(String[] args){
        System.out.println("Let's Play Rock Paper And Scissor");
        System.out.println("Enter the Input-> Rock(1) Paper(2) Scissors(3)");
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();

        Random rand = new Random();
        int computer_choice = rand.nextInt(3) + 1;
        if(computer_choice == 1){
            System.out.println("The Computer Has Selected Rock");
            if(i == 1) {
                System.out.println("TIE");
            }
            else if(i == 2){
                System.out.println("YOU WIN");
            }else if(i == 3){
                System.out.println("YOU LOSE");
            }

        }else if(computer_choice == 2){
            System.out.println("The Computer Has Selected Paper");
            if(i == 1) {
            System.out.println("YOU LOSE");
            }
            else if(i == 2){
            System.out.println("TIE");
            }else if(i == 3){
            System.out.println("YOU WIN");
            }

        }else if(computer_choice == 3){
            System.out.println("The Computer Has Selected Scissors");
            if(i == 1) {
                System.out.println("YOU WIN");
            }
            else if(i == 2){
                System.out.println("YOU LOSE");
            }else if(i == 3){
                System.out.println("TIE");
            }

        }
        System.out.println("GOODBYE");



    }
}
