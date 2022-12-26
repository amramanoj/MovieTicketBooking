import java.util.Scanner;

public class TicketBook {
    int toprice;
    public void ticketBook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n enter number of person");
        int num=sc.nextInt();

       for(int i=0;i<num;i++){
           System.out.println("\n Enter age for book ticket");
           int age=sc.nextInt();
          toprice+= ticketprice(age);
       }

        System.out.println("total ticket : "+num+" "+"\ntotal price  "+toprice+"/-");


    }
    public int ticketprice(int age){
        int result=0;
        if(age<3){
           result=0;
        }else if(age>=3&&age<=12){
          result=100;
        }else {
          result =150;
        }
        return  result;
    }
}
