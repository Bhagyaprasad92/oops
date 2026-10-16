package bufferedIO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Addition {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Enter the size of array: ");
        bw.flush();
        int size = Integer.parseInt(br.readLine());
        // int[] arr = new int[size];
        bw.write("Enter the array elements (seperate by space ' '): ");
        bw.flush();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int sum = 0;
        while(size-- > 0) {
            sum += Integer.parseInt(st.nextToken());
        }
        bw.write("Sum of given array of size = " + size + " => " + sum);
        bw.flush();
    }
}
