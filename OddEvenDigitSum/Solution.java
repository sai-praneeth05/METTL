class Solution{
    int[] countOddEven(int n){
        int EvenCount = 0;
        int OddCount = 0;
        while(n>0){
            int digit = n % 10;
            if(digit % 2 == 0){
                EvenCount = digit + EvenCount;
            }else{
                OddCount = digit + OddCount;
            }
            n = n /10;
        }
        return new int[] {EvenCount,OddCount};
    } 
    public static void main(String[] args){
        int n = 1258;
        Solution ref = new Solution();
        int[] result = ref.countOddEven(n);
        System.out.println("Sum of Even digits: " + result[0]);
        System.out.println("Sum of Odd digits: " + result[1]);
    }
}