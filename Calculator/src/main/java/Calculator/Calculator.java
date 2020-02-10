package Calculator;
import java.util.*;
public class Calculator
   {
      public static void main(String args[])
      {
            String op;
            int flag=0;
            double a1,a2;
            Scanner s=new Scanner(System.in);
            boolean a=true;
            Arithmetic[] operation={new Addition(),new Subtraction(),new Multiply(),new Division()};
       	    String[] ch= {"+","-","*","/"};
            while(a)
              {
                 System.out.println("Enter Operator");
                 op=s.next();
                 for(int i=0;i<ch.length;i++)
                 {
                	 if(op.equals(ch[i]))
                	 {
                		 System.out.println("Enter numbers");
                         a1=s.nextInt();
                         a2=s.nextInt();
                		 operation[i].calculate(a1,a2);
                		 flag=1;
                		 break;
                	 }
                 }
                 if(flag==0)
                	 System.out.println("Invalid operator");
                 System.out.println("Do you want to continue(y/n)");
                 char c=s.next().charAt(0);
                 if(c=='n')
                	 a=false;
               }
             s.close();
         }
    }



