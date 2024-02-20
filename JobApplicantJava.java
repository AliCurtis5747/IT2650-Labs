package jobapplicant.java;
import java.util.Scanner; 


public class JobApplicantJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String phone, name;
       boolean word, spread, data, graphic;
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("How many candidates are there?    ");
       int spot = Integer.parseInt(input.nextLine());
       
       JobApplicantTest[] ApplicantRay = new JobApplicantTest[spot];
       
       
       for(int x = 0; x < spot;x++){
       System.out.println("\n\n\nPlease input name :: ");
       name = input.nextLine();
       System.out.println("Please input phone number :: ");
       phone = input.nextLine();
       System.out.println("Please input if they're good with word (True/False):: ");
       word = Boolean.parseBoolean(input.nextLine());
       System.out.println("Please input if they're good with spreadsheet (True/False):: ");
       spread = Boolean.parseBoolean(input.nextLine());
       System.out.println("Please input if they're good with databses (True/False):: ");
       data = Boolean.parseBoolean(input.nextLine());
       System.out.println("Please input if they're good with graphics (True/False):: ");
       graphic = Boolean.parseBoolean(input.nextLine());
       
       ApplicantRay[x] = new JobApplicantTest(name, phone, word, graphic, data, spread);
       }
       for(int x = 0; x < spot;x++){
           ApplicantRay[x].testtoString();
       }

    }
    
}
