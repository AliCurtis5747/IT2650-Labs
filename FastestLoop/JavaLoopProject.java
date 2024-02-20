import java.util.Calendar;
import java.text.DecimalFormat;
import java.util.Random;
import java.lang.Math;
import java.math.RoundingMode;

public class JavaLoopProject {

    
    public static void main(String[] args) {
        
        double whileTime, forTime, doWhileTime;
        int looper = 0;
        DecimalFormat rounder = new DecimalFormat("#.####");
        rounder.setRoundingMode(RoundingMode.CEILING);
                
        double sumTime = 0;
        Calendar timer1, timer2; 
        System.out.println("Average Time Elapsed for 10000000 loops :: ");
        System.out.println("______________________________________________________________________________");
        
        
        for(int i = 0; i < 10000000; i++){
                timer1 =  Calendar.getInstance();
                double time = timer1.getTimeInMillis();
            
                mathfunct1(mathfunct());
                    
                timer2 = Calendar.getInstance();
                double time2 = timer2.getTimeInMillis();   
              
                sumTime+=time2-time;
        }
        forTime = sumTime/1000000; 
        System.out.println("Average for loop time in seconds :: "+ rounder.format(forTime));
        sumTime = 0;  
        
        
        while(looper < 10000000){           
            timer1 =  Calendar.getInstance();
            double time = timer1.getTimeInMillis();
            
            mathfunct1(mathfunct());
            
            timer2 = Calendar.getInstance();
            double time2 = timer2.getTimeInMillis();
            
            
            sumTime+=time2-time; 
            looper++;
        }
        whileTime = sumTime/1000000; 
        
        System.out.println("Average while loop time in seconds :: "+ rounder.format(whileTime));
        looper = 0; 
        sumTime = 0; 
        
        do{
            timer1 =  Calendar.getInstance();
            double time = timer1.getTimeInMillis();
                        
            mathfunct1(mathfunct());
            
            timer2 = Calendar.getInstance();
            double time2 = timer2.getTimeInMillis();
            
            sumTime+=time2-time;
            looper++;
        }while(looper < 10000000); 
         
        doWhileTime = sumTime/1000000;
        System.out.println("Average do-while loop time in seconds :: "+ rounder.format(doWhileTime)+"\n\n");
        
        if(forTime < whileTime && forTime < doWhileTime){
            System.out.println("For Loop is the fastest with a time of "+rounder.format(forTime));
        }
        if(whileTime < forTime  && whileTime < doWhileTime){
            System.out.println("While Loop is the fastest with a time of "+rounder.format(whileTime));
        }
        if(doWhileTime < forTime  && doWhileTime < whileTime){
            System.out.println("While Loop is the fastest with a time of "+rounder.format(whileTime));
        }
        
        
        
    }
    public static double mathfunct(){
        Random Value = new Random();
        int x = Value.nextInt(11);
        int y = Value.nextInt(11);
        int z = x * y;
        return Math.sqrt((double)z);
    
    }
    public static double mathfunct1(double z){
        double square = Math.sqrt(z*5);
        double quad = Math.pow(square,4);
        
        if(mathfunct()*quad < 10){
            double question = 10*mathfunct();
            if(question > 10){
                return question; 
            }
            else{
                return quad;
            }  
        }
        return 0.0;
    
    }
    
    
}
