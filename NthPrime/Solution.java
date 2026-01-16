class Solution{
    int nthPrime(int n){
        int countPrime = 0;
        int i = 2;
        while(true){
            int count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                countPrime++;
                if(countPrime==n){
                    return i ;
                }
            }
            i++;
        }
    }
    public static void main(String[] args){
        int n = 5;
        Solution ref = new Solution();
        int result = ref.nthPrime(n);
        System.out.println("The "+n+"th prime number is: \n"+result);
    }
}