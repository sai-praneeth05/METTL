class Solution{
    int evenDigitSum(int n){
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            if(digit%2==0){
                sum = sum + digit;
            }
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 1258;
        Solution ref = new Solution();
        int result = ref.evenDigitSum(n);
        System.out.println("The sum of even digits in " +n+ " is:\n"+result );
    }
}