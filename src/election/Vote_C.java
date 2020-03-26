package election;

import java.util.*;

public class Vote_C
{
	Scanner scan = new Scanner(System.in);
	boolean nominee_given = false;
	boolean[] voted = new boolean[69];
	int nominee1,nominee2;
	int votes1 = 0;
	int votes2 = 0;
	
	public void vote(int index)
	{
		if(index==0 && !voted[0])
		{
			voted[0] = true;
			System.out.println("Enter the 2 nominees(Roll no) : ");
			System.out.println("Enter nominees1 : ");
			String n = scan.next();
			String c = ""+n.charAt(13);
			n = n.substring(14);
			int cls = Integer.parseInt(c); 
			int r = Integer.parseInt(n);
			while(cls!=2 || (r<1 || r>68))
			{
				System.out.println("Nominee1 credential Invalid!!");
				System.out.println("Enter nominees1 : ");
				n = scan.next();
				c = ""+n.charAt(13);
				n = n.substring(14);
				cls = Integer.parseInt(c); 
				r = Integer.parseInt(n);
			}
			nominee1 = r;
			System.out.println("Enter nominees2 : ");
			n = scan.next();
			c = ""+n.charAt(13);
			n = n.substring(14);
			cls = Integer.parseInt(c); 
			r = Integer.parseInt(n);
			while(cls!=2 || (r<1 || r>68) || r==nominee1)
			{
				if(r==nominee1)
				{
					System.out.println("Nominee already selected");
				}
				else
					System.out.println("Nominee2 credential Invalid!!");
				System.out.println("Enter nominees2 : ");
				n = scan.next();
				c = ""+n.charAt(13);
				n = n.substring(14);
				cls = Integer.parseInt(c); 
				r = Integer.parseInt(n);
			}
			nominee2 = r;
			nominee_given = true;
			System.out.println("Nominees added successfully!!");
		}
		else if(voted[0])
		{
			if(!voted[index])
			{
				voted[index] = true;
				System.out.println("Nominees are : ");
				if(nominee1<10)
					System.out.println("1.CB.EN.U4CSE1720"+nominee1);
				else
					System.out.println("1.CB.EN.U4CSE172"+nominee1);
				if(nominee2<10)
					System.out.println("2.CB.EN.U4CSE1720"+nominee2);
				else
					System.out.println("2.CB.EN.U4CSE172"+nominee2);
				System.out.println("Vote Nominee : ");
				int v = scan.nextInt();
				while(v!=1 && v!=2)
				{
					System.out.println("Invalid selection!!");
					System.out.println("Vote Nominee again : ");
					v = scan.nextInt();
				}
				if(v==1)
					++votes1;
				else if(v==2)
					++votes2;
				System.out.println("Voting done successfully!!");
			}
			else
				System.out.println("Already Voted");
		}
		else
		{
			System.out.println("The Nominees are not added yet");
		}
	}
	
	public String Winner()
	{
		if(votes1>votes2)
		{
			if(nominee1<10)
				return "CB.EN.U4CSE1720"+nominee1;
			else
				return "CB.EN.U4CSE172"+nominee1;
			
		}
		else if(votes2>votes1)
		{
			if(nominee2<10)
				return "CB.EN.U4CSE1720"+nominee2;
			else
				return "CB.EN.U4CSE172"+nominee2;
		}
		else
			return "VOTES DRAWED";
	}

}
