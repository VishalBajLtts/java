package vishal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class RankingMainComparable {
	

	
	public void main(String[] args) throws IOException
	{
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Comparable1> al = new ArrayList<Comparable1>();
	int players = Integer.parseInt(reader.readLine());
	int j=0;
	for(int i=0;i<players;i++)
	{
	System.out.println("Enter Name of Player"+j);
	String name = reader.readLine();
	System.out.println("Enter age of Player"+j);
	int age = Integer.parseInt(reader.readLine());
	al.add(new Comparable1(age,name));
	j++;
	}
	Collections.sort(al);
	for(Comparable1 r:al)
	{
	System.out.println(r.getName()+ " "+r.getScore());
	}
	}
	}



