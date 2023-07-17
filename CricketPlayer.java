import java.util.Scanner;
import java.util.Random;
class Player {
  String name;
  int age;
  String role;
  int totalRuns;
  int totalInnings;

  Player(String name, int age, String role, int totalRuns, int totalInnings) {
    this.name = name;
    this.age = age;
    this.role = role;
    this.totalRuns = totalRuns;
    this.totalInnings = totalInnings;
  }

  void display() {
    System.out.println("Name of the player is " + this.name);
    System.out.println("Age of the player is " + this.age);
    System.out.println("Role of the player is " + this.role);
    System.out.println("Total Runs of the player is " + this.totalRuns);
    System.out.println("Total Innings of the player is " + this.totalInnings);
  }
}
public class CricketPlayer {

  public static void main(String args[]) {
    Player[] team = new Player[12];
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

     //taking input of 
     for (int i = 0; i < team.length; i++) {
            System.out.println("Enter details for Player " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Role: ");
            String role = scanner.nextLine();
            System.out.print("Enter total Runs: ");
            int totalRuns = scanner.nextInt();
            System.out.print("Enter total Innings: ");
            int totalInnings = scanner.nextInt();

          team[i] = new Player(name, age, role,totalRuns,totalInnings);
        }
        int captainIndex = random.nextInt(team.length);
        Player captain = team[captainIndex];

        // Print details of the selected captain
        System.out.println("\nCaptain Details:");
      captain.display();


  }
}
