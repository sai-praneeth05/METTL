class Solution{
    static int isMultiple(int n1, int n2){
        if(n1==0 || n2==0){
            return 3;
        }else if(n1 % n2 == 0){
            return 2;
        }else{
            return 1;
        }
    }
    public static void main(String[] args){
        int num1 = 8;
        int num2 = 4;
        int result = isMultiple(num1,num2);
        System.out.println(result);
    }
}