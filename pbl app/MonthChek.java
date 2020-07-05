public class MonthChek {
    public static void main(String args[]){
        int m=6;
        String s="";
        switch(m){
            case 1:{
                s="January";
                break;
            }
            case 2:{
                s="February";
                break;
            }
            case 3:{
                s="March";
                break;
            }
            case 4:{
                s="April";
                break;
            }
            case 5:{
                s="May";
                break;
            }
            case 6:{
                s="June";
                break;
            }
            case 7:{
                s="July";
                break;
            }
            case 8:{
                s="August";
                break;
            }
            case 9:{
                s="September";
                break;
            }
            case 10:{
                s="October";
                break;
            }
            case 11:{
                s="November";
                break;
            }
            case 12:{
                s="December";
                break;
            }
            default:{
                s="enter valid one";
                break;
            }
        }
        System.out.println(s);
        }
}