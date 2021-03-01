package vishal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeSet;

public class SetActivity2 {

	

	

	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	TreeSet<String> ts= new TreeSet<String>();
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);  
	Scanner sc= new Scanner(System.in);
	System.out.println("number of matches");
	int matches = sc.nextInt();
	for(int i=0;i<matches;i++)
	{
	String name=br.readLine();    
	ts.add(name);
	}

	for(Object o:ts)
	{
	System.out.println(o);
	}

	}

	}


