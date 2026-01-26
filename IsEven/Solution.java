class Solution{
static int checkOdd(int n){
if(n%2==0){
return 2;
}else{
return 1;
}
}
public static void main(String[] args){
int n = 15;
int result = checkOdd(n);
System.out.println(result);
}
}
