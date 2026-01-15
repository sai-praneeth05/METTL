class Solution{
    static int[] CountOddEven(int n1, int n2,int n3,int n4,int n5){
        int[] arr = new int[] {n1,n2,n3,n4,n5};
        int EvenCount=0;
        int OddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                EvenCount++;
            }else{
                OddCount++;
            }
        }
        return new int[]{EvenCount,OddCount};
        
    }
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 3;
        int num3 = 5;
        int num4 = 7;
        int num5 = 9;
        int[] result = CountOddEven(num1,num2,num3,num4,num5);
        System.out.println("Even numbers: " + result[0]);
        System.out.println("Odd numbers: " + result[1]);
    }
}