package jurnal_no1;
import java.util.Scanner;
public class Jurnal_no1 {

    public static void main(String[] args) {
    Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci : ");
        int n = show.nextInt();
        long fib[] = new long[n];
        long hasil = 0;
         
        fib[0] = 1;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        
        for (int i = 0; i < n; i++) {
            hasil = fib[i] + hasil;
        }
         
        for (int i = n-1; i >= 0; i--) {
            System.out.print(fib[i] +  " ");
        }
        
    }
    
}
