import java.util.*;
class Battleg
{
	public static void main(String args[])
	{
		int i,j,r=1,k,h=1,sl=4,d;
		int u_health=1000,u_attack,u_defense=200;
		int e_health=2000,e_attack=70,e_defense=50;
		String s,t,v;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Hero's name:");
		s=sc.nextLine();
		System.out.println("WELCOME TO BATTLEGROUND HERO "+s+"");
		System.out.println("Your Health "+u_health+", Shield defense "+u_defense);
		System.out.println("Our Champion Rakhsas's Health "+e_health+", Attack level "+e_attack+", Shield Defense "+e_defense);
		System.out.print("Do you want to Battle? Press 'Y' to yes and 'N' for no->");
		t=sc.next();
		if(t.equals("Y") || t.equals("y"))
		{
			System.out.println("Press 'S' for Sword Attack(100 points)"); 
			System.out.println("'M' for Melee Attack(40 points)");
			System.out.println("Press 'H' for Heal");
			System.out.println("Sword has 2 turns and Melee has 3 turns per Attack");
			System.out.println("Note That You Can Use Sword For 4 Times Only");
			System.out.println("Note That You Can Use Heal only Once And You Will Miss Your Attack,So Choose Wisely");
			while(u_health>0 && e_health>0)
			{
				System.out.print("Attack Type Sword or Melee?(S/M) or Want to Heal?(H)->");
				v=sc.next();
				//sword attack
				if(v.equals("S") || v.equals("s"))
				{
					if(sl>=1)
					{
						System.out.println("=======");
						System.out.println("ROUND "+r);
						System.out.println("=======");
						System.out.println();
						u_attack=100;
						k=2;
						//Enemy Health
						System.out.println("Enemy Stat");
						System.out.println("----------");
						for(i=1;i<=k;i++)
						{
							d=(int)(Math.random() * 3) + 1;
							if(d==1)
								System.out.println("Rakshas Dodged Hero "+s+"'s "+i+"th attack");
							else
							{
								e_defense=e_defense-(u_attack/2);
								if(e_defense<=0)
								{
									e_defense=0;
									e_health=e_health-u_attack;
								}
								else
									e_health=e_health-(u_attack/5);
								if(e_health<=0)
									e_health=0;
							}							
						}
						System.out.println("Rakshas's health "+e_health);
						System.out.println("Rakshas's defense "+e_defense);
						System.out.println();
						//User health
						System.out.println("Hero "+s+"'s Stat");
						System.out.println("----------------");
						for(j=1;j<=2;j++)
						{
							d=(int)(Math.random() * 3) + 1;
							if(d==1)
								System.out.println("Hero "+s+" dodged Rakshas's "+j+"th attack");
							else
							{
								u_defense=u_defense-(e_attack/2);
								if(u_defense<=0)
								{
									u_defense=0;
									u_health=u_health-e_attack;
								}
								else
									u_health=u_health-(e_attack/5);
								if(u_health<=0)
									u_health=0;
							}
						}
						System.out.println("Hero "+s+"'s health "+u_health);
						System.out.println("Hero "+s+"'s defense "+u_defense);
						System.out.println();
						r++;
						sl--;
						System.out.println("You Can use SWORD for "+sl+" times");
					}
					else
						System.out.println("Sword Has Broken");
				}
				//Melee attack
				else if(v.equals("M") || v.equals("m"))
				{
					System.out.println("=======");
					System.out.println("ROUND "+r);
					System.out.println("=======");
					System.out.println();
					u_attack=40;
					k=3;
					//Enemy Health
					System.out.println("Enemy Stat");
					System.out.println("----------");
					for(i=1;i<=k;i++)
					{
						d=(int)(Math.random() * 5) + 1;
						if(d==1)
							System.out.println("Rakshas Dodged Hero "+s+"'s "+i+"th attack");
						else
						{
							e_defense=e_defense-(u_attack/2);
							if(e_defense<=0)
							{
								e_defense=0;
								e_health=e_health-u_attack;
							}
							else
								e_health=e_health-(u_attack/5);
							if(e_health<=0)
								e_health=0;
						}
					}
					System.out.println("Rakshas's health "+e_health);
					System.out.println("Rakshas's defense "+e_defense);
					System.out.println();
					//User health
					System.out.println("Hero "+s+" 's Stat");
					System.out.println("----------------");
					for(j=1;j<=2;j++)
					{
						d=(int)(Math.random() * 3) + 1;
						if(d==1)
							System.out.println("Hero "+s+" dodged Rakshas's "+j+"th attack");
						else
						{
							u_defense=u_defense-(e_attack/2);
							if(u_defense<=0)
							{
								u_defense=0;
								u_health=u_health-e_attack;
							}
							else
								u_health=u_health-(e_attack/5);
							if(u_health<=0)
								u_health=0;
						}
					}
					System.out.println("Hero "+s+"'s health "+u_health);
					System.out.println("Hero "+s+"'s defense "+u_defense);
					r++;
				}
				//Healing
				else if(v.equals("H") || v.equals("h"))
				{
					if(h==1)
					{
						System.out.println("=======");
						System.out.println("ROUND "+r);
						System.out.println("=======");
						System.out.println();
						u_health=u_health+700;
						if(u_health>=1000)
							u_health=1000;
						System.out.println("After Healing Hero "+s+"'s health "+u_health);
						//User health
						System.out.println();
						System.out.println("Rakhsas Attacked..!!!");
						System.out.println("Hero "+s+" 's Stat");
						System.out.println("----------------");
						for(j=1;j<=2;j++)
						{
							d=(int)(Math.random() * 3) + 1;
							if(d==1)
								System.out.println("Hero "+s+" dodged Rakshas's "+j+"th attack");
							else
							{
								u_defense=u_defense-(e_attack/2);
								if(u_defense<=0)
								{
									u_defense=0;
									u_health=u_health-e_attack;
								}
								else
									u_health=u_health-(e_attack/5);
								if(u_health<=0)
									u_health=0;
							}
						}
						System.out.println("Hero "+s+"'s health "+u_health);
						System.out.println("Hero "+s+"'s defense "+u_defense);
						h++;
						r++;
					}
					else
						System.out.println("Heal potion used");
				}
				else
					System.out.println("Invalid Input");
			}
			System.out.print("Battle between Rakshas vs Hero "+s+" and the Result is -> ");
			if(u_health==0 && e_health>0)
				System.out.println("You've been Defeated,Rakshas WIN");
			else if(u_health==e_health)
				System.out.println("Battle Tied");
			else
				System.out.println("You've slained Rakshas,Hero "+s+" WIN");
		}
		else
			System.out.println("Invalid Input");
	}
}