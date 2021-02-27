	package vishal;
import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the match format");
	  System.out.println("1.ODI");
	  System.out.println("2.T20");
	  System.out.println("3.Test");
	 int choice= sc.nextInt();
	 if(choice==1)
	 {
		 Scanner sc1 =new Scanner(System.in);
		 ODIMatch od= new ODIMatch();
		 System.out.println("Enter the Current score ");
		 int score= sc1.nextInt();
		 od.setCurrentscore(score);
		 System.out.println("Enter the current Over ");
		 int over=sc1.nextInt();
		 od.setCurrentover(over);
		 System.out.println("Enter the Target Score ");
		 int target=sc1.nextInt();
		 od.setTarget(target);
		 //=====================================
		 System.out.println("Requirements:");
		 System.out.println("Need "+od.display(score, target)+"runs in "+od.calculateBalls(over)+"balls");
		  System.out.println("Required Runrate: "+od.calculateRunRate(score,over));
	 }
	 
	 if(choice==2)
	 {
		 Scanner sc3=new Scanner(System.in);
		 T20Match t20=new T20Match();
		 System.out.println("Enter the Current score ");
		 int score2= sc3.nextInt();
		 t20.setCurrentscore(score2);
		 System.out.println("Enter the current Over ");
		 int over2=sc3.nextInt();
		 t20.setCurrentover(over2);
		 System.out.println("Enter the Target Score ");
		 int target2=sc3.nextInt();
		 t20.setTarget(target2);
		 //=====================================
		 System.out.println("Requirements:");
		 System.out.println("Need "+(int)t20.display(score2, target2)+" runs in "+(int)t20.calculateBalls(over2)+" balls ");
		  System.out.println("Required Runrate: "+t20.calculateRunRate(score2,over2));
	 }
	 
	 if(choice==3)
	 {
		 Scanner sc2 =new Scanner(System.in);
		 TestMatch tm=new TestMatch();
		 System.out.println("Enter the Current score ");
		 int score1= sc2.nextInt();
		 tm.setCurrentscore(score1);
		 System.out.println("Enter the current Over ");
		 int over1=sc2.nextInt();
		 tm.setCurrentover(over1);
		 System.out.println("Enter the Target Score ");
		 int target1=sc2.nextInt();
		 tm.setTarget(target1);
		 //=====================================
		 System.out.println("Requirements:");
		 System.out.println("Need "+tm.display(score1, target1)+" runs in "+tm.calculateBalls(over1)+" balls");
		  System.out.println("Required Runrate: "+tm.calculateRunRate(score1,over1));

	 }

	}

}




