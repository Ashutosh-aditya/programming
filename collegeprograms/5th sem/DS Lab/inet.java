import java.net.*;
class inet
{
	public static void main(String s[]) throws Exception
	{
		InetAddress add = InetAddress.getLocalHost();
		System.out.println(add);	
	}
}