class Solution{
    int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        int n = 5;
        Solution ref = new Solution();
        int result = ref.factorial(n);
        System.out.println("The factorial of "+n+" is "+ result);
    }
}