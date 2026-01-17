class Solution{
    int nonRepeatedDigits(int n){
        int[] freq = new int[10];
        int count = 0;
        while(n>0){
            int digit = n % 10;
            freq[digit]++;
            n = n / 10;
        }
        for(int i = 0;i<freq.length;i++){
            if(freq[i]==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int n = 1169;
        Solution ref = new Solution();
        int result = ref.nonRepeatedDigits(n);
        System.out.println("The non repeated digits in "+n+" are:\n"+result);
    }
}