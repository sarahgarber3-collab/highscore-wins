package pluralsight;

import java.util.Scanner;

public class GameScoresApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter game score in example format (ex:Home:Visitor|21:9): ");
        String answer = scan.nextLine();

        //Home:Visitor|score:score
        //[0    1]     [0     1]

        //Declaring variables for parsing
        String [] splitInput = answer.split("\\|"); //this splits the full answer between | turning it into 2 parts
        String [] teams = splitInput[0].split(":"); //This splits part 1(teams) into two at the :
        String [] scores = splitInput[1].split(":"); //This splits part 2(scores) into two at the :

        String homeTeam = teams[0]; //teams are in a array and scores are in an array which is why they both use [0,1]
        String guestTeam = teams[1];
        int homeScore = Integer.parseInt(scores[0]);
        int guestScore = Integer.parseInt(scores[1]);


        if (homeScore > guestScore) {
            System.out.println("Home team wins!");
        }
        else if(guestScore > homeScore) {
            System.out.println("Guest team wins!");
        }else {
            System.out.println("Its a tie!");
        }






    }
}
