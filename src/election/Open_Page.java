package election;

import java.util.*;

public class Open_Page {

	public static void main(String[] args) {

		CSE_A a = new CSE_A();
		CSE_B b = new CSE_B();
		CSE_C c = new CSE_C();
		CSE_D d = new CSE_D();
		CSE_E e = new CSE_E();
		CSE_F f = new CSE_F();
		
		CSE_F_Credential fCredential = new CSE_F_Credential();
		CSE_E_Credential eCredential = new CSE_E_Credential();
		CSE_D_Credential dCredential = new CSE_D_Credential();
		CSE_C_Credential cCredential = new CSE_C_Credential();
		CSE_B_Credential bCredential = new CSE_B_Credential();
		CSE_A_Credential aCredential = new CSE_A_Credential();
		
		Vote_A va = new Vote_A();
		Vote_B vb = new Vote_B();
		Vote_C vc = new Vote_C();
		Vote_D vd = new Vote_D();
		Vote_E ve = new Vote_E();
		Vote_F vf = new Vote_F();
		
		Display_Credentials disp = new Display_Credentials();
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Register");
			System.out.println("2.Vote");
			System.out.println("Enter choice : ");
			int choice = s.nextInt();
			if(choice==1)
			{
				System.out.println("Choose\n 1.Class Advisor 2.Student");
				int category = s.nextInt();
				
				System.out.println("Enter Name : ");
				String name = s.next();
				name = name.toUpperCase();
				
				System.out.println("Enter Roll no : ");
				String roll = s.next();
				roll = roll.toUpperCase();
				int section = 0;
				if(category==1)
				{
					section = -1;
					boolean v=false;
					while(!(section>0 && section<7) && !v)
					{
						System.out.println("Enter Section : ");
						System.out.println(" 1.A 2.B 3.C 4.D 5.E 6.F");
						section = s.nextInt();
						switch(section)
						{
						case 1:
							v=a.valid_Advisor(roll, name);
							if(v)
							{
								if(!a.getRegister(0))
								{
									a.setRegister(0);
									System.out.println("Enter Password : ");
									String password = s.next();
									v=true;
									aCredential.setPassword(password, 0);
									System.out.println("Registration Successful!!");
									disp.display_credentials(name, roll, password);
								}
								else
								{
									System.out.println("Already Registered");
								}
							}
							break;
						case 2:
							v=b.valid_Advisor(roll, name);
							if(v)
							{
								if(!b.getRegister(0))
								{
									b.setRegister(0);
									System.out.println("Enter Password : ");
									String password = s.next();
									v=true;
									bCredential.setPassword(password, 0);
									System.out.println("Registration Successful!!");
									disp.display_credentials(name, roll, password);
								}
								else
								{
									System.out.println("Already Registered");
								}
							}
							break;
						case 3:
							v=c.valid_Advisor(roll, name);
							if(v)
							{
								if(!c.getRegister(0))
								{
									c.setRegister(0);
									System.out.println("Enter Password : ");
									String password = s.next();
									v=true;
									cCredential.setPassword(password, 0);
									System.out.println("Registration Successful!!");
									disp.display_credentials(name, roll, password);
								}
								else
								{
									System.out.println("Already Registered");
								}
							}
							break;
						case 4:
							v=d.valid_Advisor(roll, name);
							if(v)
							{
								if(!d.getRegister(0))
								{
									d.setRegister(0);
									System.out.println("Enter Password : ");
									String password = s.next();
									v=true;
									dCredential.setPassword(password, 0);
									System.out.println("Registration Successful!!");
									disp.display_credentials(name, roll, password);
								}
								else
								{
									System.out.println("Already Registered");
								}
							}
							break;
							
						case 5:
							v=e.valid_Advisor(roll, name);
							if(v)
							{
								if(!e.getRegister(0))
								{
									e.setRegister(0);
									System.out.println("Enter Password : ");
									String password = s.next();
									v=true;
									eCredential.setPassword(password, 0);
									System.out.println("Registration Successful!!");
									disp.display_credentials(name, roll, password);
								}
								else
								{
									System.out.println("Already Registered");
								}
							}
							break;
						case 6:
							v=f.valid_Advisor(roll, name);
							if(v)
							{
								if(!f.getRegister(0))
								{
									f.setRegister(0);
									System.out.println("Enter Password : ");
									String password = s.next();
									v=true;
									fCredential.setPassword(password, 0);
									System.out.println("Registration Successful!!");
									disp.display_credentials(name, roll, password);
								}
								else
								{
									System.out.println("Already Registered");
								}
							}
							break;
						default:
							System.out.println("InValid Section");
							
						}
						
					}
					
				}
				if(category==2)
				{
					section = Integer.parseInt(""+roll.charAt(13));
					
				}
				String ex_roll = roll;
				
				if(section==6 && category==2)
				{
					if(f.valid(roll, name))
					{
						if(!f.already_registered(roll))
						{
							roll = roll.substring(14);
							int r = Integer.parseInt(roll);
							f.setRegister(r);
							System.out.println("Enter Password : ");
							String password = s.next();
							fCredential.setPassword(password, r);
							System.out.println("Registration Successful!!");
							disp.display_credentials(name, ex_roll, password);
						}
						else
						{
							System.out.println("Already Registered");
						}
					}
					else
					{
						System.out.println("Invalid Credentials");
					}
				}
				if(section==4 && category==2)
				{
					if(e.valid(roll, name))
					{
						if(!e.already_registered(roll))
						{
							roll = roll.substring(14);
							int r = Integer.parseInt(roll);
							e.setRegister(r);
							System.out.println("Enter Password : ");
							String password = s.next();
							eCredential.setPassword(password, r);
							System.out.println("Registration Successful!!");
							disp.display_credentials(name, ex_roll, password);
						}
						else
						{
							System.out.println("Already Registered");
						}
					}
					else
					{
						System.out.println("Invalid Credentials");
					}
				}
				if(section==3 && category==2)
				{
					if(d.valid(roll, name))
					{
						if(!d.already_registered(roll))
						{
							roll = roll.substring(14);
							int r = Integer.parseInt(roll);
							d.setRegister(r);
							System.out.println("Enter Password : ");
							String password = s.next();
							dCredential.setPassword(password, r);
							System.out.println("Registration Successful!!");
							disp.display_credentials(name, ex_roll, password);
						}
						else
						{
							System.out.println("Already Registered");
						}
					}
					else
					{
						System.out.println("Invalid Credentials");
					}
				}
				if(section==2 && category==2)
				{
					if(c.valid(roll, name))
					{
						if(!c.already_registered(roll))
						{
							roll = roll.substring(14);
							int r = Integer.parseInt(roll);
							c.setRegister(r);
							System.out.println("Enter Password : ");
							String password = s.next();
							cCredential.setPassword(password, r);
							System.out.println("Registration Successful!!");
							disp.display_credentials(name, ex_roll, password);
						}
						else
						{
							System.out.println("Already Registered");
						}
					}
					else
					{
						System.out.println("Invalid Credentials");
					}
				}
				if(section==1 && category==2)
				{
					if(b.valid(roll, name))
					{
						if(!b.already_registered(roll))
						{
							roll = roll.substring(14);
							int r = Integer.parseInt(roll);
							b.setRegister(r);
							System.out.println("Enter Password : ");
							String password = s.next();
							bCredential.setPassword(password, r);
							System.out.println("Registration Successful!!");
							disp.display_credentials(name, ex_roll, password);
						}
						else
						{
							System.out.println("Already Registered");
						}
					}
					else
					{
						System.out.println("Invalid Credentials");
					}
				}
				if(section==0 && category==2)
				{
					if(a.valid(roll, name))
					{
						if(!a.already_registered(roll))
						{
							roll = roll.substring(14);
							int r = Integer.parseInt(roll);
							a.setRegister(r);
							System.out.println("Enter Password : ");
							String password = s.next();
							aCredential.setPassword(password, r);
							System.out.println("Registration Successful!!");
							disp.display_credentials(name, ex_roll, password);
						}
						else
						{
							System.out.println("Already Registered");
						}
					}
					else
					{
						System.out.println("Invalid Credentials");
					}
				}
			}
			if(choice==2)
			{
				System.out.println("Choose\n 1.Class Advisor 2.Student");
				int category = s.nextInt();

				System.out.println("Enter Username : ");
				String username = s.next();
				System.out.println("Enter Password : ");
				String password = s.next();
				
				if(category==1)
				{
					if(f.checkAdvisor(username) && fCredential.validate_password(password , 0))
					{
						vf.vote(0);
					}
					else if(e.checkAdvisor(username) && eCredential.validate_password(password , 0))
					{
						ve.vote(0);
					}
					else if(d.checkAdvisor(username) && dCredential.validate_password(password , 0))
					{
						vd.vote(0);
					}
					else if(c.checkAdvisor(username) && cCredential.validate_password(password , 0))
					{
						vc.vote(0);
					}
					else if(b.checkAdvisor(username) && bCredential.validate_password(password , 0))
					{
						vb.vote(0);
					}
					else if(a.checkAdvisor(username) && aCredential.validate_password(password , 0))
					{
						va.vote(0);
					}
					else
					{
						System.out.println("Invalid Credentials");
					}
				}
				else if(category==2)
				{
					String sec = ""+username.charAt(13);
					int section  = Integer.parseInt(sec);
					username = username.substring(14);
					int r = Integer.parseInt(username);
					
					if(section==6)
					{
						if(f.getRegister(r))
						{
							if(fCredential.validate_password(password , r))
							{
								vf.vote(r);
							}
							else
							{
								System.out.println("Invalid Credentials");
							}
						}
						else
						{
							System.out.println("Registration not done");
						}
					}
					else if(section==4)
					{
						if(e.getRegister(r))
						{
							if(eCredential.validate_password(password , r))
							{
								ve.vote(r);
							}
							else
							{
								System.out.println("Invalid Credentials");
							}
						}
						else
						{
							System.out.println("Registration not done");
						}
					}
					else if(section==3)
					{
						if(d.getRegister(r))
						{
							if(dCredential.validate_password(password , r))
							{
								vd.vote(r);
							}
							else
							{
								System.out.println("Invalid Credentials");
							}
						}
						else
						{
							System.out.println("Registration not done");
						}
					}
					else if(section==2)
					{
						if(c.getRegister(r))
						{
							if(cCredential.validate_password(password , r))
							{
								vc.vote(r);
							}
							else
							{
								System.out.println("Invalid Credentials");
							}
						}
						else
						{
							System.out.println("Registration not done");
						}
					}
					else if(section==1)
					{
						if(e.getRegister(r))
						{
							if(bCredential.validate_password(password , r))
							{
								vb.vote(r);
							}
							else
							{
								System.out.println("Invalid Credentials");
							}
						}
						else
						{
							System.out.println("Registration not done");
						}
					}
					else if(section==0)
					{
						if(a.getRegister(r))
						{
							if(aCredential.validate_password(password , r))
							{
								va.vote(r);
							}
							else
							{
								System.out.println("Invalid Credentials");
							}
						}
						else
						{
							System.out.println("Registration not done");
						}
					}
					
				}
				else
				{
					System.out.println("Invalid!!");
				}
				
			}
			System.out.println("Want to continue :(y/n)");
			String cont = s.next();
			if(!cont.equalsIgnoreCase("y"))
				break;
		}
		
		System.out.println("Results : ");
		if(va.nominee_given)
		{
			System.out.println("Section A : ");
			System.out.println(va.Winner());
		}
		else if(vb.nominee_given)
		{
			System.out.println("Section B : ");
			System.out.println(vb.Winner());
		}
		else if(vc.nominee_given)
		{
			System.out.println("Section C : ");
			System.out.println(vc.Winner());
		}
		else if(vd.nominee_given)
		{
			System.out.println("Section D : ");
			System.out.println(vd.Winner());
		}
		else if(ve.nominee_given)
		{
			System.out.println("Section E : ");
			System.out.println(ve.Winner());
		}
		else if(vf.nominee_given)
		{
			System.out.println("Section F : ");
			System.out.println(vf.Winner());
		}
	}

}
