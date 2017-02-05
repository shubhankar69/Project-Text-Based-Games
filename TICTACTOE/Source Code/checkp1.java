class checkp1
{
	char arr[][]=new char[10][10];
	boolean checkplayer1(char arr[][])
	{
		if(arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X')
		{
			return true;
		}
		else if(arr[0][2]=='X' && arr[1][1]=='X' && arr[2][0]=='X')
		{
			return true;
		}
		else if(arr[0][0]=='X' && arr[0][1]=='X' && arr[0][2]=='X')
		{
			return true;
		}
		else if(arr[1][0]=='X' && arr[1][1]=='X' && arr[1][2]=='X')
		{
			return true;
		}
		else if(arr[2][0]=='X' && arr[2][1]=='X' && arr[2][2]=='X')
		{
			return true;
		}
		else if(arr[0][0]=='X' && arr[1][0]=='X' && arr[2][0]=='X')
		{
			return true;
		}
		else if(arr[0][1]=='X' && arr[1][1]=='X' && arr[2][1]=='X')
		{
			return true;
		}
		else if(arr[0][2]=='X' && arr[1][2]=='X' && arr[2][2]=='X')
		{
			return true;
		}
		else
			return false;
	}
}