import java.net.*;
import java.util.*;
public class udpc1 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        DatagramSocket skt= new DatagramSocket();
        InetAddress host = InetAddress.getByName("127.0.0.1");
        int port=3780;
        while(true)
        {
            System.out.print("Client : ");
            String msg = in.nextLine();
            byte buffer[] = msg.getBytes();
            DatagramPacket req = new DatagramPacket(buffer, buffer.length,host,port);
            skt.send(req);
            byte buffer1[] = new byte[1024];
            DatagramPacket rep = new DatagramPacket(buffer1, buffer1.length);
            skt.receive(rep);
            System.out.print("Server : "+new String(rep.getData()));
        }
    }
}
