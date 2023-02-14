import java.util.*;
import java.net.*;
public class udpc {
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        DatagramSocket skt = new DatagramSocket();
        InetAddress host = InetAddress.getByName("127.0.0.1");
        int port=3780;
        while(true)
        {
            System.out.print("Client : ");
            String msg=in.nextLine();
            byte b[]=msg.getBytes();
            DatagramPacket req = new DatagramPacket(b, b.length,host,port);
            skt.send(req);
            byte buffer[] = new byte[1024];
            DatagramPacket rep = new DatagramPacket(buffer,buffer.length);
            skt.receive(rep);
            System.out.print("Server : "+new String(rep.getData()));
        }
    }
    
}
