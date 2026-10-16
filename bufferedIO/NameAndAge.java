package bufferedIO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.StringTokenizer;
import java.io.OutputStreamWriter;

public class NameAndAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // System.out.print("Enter your Name: ");
        bw.write("Enter your Name: ");
        bw.flush();
        String name = br.readLine();
        // System.out.println("Your name is :" + name);
        bw.write("Your name is :" + name);
        bw.newLine();
        bw.flush();
        // System.out.print("Enter your Age: ");
        bw.write("Enter your Age: ");
        bw.flush();
        try {
            int age = Integer.parseInt(br.readLine());
            // System.out.println("Your age is: " + age);
            bw.write("Your age is: " + age);
            bw.flush();
        } catch (NumberFormatException e) {
            // System.err.println("Please enter a valid age.");
            bw.write("Please enter a valid age.");
            bw.flush();
        }
        br.close();
        // bw.flush();
        bw.close();
    }
}