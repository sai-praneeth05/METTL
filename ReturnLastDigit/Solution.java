class Solution{
    static int LastDigitOf(int n){
        int result = Math.abs(n%10);
        return result;
    }
    public static void main(String[] args){
        int n=-85;
        int res = LastDigitOf(n);
        System.out.println(res);
    }
}