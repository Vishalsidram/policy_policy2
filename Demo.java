class Demo
{
public static void main(String[] args){
public static int C_digit(int num){
int digit=0;
while(num!=0){
num=num/10;
digit++;
}
return digit;
}
public static int F-armstrong(int num){
int res=0;
int digit=C_digit(num);
while(num!=0){
int rem=num%10;
int res=(int)Math.pow(rem,digit)+res;
num=num/10;
}
return res;
}

public static void main(String[] args){
int num=370;
int res1=F-armstrong(num);
if(res1==num){
System.out.println("It is a ArmStrong Number);
}
else{
System.out.println("It is NOT a ArmStrong Number);
}
}
}
