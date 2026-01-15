class Solution{
    public int countOdd(int n1,int n2, int n3,int n4,int n5){
        int[] arr = new int[] {n1,n2,n3,n4,n5};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int num1 = 12;
        int num2 = 17;
        int num3 = 19;
        int num4 = 14;
        int num5 = 115;
        Solution res = new Solution();
        int result = res.countOdd(num1,num2,num3,num4,num5);
        System.out.println(result);
    }
}