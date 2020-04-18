package com.lesson5;
/*
Problem 3
        You have been asked to develop a java application
        to allow to enter the number of Students can hit in the group. The application
        should then calculate and display how many Students can be filled  in the Team and how
        many Students have left over.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        TeamsApp.java
        -- takes input from the user
        -- uses the Teams -- the instantiable class to perform the actual computations
*/

import java.util.Scanner;

public class TeamsApp {

	public static void main(String[] args) {
		// declare local variables
		
		int numOfStudents, sizeOfTeam, numTeams, remain;
        //declare a variable called input and create an object of type Scanner
		
		Scanner input = new Scanner(System.in);
		Teams myTeams = new Teams();
        //input "Please enter the number of students: "
        //input "Please enter the size of the groups: "
		System.out.println("Please enter the number of students: ");
		numOfStudents = input.nextInt();
		System.out.println("Please enter the size of the groups: ");
		sizeOfTeam = input.nextInt();
        // declare a variable called myTeams to be able to work with an object of type Teams and create an object of type Teams
	
		 // call/invoke the setter method to assign the value provided by the user
        // set/update the value of the object's instance variable called numberOfStudents with the value provided from the keyboard
		myTeams.setNumberStudents(numOfStudents);
		myTeams.setTeamSize(sizeOfTeam);
		  //process
        //output of getNumOfTeams, getRemmainigs
		
		myTeams.CalculateMetrics();
		
		numTeams = myTeams.getNumOfTeams();
		remain = myTeams.getRemainings();
		
		
        System.out.println("The number of teams of "+sizeOfTeam+" from a group of "
              + numOfStudents+" will be "+numTeams+" teams with "+remain+" left over");
		
	}

}
