import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

	SkillPractice skills = new SkillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
}
void skill1() {
	// Use pop-ups for the following. DO NOT use Eclipse short cuts to help you
	
	// Ask the user how many dimes they have
	String userAns= JOptionPane.showInputDialog("How many dimes do you have?");
	// Tell them how many cents they have (hint multiply by 10)
	int userNum = Integer.parseInt(userAns);
	int userNum2= userNum * 10;
	JOptionPane.showMessageDialog(null, "$."+userNum2);
	
	// Ask the user how tall they are (inches)
//	String tallAns= JOptionPane.showInputDialog("How tall are you in inches?");
//	int tallNum = Integer.parseInt(tallAns);
//	
//	// If they are shorter than 36 inches, tell them to eat their Wheaties
//	if(tallNum<36) {
//		JOptionPane.showMessageDialog(null, "Eat your Wheaties Kid!");
//	}else {
//	JOptionPane.showMessageDialog(null, tallNum+" inches");
//	}
}

void skill2() {
	// Write a loop to print every third number between 1 and 30 to the console
//	for(int i=1; i<=30;i++) {
//		if(i%3==0) {
//		System.out.println(i);
//		}
//	}
	// Do NOT use Eclipse short-cuts to help you
	
}

void skill3() {
	// Get a random number that is less than 20 and print it to the console
//	 Random A = new Random();
//	 int i =A.nextInt(20);
//	 System.out.println(i);
//	// Get another random number that is less than 10 and print it to the console
//	Random L10= new Random();
//	int rNum = L10.nextInt(10);
//	System.out.println(rNum);
//	// Using a pop-up, tell the user the difference between the numbers
//	// Hint: use subtraction
//	JOptionPane.showMessageDialog(null, i- rNum);
	
}
void skill4() {
	// In a pop-up, ask the user for the city they live in
//	String userCity = JOptionPane.showInputDialog("What city do you live in?");
//	// If they answered "San Diego", tell them they live in Americ's Finest City
//	if(userCity.equalsIgnoreCase("San Diego")) {
//		JOptionPane.showMessageDialog(null, "You live in America's Finest City!");
//	}
//		
//	// Otherwise, tell them to move to San Diego
//	else{
//		JOptionPane.showMessageDialog(null, "You should move to San Diego");
//	} 
//	
	// Create a variable - cars - and initialize it to the number of cars your family has.
//	int cars = 4;
//	// If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
//	if(cars==0) {
//		JOptionPane.showMessageDialog(null,"I bet you use public transportation");
//	} 
//	// If there is 1 car, use a pop-up to display the make/model of the car
//	else if(cars==1) {
//	JOptionPane.showMessageDialog(null, "Honda Civic");	
//	} 
//	// If there is more than 1 car, use a pop-up to display how many wheels the
//	// cars have between them.
//	else if(cars>1) {
//	JOptionPane.showMessageDialog(null, "16 wheels");	
//	} 
	
}
void skill5() {
	// In a pop-up, ask the user for the name of their school
//	String userSchool = JOptionPane.showInputDialog("What is the name of your school?");
//	// In another pop-up, tell the user, that their school is a fantastic school. 
//	JOptionPane.showMessageDialog(null, userSchool+" is a fantastic school");
//	// You must include the name of the school in the message.
	
}

}
