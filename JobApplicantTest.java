package jobapplicant.java;

public final class JobApplicantTest {
    String name, phone;
    boolean words, graphics, database, spread;
    public JobApplicantTest(){
        getInfo(" ", " ", false, false, false, false);
    }
    JobApplicantTest(String Name, String Number, boolean words, boolean graphics, boolean databse, boolean spread){
        getInfo(Name, Number, words, graphics, databse, spread);
    }
    
    public void getInfo(String Name, String Number, boolean words, boolean graphics, boolean databse, boolean spread){
        getName(Name);
        getPhone(Number);
        getWords(words);
        getGraphics(graphics);
        getDatabase(databse);
        getSpread(spread);
    }
    
    
    public void getName(String Name){
        name = Name; 
    }
    public void getPhone(String number){
        phone = number; 
    }
    public void getWords(boolean good){
        words = good;
    }
    public void getGraphics(boolean good){
        graphics = good;
    }
    public void getDatabase(boolean good){
        database = good;
    }
    public void getSpread(boolean good){
        spread = good;
    }
    
    
    
    public String returnName(){
        return name;
    }
    public String returnPhone(){
        return phone;
    }
    public boolean returnword(){
        return words;
    }
    public boolean returngraph(){
        return graphics;
    }
    public boolean returnspread(){
        return spread;
    }
    public boolean returndata(){
        return database;
    }
    
    
    public boolean test(){
        boolean[] ray = {words, graphics, database, spread};
        int count = 0;
        for (int spot = 0; spot < 4; spot++){
            if(ray[spot]){
                count++;
            }
        }
        if(count > 2){
            return true;
        }
        
        
        return false;
    }
    public void testtoString(){
        if(test()){
            System.out.println("Give "+name+" an interview!");
        }
        else{
            System.out.println("Don't give "+name+" an interview!");
        }
    }
    
    public String JobtoString(){
        return "Name :: "+name+"\nPhone :: "+phone+"\nGood at Word? :: "+words+"\nGood at Spreadsheet? :: "+spread+"\nGood at graphics :: "+graphics+"\nGood at database? :: "+database;
    }
}
