package week1odev;

import java.util.Scanner;

public class HomeworkClass
{
  public static void main(String[] args) {
        /*
        1- Base salary:1000 dolars
        2- The weekly working hour: 40 hours
        3- If the employee has worked less than 40 hours, her/his salary should be reduced proportionally
        4- For every hour worked on weekdays over 40 hours, 1.5 times the hourly unit wage is paid.
        5- For every hour worked on weekends over 40 hours, 2 times the hourly unit wage is paid.
        6- If the employee has worked at least 40 hours during the week and more than 10 hours on the weekend,
        he or she will receive an additional bonus of $500.

         */
      System.out.println("Please enter your weekday working hours");
      Scanner scanner = new Scanner(System.in);
      double his = scanner.nextDouble();
      System.out.println("Please enter your weekend working hours");

      double hss = scanner.nextDouble();
      scanner.close();
      System.out.println("haftasonu saati :"+ hss);

        int maas=1000;
        int mesai= 25;
        if (his<40)
        {
            System.out.println("hafta içi toplam çalışma saatiniz: "+ his);
            System.out.println("Toplam ücretiniz: "+(his*25));
        }
        else if (his==40)
        {
            System.out.println("hafta içi toplam çalışma saatiniz: 40");
            System.out.println("Toplam ücretiniz: "+(his*25)+" Euro");
        }
        else if (his>40&&hss!=0)
        {
            System.out.println("hafta içi toplam çalışma saatiniz: "+his);
            System.out.println("Toplam ücretiniz: "+(1000+((his-40)*(25*1.5))+" Euro"));
        }
      System.out.println(his);
      //his: hafta içi çalışma saatleri

      System.out.println("Please enter your weekend working hours");

      double hss = scanner.nextDouble();
      scanner.close();
      System.out.println("haftasonu saati :"+ hss+ "maaşın:"+maas);
      //hss: hafta sonu çalışma saatleri
  }

}
