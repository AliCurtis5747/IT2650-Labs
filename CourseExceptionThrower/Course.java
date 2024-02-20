public class Course {
    
    public String department;
    public int courseNum; 
    public double credit;
    
    public Course(String D, int CN, double CR){
    try{
        department = D;   
        
        if(department.length() != 3){
            throw new CourseException(); 
        }
    } catch(CourseException ex){
       System.out.println("The department did not have enough characters");
       System.exit(0);
    }
    try{
        courseNum = CN;
        if(courseNum <= 100 || courseNum >= 499 ){
            throw new CourseException();
        }
        
    } catch(CourseException ex){
        System.out.println("The Course number is not valid");
        System.exit(0);
    }
    try{
        credit = CR; 
        if(credit > 6 || credit < 0.5){
            throw new CourseException();
        }
    } catch(CourseException ex){
        System.out.println("Your credit value is not valid"); 
        System.exit(0);
        
    }
    
    }
    
    
    public String toString(){
        return "You have created the course "+department+courseNum+" successfully! If you complete the class you will get "+credit+" credits!";
    }
    
    
}
