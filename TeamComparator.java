package comparator;

import java.util.Comparator;

public class TeamComparator implements Comparator<Team>{

	@Override
	public int compare(Team t1, Team t2) {
		// TODO Auto-generated method stub
		if(t1.getNoofmatches() == t2.getNoofmatches())
		{
			return 1;
		}
		else if(t1.getNoofmatches() > t2.getNoofmatches())
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}

	
	
	}
	


