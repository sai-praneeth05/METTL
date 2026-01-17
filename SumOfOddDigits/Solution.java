class Solution{
    int oddDigitCount(int n){
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            if(digit % 2!= 0){
                sum = sum + digit;
            }
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = 1069;
        Solution ref = new Solution();
        int result = ref.oddDigitCount(n);
        System.out.println("The sum of odd digits in "+n+" is: \n"+result);
    }
}