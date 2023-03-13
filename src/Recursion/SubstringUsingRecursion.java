package Recursion;

public class SubstringUsingRecursion {
    public static void main(String[] args) {
        String s= "abc";
        String[] result = allSubstring(s);
        System.out.println("###");
        for(String i:result){
            System.out.println(i);
        }
    }

    static String[] allSubstring(String s){
        int l = s.length();
        String result[] = new String[factorial(l)];
        System.out.println("result "+result.length);
        if(l == 0){
            result[0] = "";
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
           int counter1 = 0;
            for( int i = 0; i< l-1; i++){
                
                String temp1[] = new String[factorial(i)];
                String temp2[] = new String[factorial(l-i-1)];
                
                temp1 = allSubstring(s.substring(0, i));
                temp2 = allSubstring(s.substring(i+1, l));
                counter1 = counter;
                for(int j = 0; i<=temp1.length; j++){
                    System.out.println("!!! "+temp1[j]);
                    result[counter] = temp1[j]+s.charAt(i);
                    System.out.println("%%% "+result[counter]);
                    counter++;
                }
                /**
                for(String j: temp1){
                    System.out.println("!!! "+j);
                    result[counter] = j+s.charAt(i);
                    System.out.println("%%% "+result[counter]);
                    counter++;
                }*/
                for(String j: temp2){
                    System.out.println("@@@@@ "+j);
                    result[counter1] = result[counter1]+""+j;
                    System.out.println("^^^^^ "+result[counter1]);
                    counter++;
                    counter1++;
                }
                
                /**String temp1[] = new String[factorial(l-1)];
                temp1 = allSubstring(temp);
                for( String j: temp1){
                    result[counter] = s.charAt(i) + j;
                    counter++;
                }*/
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
