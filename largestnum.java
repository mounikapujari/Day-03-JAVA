import java.util.*;
public class largestnum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("largest num is a="+a);
            }
            else{
                System.out.println("largest num is c="+c);
            }
            }
        else{
            if(b>c){
                System.out.println("largest num is b="+b);
            }
            else{
                System.out.println("largest num is c="+c);
            }
        }
    }
}