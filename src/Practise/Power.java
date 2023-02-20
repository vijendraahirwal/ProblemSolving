package practise;

public class Power {

    public static void main (String[] args) {
        double x =0.00001;
        int n = 2147483647;
        double pow = myPow(x,n);
        System.out.println(pow);
    }

    public static double myPow(double x, int n) {
        double pow=0;
        if(n == 0){
            return 1;
        }
        pow = myPow(x,n/2);
        if(n%2 == 0){
            return pow*pow;
        }
        else if(n%2 ==1){
            return x*pow*pow;
            //return pow;
        }
        else{
            return 1/myPow(x,-n);
        }
        
    }
}
