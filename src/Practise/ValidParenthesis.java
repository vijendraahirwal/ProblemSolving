package Practise;

public class ValidParenthesis {
    public static void main(String[] args) {
        String input = "'";
        Stack1 stack = new Stack1(input.length());
        boolean flag = false;
        for(int i=0; i<input.length();i++){
            char temp = input.charAt(i);
            if( temp == '{' || temp == '[' || temp == '('){
                //System.out.println("Stack Created asdasdsadasdasdasdsad"); 
                stack.push(temp);
                flag = true;

                //System.out.println(stack.top);
            }
            else if( temp == '}' || temp == ']' || temp == ')'){
                //char closing;
                if(temp == '}'){
                    if(stack.top() == '{'){
                        System.out.println("Inside }");
                        stack.pop();
                    }
                    else{
                        System.out.println("String not Matched");
                        flag = false;
                        break;
                    }
                }
                else if(temp == ']'){
                    if(stack.top() == '['){
                        System.out.println("Inside ]");
                        stack.pop();
                    }
                    else{
                        System.out.println("String not Matched");
                        flag = false;
                        break;
                    }
                }
                else if(temp == ')'){
                    if(stack.top() == '('){
                        System.out.println("Inside )");
                        stack.pop();
                    }
                    else{
                        System.out.println("String not Matched");
                        flag = false;
                        break;
                    }
                }
                else{
                    System.out.println("String not Matched");
                    flag = false;
                    break;
                }
            }

        }
        System.out.println(stack.size());
        if(flag){
            if(stack.size() == -1){
                System.out.println("String Matched");
            }
            else{
                System.out.println("String not Matched");
            }
        }
        else{
            System.out.println("String not Matched");
        }
    }
}
    

class Stack1{
    public char[] array;
    int top = -1;

    Stack1(int size){
        array = new char[size];
        System.out.println("Stack Created " +array.length); 
        System.out.println("Stack Createdsdfsdfsdfsdf");
    }

    void push(char element){
        if( top >= array.length-1){
            System.out.println("Stack Full");
        }
        else{
            top++;
            array[top] = element;
            //System.out.println("Item Pushed "+ );
            System.out.println("Item Pushed "+array[top]);
            //System.out.println(top);
        }
    }

    char pop(){
        char element = ' ';
        if(top <= -1){
            System.out.println("Stack Empty");
        }
        else{
            element = array[top];
            top--;
            System.out.println("Item popped "+element);
            
        }
        return element;
    }

    char top(){

        char element = ' ';
        if(top <= -1){
            System.out.println("Stack Empty");
        }
        
        else if(top >= array.length){
            System.out.println("Stack Full");
        }
        
        else{
            element = array[top];
            System.out.println(element);
        }
        return element;
    }

    int size(){
        
        return top;

    }

}