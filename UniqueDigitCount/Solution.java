class Solution{
    int uniqueDigitsCount(int n){
        int[] freq = new int[10];
        int count = 0;
        while(n>0){
            int digit = n%10;
            if(freq[digit]==0){
                count++;
                freq[digit] = 1;
            }
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args){
        int num = 1015;
        Solution ref = new Solution();
        int result = ref.uniqueDigitsCount(num);
        System.out.println("The unique digit count in " +num+" is: \n"+ result);
    }
}