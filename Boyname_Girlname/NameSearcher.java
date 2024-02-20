import static java.lang.System.*; 
import java.util.Scanner; 
import java.util.InputMismatchException;
import java.io.*;

public class NameSearcher {


    public static void main(String[] args) throws Exception {
        File boyname = new File(".\\boynames.txt");
        BufferedReader br = new BufferedReader(new FileReader(boyname));
        File girlname = new File(".\\girlnames.txt");
        BufferedReader gr = new BufferedReader(new FileReader(girlname));
        
        String searcher = "a";
        String textLine;
        Scanner Input = new Scanner(System.in);
        int line = 0; 
        boolean nums = true;
        
        System.out.println("Please enter a name to search :: ");

        try{
            searcher = Input.nextLine();
        }
        catch(IllegalArgumentException e){
            System.out.println(e+" Please input a new name");
            searcher = Input.nextLine();
        }
        
        while ((textLine = br.readLine()) != null){
            line++;
            if(textLine.contains(searcher)){
                int spot = textLine.indexOf(" ");
                System.out.println(textLine.substring(0,spot)+" is ranked number "+line+" in popularity among boys with "+textLine.substring(spot+1)+" namings.");
                nums = false;
                break;
            }
        }
        if(nums){
                System.out.println("There are no boys named "+searcher+" in the top 1000 rankings");
            }
        nums = true;
        
        line=0;
        while ((textLine = gr.readLine()) != null){
            line++;
            if(textLine.contains(searcher)){
                int spot = textLine.indexOf(" ");
                System.out.println(textLine.substring(0,spot)+" is ranked number "+line+" in popularity among girls with "+textLine.substring(spot+1)+" namings.");
                nums = false;
                break;
            }
        }
        if(nums){
                System.out.println("There are no girls named "+searcher+" in the top 1000 rankings");
            }
        br.close();
        gr.close();
        
        
    }
    
}
