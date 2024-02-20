public class CourseException extends Exception{

    public String department; 
    public int courseNum;
    public int credit;
    
    public CourseException(String D, int CN, int CR){
        department = D;
        courseNum = CN; 
        credit = CR;
    }
    
    public CourseException(){
        System.out.println("Error!");
    }   
    
}
