
public class Palindrome {
    public static void main(String[] args){
        int num=122,n=num;
        int revNum=0;
        int lastDigit=0;
        while(num>0){
            lastDigit=num%10;
            num=num/10;
            revNum=(revNum*10)+lastDigit ;
        }
        if(n ==revNum){
            System.out.println(n+ "is a Palindrome");
        }
        else{
            System.out.println(n+ "is Not a Palindrome");
        }
    } 
    
}