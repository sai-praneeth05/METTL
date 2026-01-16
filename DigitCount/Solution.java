class Solution{
    int digitCount(int n){
        int count = 0;
        while(n>0){
             n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int n = 1069;
        Solution ref = new Solution();
        int result = ref.digitCount(n);
        System.out.println("The no.of digits in "+n+ " is: \n"+result);
    }
}