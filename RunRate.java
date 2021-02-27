import java.io.*;  
public class RunRate {
    
  
    public static void main(String[] args) throws IOException {
        try{
            int runs,overs;
            float runRate;
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in)); 
            RunRate obj=new RunRate();
            System.out.println("Enter Runs Scored: ");
            runs = Integer.parseInt(scan.readLine());
            System.out.println("Enter the over faced: ");
            overs = Integer.parseInt(scan.readLine());
            runRate=runs/overs;
            System.out.println("current runrate  :"+runRate);
         
           overs= Integer.parseInt(scan.readLine());
        }
        catch(Exception e){
            System.out.println("Error Code: "+e);
            System.exit(0);
        }
        
      
    }
}