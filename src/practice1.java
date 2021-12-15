import java.util.Scanner;
public class practice1 {
    public static void main ( String [] args ){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(fibonacciRecursive(num));
        System.out.println(fibonacciWithArray(num));
    }
    public static long fibonacciRecursive(int n){
        if (n <= 1)
            return n;
        else
            return fibonacciRecursive(n-1) +fibonacciRecursive(n-2);
    }



    public static long fibonacciWithArray(int n){
        long[] fib=new long[n+1];
        fib[0]=0;
        fib[1]=1;
        for (int i=2;i< fib.length;i++){
            fib[i]=fib[i-2]+fib[i-2];
        }
        return fib[n];
    }
}
