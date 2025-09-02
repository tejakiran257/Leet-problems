import java.util.*;
class sqrt{
     public int mySqrt(int x) {
        int n=1,h,k;
         k=(int) Math.sqrt(x);
            if(k%10==0){
               System.out.println(k);  
            }
            else{
                 k=Math.round(k);
            }
        return k;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        sqrt l=new sqrt();
        int a=s.nextInt();
        l.mySqrt(a);
    }
}
