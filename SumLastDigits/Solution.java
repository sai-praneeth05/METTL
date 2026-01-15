class Solution{
    static int SumLastDigits(int n1,int n2){
        int num1 = Math.abs(n1%10);
        int num2 = Math.abs(n2%10);
        return num1+num2;
    }
    public static void main(String[] args){
        int n1 = 267;
        int n2 = -154;
        int result = SumLastDigits(n1,n2);
        System.out.println(result);
    }
}