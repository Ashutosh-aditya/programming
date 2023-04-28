
import java.io.*;
import java.net.Socket;
public class cli {
    public static void main(String[] args) throws Exception{
        try (Socket sock = new Socket("127.0.0.1",4000)) {
            System.out.print("Enter file name : ");
            BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
            String fname=kb.readLine();
            OutputStream oStream = sock.getOutputStream();
            PrintWriter pwrite = new PrintWriter(oStream,true);
            pwrite.println(fname);
            InputStream isstream=sock.getInputStream();
            BufferedReader sockread = new BufferedReader(new InputStreamReader(isstream));
            String str;
            while((str=sockread.readLine())!=null)
                System.out.println(str);
            pwrite.close();
            sockread.close();
            kb.close();
        }
    }
}
