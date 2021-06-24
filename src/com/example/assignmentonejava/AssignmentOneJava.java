package com.example.assignmentonejava;

public class AssignmentOneJava {
    public static void main(String[] args) { //begin the main method
        // part 1
        int array[]={0,0,0,0,0,0,0,0,0,0}; // declaring and setting 10 elements in the
        // array with zero

        //part 2
        int bonus[];
        bonus=new int[15]; //declaring array with 15 elements
            for(int i=0;i<15;i++) { //adding 1 to each element
                bonus[i] += 1;
            }
                //part 3
                int bestScores[]={10,20,30,40,50}; //declaring the array bestScores 5 elements

                for (int j=0;j<5;j++){
                    System.out.printf("%d\t", bestScores[j]);
                }
        }
    }
