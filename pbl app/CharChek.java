public class CharChek {
    public static void main(String args[]){
        char a='b';
        if(a>'a'&&a<'z'){
            System.out.println("alphabet");
        }
        else if(a>'0'&&a<'9'){
            System.out.println("number");
        }
        else{
            System.out.println("Special Character");
        }
    }
}