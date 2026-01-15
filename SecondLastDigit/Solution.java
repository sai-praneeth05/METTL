class Solution{
    static int SecondLast(int n){
        if(Math.abs(n)>=10){
            int result = Math.abs(n /10);
            return result % 10;
        }else{
            return -1;
        }
    }
    public static void main(String[] args){
        int n=69;
        int res = SecondLast(n);
        System.out.println(res);
    }
}