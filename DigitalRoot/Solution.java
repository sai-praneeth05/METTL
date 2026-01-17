class Solution{
    int digitSum(int n){
        while(n>=10){
            int sum = 0;
            while(n>0){
                int digit = n % 10;
                sum = sum + digit;
                n = n/10;
            }
            n = sum;
        }
        return n;
    }
    public static void main(String[] args){
        int n = 84001;
        Solution ref = new Solution();
        int result = ref.digitSum(n);
        System.out.println("The Digital Root of " +n+ " is:\n"+result );
    }
}