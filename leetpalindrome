import java.util.Scanner;
class leetpalindrome {
    public boolean isPalindrome(int x) {
        int sum=0,temp,i,y;
        temp=x;
        if(x<0){ 
            y=-(x);             
         while(y>0){
            i=y%10; 
            sum =(sum*10)+i; 
            y=y/10;
        }
        System.out.println("false");
        }
        else{
        while(x>0){
            i=x%10;
            sum =(sum*10)+i;
            x=x/10;
        }
                System.out.println("true");
        }
        
       return temp==sum;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        leetpalindrome l=new leetpalindrome();
        int a=s.nextInt();
        l.isPalindrome(a);

    }
}
