
/*
Create a new Java package called Christmas. Create a new Java class called Santa. Create your main method.
Using Console IO, allow him to ask the user what they want for Christmas. Store the response in a String variable.
 Bonus: Continue to ask if the user enters an empty String
 */

import java.util.Scanner;

public class Santa {
    public static void main(String[] args) {

        System.out.println("What you guys want for Christmas :");
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        if(userInput.equals("")){
            System.out.println("Please enter your gift");
            String userInput1 = scan.nextLine();
        }

//   Test your new class in the main
//   method of the Santa class by creating instances of Santa's reindeer.

        Reindeer rein = new Reindeer("Coco");
        System.out.println("\n The name of my Reindeer is " + rein.name);
    }
}
