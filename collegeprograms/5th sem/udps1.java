import java.net.*;
import java.util.*;
public class udps1 {
    public static void main(String[] args) throws Exception
    {
        DatagramSocket skt = new DatagramSocket(3780);
        Scanner in = new Scanner(System.in);
        System.out.println("Server is ready");
        while(true)
        {
            byte buffer[] = new byte[1024];
            DatagramPacket req=new DatagramPacket(buffer, buffer.length);
            skt.receive(req);
            System.out.print("Client : "+new String(req.getData())+"\n");
            System.out.print("Server : ");
            String m=in.nextLine();
            byte buffer1[] = m.getBytes();
            DatagramPacket rep = new DatagramPacket(buffer1, buffer1.length,req.getAddress(),req.getPort());
            skt.send(rep);
        }
    }
}
