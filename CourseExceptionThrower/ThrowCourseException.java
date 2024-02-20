import java.util.Scanner;

public class ThrowCourseException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Department of the class :: ");
        String className = input.nextLine();
        
        System.out.println("Please input the course number :: ");
        int classNum = input.nextInt();
        
        System.out.println("Please input the number of credits :: ");
        double credit = input.nextDouble(); 
        
        Course First = new Course(className, classNum, credit);
        System.out.println(First.toString());
        
    }
    
}
