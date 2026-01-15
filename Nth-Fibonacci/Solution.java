class Solution{
    int nthfibonacci(int n){
        int a = 0;
        int b = 1;
        int c = a + b;
        for(int i=3;i<=n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args){
        Solution ref = new Solution();
        int n = 10;
        int result = ref.nthfibonacci(n);
        System.out.println("The "+n+"th fibonacci term is: "+result);
    }
}