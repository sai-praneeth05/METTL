class Solution{
    static int primeRange(int n1, int n2){
        int primecount = 0;
        for(int i=n1;i<=n2;i++){
            int count = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count = 1;
                    break;
                }
            }
            if(count==0){
                primecount++;
            }
        }
        return primecount;
    }
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 20;
        int result = primeRange(num1,num2);
        System.out.println("The prime numbers between "+num1+" and "+num2+"are: \n"+result);
    }
}