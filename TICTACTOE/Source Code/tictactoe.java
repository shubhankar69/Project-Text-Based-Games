import java.util.*;
class tictactoe
{
	public static void main(String args[])
	{
		char arr[][]=new char[10][10];
		int i,j=0,k=1,r=0,c=0,m=1;
		String p1,p2;
		Scanner sc=new Scanner(System.in);
		checkp1 cp1=new checkp1();
		checkp2 cp2=new checkp2();
		System.out.print("Enter Player 1(X) name: ");
		p1=sc.nextLine();
		System.out.print("Enter Player 2(O) name: ");
		p2=sc.nextLine();
		System.out.println("column 1    2    3");
		System.out.println("row 1 | |  | |  | |");
		System.out.println("row 2 | |  | |  | |");
		System.out.println("row 3 | |  | |  | |");
		while(k==1 && m<10)
		{
			//player 1 turn
			System.out.println("------------");
			System.out.println(p1+"'s turn");
			System.out.println("------------");
			System.out.println();
			System.out.print("Row no->");
			r=sc.nextInt();
			System.out.print("Column no=>");
			c=sc.nextInt();
			System.out.println();
			while(arr[r-1][c-1]=='X' || arr[r-1][c-1]=='O')
			{
				System.out.println("Already placed,Try Again..");
				System.out.println();
				System.out.print("Row no->");
				r=sc.nextInt();
				System.out.print("Column no=>");
				c=sc.nextInt();
				System.out.println();
			}
			arr[r-1][c-1]='X';
			m++;
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
					System.out.print("  |"+arr[i][j]+"|");
				System.out.println();
			}
			System.out.println();
			if(cp1.checkplayer1(arr))
			{
				System.out.println(p1+" you won congrats...!!!");
				k++;
			}
			if(k<2 && m<10)
			{
				//player 2 turn
				System.out.println("------------");
				System.out.println(p2+"'s turn");
				System.out.println("------------");
				System.out.println();
				System.out.print("Row no->");
				r=sc.nextInt();
				System.out.print("Column no=>");
				c=sc.nextInt();
				System.out.println();
				while(arr[r-1][c-1]=='X' || arr[r-1][c-1]=='O')
				{
					System.out.println("Already placed,Try Again..");
					System.out.println();
					System.out.print("Row no->");
					r=sc.nextInt();
					System.out.print("Column no=>");
					c=sc.nextInt();
					System.out.println();
				}
				arr[r-1][c-1]='O';
				m++;
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
						System.out.print("  |"+arr[i][j]+"|");
					System.out.println();
				}
				System.out.println();
				if(cp2.checkplayer2(arr))
				{
					System.out.println(p2+" you won congrats...!!!");
					k++;
				}
			}
		}
		if(m>9 && k==1)
		{
			System.out.println("Match Drawn");
		}
	}
}