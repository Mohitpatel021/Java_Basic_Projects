import java.util.Scanner;

class GetInformations {

  Scanner sc = new Scanner(System.in);
  // Class variables
  String name;
  String fatherName;
  int age;
  double phoneNumber;
  String email;
  String graduation;
  String address;
  double tenthPercentage;
  double twelthPercentage;
  double graduationPercentage;

  // Constructor to initialize class variables
   GetInformations(
    String name,
    String fatherName,
    int age,
    double phoneNumber,
    String email,
    String graduation,
    String address,
    double tenthPercentage,
    double twelthPercentage,
    double graduationPercentage
  ) {
    this.name = name;
    this.fatherName = fatherName;
    this.age = age;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.graduation = graduation;
    this.address = address;
    this.tenthPercentage = tenthPercentage;
    this.twelthPercentage = twelthPercentage;
    this.graduationPercentage = graduationPercentage;
  }
}

public class PilotRegistration{

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=======================================");
    System.out.println("        PILOT REGISTRATION SYSTEM      ");
    System.out.println("=======================================");

    System.out.println("Here are some Airlines Company Names:");

    String[] airlineCompanies = {
      "IndiGo Airlines",
      "Air India",
      "SpiceJet",
      "Vistara",
      "GoAir",
      "AirAsia India",
      "Air India Express",
      "Alliance Air",
      "TruJet",
      "Star Air",
      "Air Odisha",
      "Air Deccan",
      "Zoom Air",
      "Air Pegasus",
      "Air Costa",
    };

    // Display all company names
    for (String company : airlineCompanies) {
      System.out.println("-" + company);
    }
    //prints company names
    System.out.println(
      "Please select one of the following Companies which you would like to register yourself:"
    );
    //choose company name
    String nameOfcompany = sc.nextLine();
    //checkk wheather company name present in the array or not
    for (int i = 0; i < airlineCompanies.length; i++) {
      if (airlineCompanies[i].equalsIgnoreCase(nameOfcompany)) {
        System.out.println(
          "Please provide relevant information for registration purpose:"
        );
        double tenthPercentage;
        double twelthPercentage;
        double graduationPercentage;
        // Get input from the user for information
        System.out.println("Enter your Name:");
        String name = sc.nextLine();

        System.out.println("Enter your Father Name :-");
        String fatherName = sc.nextLine();

        System.out.println("Enter your Phone Number :-");
        double phoneNumber = sc.nextDouble();

        System.out.println("Enter your Email :-");
        String email = sc.next();

        System.out.println("Enter your Permanent Address :-");
        String address = sc.next();
        sc.next();
        System.out.println("enter your graduation :-");
        String graduation = sc.next();

        System.out.println("Enter your Age :-");
        int age = sc.nextInt();

        if (age <= 18 || age >= 25) {
          System.out.println("You are not eligible for Further process ");
          break;
        } else {
          System.out.println("Enter your  tenthPercentage :-");
          tenthPercentage = sc.nextDouble();

          System.out.println("Enter your  twelthPercentage :-");
          twelthPercentage = sc.nextDouble();

          System.out.println("Enter your  graduationPercentage :-");
          graduationPercentage = sc.nextDouble();

          if (
            (tenthPercentage > 75) &&
            (twelthPercentage > 75) &&
            (graduationPercentage > 75)
          ) {
            System.out.println(
              "Thankyou We've Received your Application for pilot registration for the company " +
              nameOfcompany
            );
            System.out.println(
              "If you will met our eligibility criteria, YOu will get an email notification for further instructions"
            );
          } else {
            System.out.println(
              "Your Qualification doesn't match our requirements "
            );
          }
        }

        //Calling constructor for memory allocation
        GetInformations obj1 = new GetInformations(
          name,
          fatherName,
          age,
          phoneNumber,
          email,
          graduation,
          address,
          tenthPercentage,
          twelthPercentage,
          graduationPercentage
        );
        break;
      }
    }

    sc.close();
  }
}
