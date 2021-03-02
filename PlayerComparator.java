package comparator;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player p1,Player p2) {
		 
        if(p1.getSkill().compareTo(p2.getSkill())==0)
        		{
        	 return p1.getName().compareTo(p2.getName());
        		}
        else
        { 
		 return p1.getSkill().compareTo(p2.getSkill());
	 
	    }
	
}
}
