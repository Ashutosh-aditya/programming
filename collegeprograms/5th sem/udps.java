import java.util.*;
import java.net.*;
public class udps {
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        DatagramSocket skt =new DatagramSocket(3780);
        System.out.println("Server is ready");
        while(true)
        {
            byte buffer[] = new byte[1024];
            DatagramPacket req = new DatagramPacket(buffer, buffer.length);
            skt.receive(req);
            String msg = new String(req.getData());
            System.out.print("Client : "+msg);
            System.out.print("Server : ");
            String m=in.nextLine();
            byte sendmsg[] = m.getBytes();
            DatagramPacket rep = new DatagramPacket(sendmsg, sendmsg.length,req.getAddress(),req.getPort());    
            skt.send(rep);
        }

    }
}
