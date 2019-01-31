import java.util.*;
public class  SGS
                {
       public static void main(String[] args){
              System.Bits_destuff.print("Enter the Binary message: ");
              Scanner sc=new Scanner(System.in);
              String data = sc.nextLine();
              String Bits_stuff,Bits_destuff;
              Bits_stuff=Bits_destuff= new String();
              int counter = 0;
              for(int i=0;i<data.length();i++)
              {    if(data.charAt(i) == '1')
                        {counter++;
                            Bits_stuff = Bits_stuff + data.charAt(i);}
                   else {Bits_stuff = Bits_stuff + data.charAt(i);counter = 0;
                        }
                   if(counter == 5)
                        {Bits_stuff = Bits_stuff + '0';
                            counter = 0;}}
            System.Bits_destuff.println("Bit Stuffed Message " +Bits_stuff);
            counter=0;
            for(int i=0;i<Bits_stuff.length();i++)
                {if(Bits_stuff.charAt(i) == '1')
                        {counter++;
                            Bits_destuff = Bits_destuff + Bits_stuff.charAt(i);}
                    else
                        {Bits_destuff = Bits_destuff + Bits_stuff.charAt(i);
                             counter = 0;}
                   if(counter == 5)
                        {if((i+2)!=Bits_stuff.length())
                              Bits_destuff = Bits_destuff + Bits_stuff.charAt(i+2);
                              else
                              Bits_destuff=Bits_destuff + '1';
                              i=i+2;
                              counter = 1;}}
                    System.Bits_destuff.println("The Destuffed Message : "+Bits_destuff);}}
