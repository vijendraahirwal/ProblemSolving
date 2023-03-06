package Recursion;

public class SubstringUsingRecursion {
    public static void main(String[] args) {
        String s= "abcd";
        String[] result = allSubstring(s);
        for(String i:result){
            System.out.println(i);
        }
    }

    static String[] allSubstring(String s){
        int l = s.length();
        String result[] = new String[factorial(l)];
        System.out.println("result "+result.length);
        if(l == 0){
            result[0] = " ";
            return result;
        }
        else if(l == 1){
            result[0] = s;
            return result;
        }
        else if(l == 2){
            System.out.println("Inside if");
            result[0] = s.charAt(0)+""+ s.charAt(1);
            result[1] = s.charAt(1)+""+ s.charAt(0); 
        }
        else{
           int counter = 0;
            for( int i = 0; i< l; i++){
                String temp = "";
                for(int j=0; j<l; j++){
                    if(i != j){
                        temp = temp+ s.charAt(j);
                    }
                }
                String temp1[] = new String[factorial(l-1)];
                temp1 = allSubstring(temp);
                for( String j: temp1){
                    result[counter] = s.charAt(i) + j;
                    counter++;
                }
            }
        }
        return result;
    }

    static int factorial(int n){
        int result = 1;
        for(int i = 1; i<=n; i++){
            result = result*i;
        }
        return result;
    }
}
