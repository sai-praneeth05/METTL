class Solution{
    void isprime(int n){
        int flag = 0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println(n +" "+"Is a prime number");
        }else{
            System.out.println(n +" " +"Is not a prime number");
        }
    }
    public static void main(String[] args){
        Solution ref = new Solution();
        ref.isprime(11);
    }
}