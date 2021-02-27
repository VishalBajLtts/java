import java.io.*;  
public class RunRate {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in)); 
  int runs,overs;
    float runRate;
    public void input()throws IOException{
        try{
            System.out.println("Enter Runs Scored: ");
           
            runs = Integer.parseInt(scan.readLine());
            System.out.println("Enter the over faced: ");
         
           overs= Integer.parseInt(scan.readLine());
        }
        catch(NumberFormatException e){
            System.out.println("Error Code: "+e);
            System.exit(0);
        }
    }

    public void compute(){
        runRate=runs/overs;
        System.out.println("current runrate  :"+runRate);
    }

    public static void main(String[] args) throws IOException {
        RunRate obj=new RunRate();
        obj.input();
        obj.compute();
    }
}