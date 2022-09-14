package com.christopherneedham.week2;

public class ConditionsAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a variable called speedLimit and another called mySpeed
		int speedLimit = 65;
		int mySpeed = 60; //cause Kaitlyn is waiting for me!! <3
		
		// set their values to numbers between 1 and 100


		// using a conditional, determine if mySpeed is greater than the speedLimit
		System.out.println(mySpeed > speedLimit);
		// if true, print "Slow Down! Mom is mad!" to the console
		if(mySpeed > speedLimit){
			System.out.println("Slow down! Mom is mad!");
		}else if(mySpeed == speedLimit) {
			System.out.println("Everyone is happy!");
		}else {
			System.out.println("Speed up! Dad is mad!");
		}
		// if mySpeed is equal to the speedLimit, print "Everyone is happy!" to the console
		// if mySpeed is less than the speedLimit, print "Speed up! Dad is mad!"


		// create two variables, one named alarmSet, the other openDoor
		// set them to a boolean value
		boolean alarmSet = true;
		boolean openDoor = false;
		
		

		// using a conditional, determine if alarm is set. 
		// if alarm is set and door is set to open, print "Sound Alarm!" to the console
		// otherwise, print "Everything is fine." to the console.
		if (alarmSet == true && openDoor == true){
			System.out.println("Sound Alarm!");
		} else {
			System.out.println("Everything is fine.");	
		}
			 
				
			



		// create two variables, username and password
		String username = "Tommy123";
		String password = "password";
		
		if (username == "Tommy123" && password == "12345" || username == "Timmy456" && password == "6789"){
			System.out.println("Admin Login Successful");
		} else {
			System.out.println("Admin Access Denied");
		}
		// create a conditional, if the username is "Tommy123" and the password is "12345"
		// or the username is "Timmy456" and the password is "6789", print "Admin Login Successful" to the console
		// otherwise, print "Admin Access Denied"




		// write code that will set the value of studentClass based on studentGrade
		// studentGrade will be K-12
		// K-6 will be Elementary
		// 7-8 will be Middle
		// 9 will be Freshman, 10 Sophomore, 11 Junior, 12 Senior
		// Anything other than these values will return "Error" to the console
		String studentGrade = "K";
		String studentClass = "";
		
		
		if (studentGrade == "K") {
			studentGrade = "0";
		} else {
			
		}
		
		int grade = Integer.valueOf(studentGrade);
		
		
		switch (grade) {
		case 0: 
			studentClass = "Elementary";
			break;
		case 1: 
			studentClass = "Elementary";
			break;
		case 2: 
			studentClass = "Elementary";
			break;
		case 3: 
			studentClass = "Elementary";
			break;
		case 4: 
			studentClass = "Elementary";
			break;
		case 5: 	
			studentClass = "Elementary";
			break;
		case 6: 
			studentClass = "Elementary";
			break;
		case 7: 
			studentClass = "Middle";
			break;
		case 8: 
			studentClass = "Middle";
			break;
		case 9: 
			studentClass = "Freshman";
			break;
		case 10: 
			studentClass = "Sophmore";
			break;
		case 11:
			studentClass = "Junior";
			break;
		case 12: 
			studentClass = "Senior";
			break;
		default:
			studentClass = "Invalid Selection";
		}
		System.out.println(studentClass);
		
		
		




		// write a for loop that will iterate backwards from 10 to -10



		// write a do/while loop that prints 1 through 50


		// edit the previous do/while loop so that it prints the remainder when the loop number is divided by 4


		// Someone messed up the following for loop
		// fix the following infinite loop, uncomment to test
		/* 
		    for(let i = 11; i > 10; i++){
		        console.log(i);
		    } 
		*/
	}

}
