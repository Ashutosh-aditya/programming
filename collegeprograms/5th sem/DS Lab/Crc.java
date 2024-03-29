import java.util.Scanner;
public class Crc {
    public static int t[] = new int[128], cs[] = new int[128], a, e, c,
            g[] = { 1, 0, 1, 1 };
    static final int n = g.length;
    static void xor() {
        for (int c = 1; c < n; c++)
            cs[c] = ((cs[c] == g[c]) ? 0 : 1);
    }
    static void crc() {
        for (int e = 0; e < n; e++)
            cs[e] = t[e];
        do {
            if (cs[0] == 1)
                xor();
            for (c = 0; c < n - 1; c++)
                cs[c] = cs[c + 1];//shifting bits
            cs[c] = t[e++]; //adding other element of crc denoted by downward arrow in theory 
        } while (e <= a + n - 1);
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the size of chat word:");
            a = in.nextInt();
            System.out.println("Enter dataword:");
            for (int i = 0; i < a; i++)
                t[i] = in.nextInt();
            for (e = a; e < a + n - 1; e++)
                t[e] = 0;
            System.out.println("Modified Datawords:");
            for (int i = 0; i < a + n - 1; i++)
                System.out.println(t[i]);
            crc();
            System.out.println("checksum");
            for (int i = 0; i < n - 1; i++)
                System.out.println(cs[i]);
            for (int e = a; e < a + n - 1; e++)
                t[e] = cs[e - a];
            System.out.println("Final codeword");
            for (int i = 0; i < a + n - 1; i++)
                System.out.println(t[i]);
            System.out.println("Test error detection? 0(yes)/1(no)");
            e = in.nextInt();
            if (e == 0) {
                System.out.format("Enter position b/w %d and %d where error is to be introduced ", 0, a - 1);
                e = in.nextInt();
                t[e] = (t[e] == 0 ? 1 : 0);
                System.out.println("Dataword after error:");
                for (int i = 0; i < a; i++)
                    System.out.println(t[i]);
            }
        }
        crc();
        for (e = 0; e < n - 1 && (cs[e] != 1); e++);
        if (e < n - 1)
            System.out.println("Error detected");
        else
            System.out.println("No error detected");
    }
}