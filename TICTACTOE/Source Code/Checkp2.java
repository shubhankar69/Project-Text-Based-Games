class Checkp2
{
	char arr[][]=new char[10][10];
	boolean checkplayer2(char arr[][])
	{
		if(arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O')
		{
			return true;
		}
		else if(arr[0][2]=='O' && arr[1][1]=='O' && arr[2][0]=='O')
		{
			return true;
		}
		else if(arr[0][0]=='O' && arr[0][1]=='O' && arr[0][2]=='O')
		{
			return true;
		}
		else if(arr[1][0]=='O' && arr[1][1]=='O' && arr[1][2]=='O')
		{
			return true;
		}
		else if(arr[2][0]=='O' && arr[2][1]=='O' && arr[2][2]=='O')
		{
			return true;
		}
		else if(arr[0][0]=='O' && arr[1][0]=='O' && arr[2][0]=='O')
		{
			return true;
		}
		else if(arr[0][1]=='O' && arr[1][1]=='O' && arr[2][1]=='O')
		{
			return true;
		}
		else if(arr[0][2]=='O' && arr[1][2]=='O' && arr[2][2]=='O')
		{
			return true;
		}
		else
			return false;
	}
}