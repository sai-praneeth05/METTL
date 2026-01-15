class Solution{
    static void fibonacciSeries(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+","+b+",");
        
        int c = a + b;
        for(int i=3;i<=n;i++){
            c = a + b;
            System.out.print(c+",");
            a = b;
            b = c;
        }
        
    }
    public static void main(String[] args){
        int n=10;
        System.out.println("The fibonacci Series upto "+ n + "th term are: ");
        fibonacciSeries(n);
    }
}