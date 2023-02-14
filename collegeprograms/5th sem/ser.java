
import java.util.*;
import java.io.*;
import java.net.*;
public class ser {
    public static void main(String[] args) throws Exception{
        ServerSocket sersock = new ServerSocket(4000);
        System.out.println("Server ready for connection");
        Socket sock = sersock.accept();
        System.out.println("Connection Successful and ready for chatting");
        InputStream iStream= sock.getInputStream();
        BufferedReader fileread = new BufferedReader(new InputStreamReader(iStream));
        String fname=fileread.readLine();
        System.out.println("File name received from client is "+fname);
        BufferedReader contentread = new BufferedReader(new FileReader(fname));
        OutputStream oStream = sock.getOutputStream();
        PrintWriter pwrite = new PrintWriter(oStream,true);
        String str;
        while((str=contentread.readLine())!=null)
        {
            pwrite.println(str);
            System.out.println(str);
        }
        sersock.close();
        contentread.close();
        sock.close();
        pwrite.close();
        fileread.close();
    }
    
}
