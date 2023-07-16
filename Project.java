import java.util.Scanner;

class GetInformations {

  Scanner sc = new Scanner(System.in);
  // write function for getting information for registration
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

  public void information(String companyName) {
    System.out.println("Enter your Name :-");
    name = sc.nextLine();

    System.out.println("Enter your Father Name :-");
    fatherName = sc.nextLine();

    System.out.println("Enter your Phone Number :-");
    phoneNumber = sc.nextDouble();

    System.out.println("Enter your Email :-");
    email = sc.next();

    System.out.println("Enter your Permanent Address :-");
    address = sc.next();
    sc.next();

    System.out.println("Enter your Age :-");
    age = sc.nextInt();

    if (age <= 18 || age >= 25) {
      System.out.println("You are not eligible for Further process ");
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
          companyName
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
  }
}

public class Project {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    GetInformations obj1 = new GetInformations();

    System.out.println("=======================================");
    System.out.println("        PILOT REGISTRATION SYSTEM      ");
    System.out.println("=======================================");

    System.out.println("Here is some Airlines Company Names:");

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
    //this will display all company names
    for (String company : airlineCompanies) {
      System.out.println("-" + company);
    }
    System.out.println(
      "Please Select one of the following Companies which you would like to Register yourself:-"
    );
    //here user will enter one company name
    String nameOfcompany = sc.nextLine();
    //this will check if the company is in  the list or not
    for (int i = 0; i < airlineCompanies.length; i++) {
      if (airlineCompanies[i].equalsIgnoreCase(nameOfcompany)) {
        //here user need to enter information for further registration process
        System.out.println(
          "Please Provide Relevent Information for registration purpose :-"
        );
        //here i want to call function for taking input from the user
        obj1.information(nameOfcompany);
        break;
      }
    }

    sc.close();
  }
}
