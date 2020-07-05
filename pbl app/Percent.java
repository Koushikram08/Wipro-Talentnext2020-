public class Percent {
    public static void main(String args[]){
            double p;
            if(args[0].equals("Male")){
                if(Integer.parseInt(args[1])>1&&Integer.parseInt(args[1])<58)
                  p=8.4;  
                else
                    p=10.5;
            }
            else{
                if(Integer.parseInt(args[1])>1&&Integer.parseInt(args[1])<58)
                    p=8.2;  
              else
                  p=9.2;
            }

            System.out.println("the percentage of interest is: " +p+"%");
}
}