package deneme2;
import java.util.Scanner;
public class denemeClass2
{
        public static void main(String[] args)
        {

System.out.println("Hafta içi çalışma saati girin:");
        Scanner scanner= new Scanner(System.in);
        Double his=scanner.nextDouble();
        System.out.println("Haftasonu çalışma saati giriniz:");
        Double hss=scanner.nextDouble();
        Scanner.close();

        int maas=1000;
        int prim=0;
        int mesai=25;
        if (his>=0 && his<=120 && hss>=0 && hss<=48)
        {
                if(his<40)
        {
        if(his+hss<40)
                {
                        System.out.println("Toplam çalışma süresi = "+(his+hss)+"saattir…");
                        System.out.println("Toplam alacağınız ücret = "+(his+hss)*mesai);
                }
        else if(hss>=40)
                {

                System.out.println("Toplam çalışma süresi = "+(his+hss)+"saattir");
                System.out.println("= "+ ((his+40)*mesai)+(hss-40)*(mesai*2)+"Euro");
                }
        else if(his>=40)
                {
                if(hss>10)

                        if(hss>40)
                        {
                           int prim=int prim+((hss-40)*(mesai*2));
                           return;
                        System.out.println("Toplam çalışma süresi = "+(his+hss)+"saattir");
                        System.out.println("Toplam alacağınız ücret = "+((his+hss)*mesai)+500+prim);

                        }
                }
        }

        }
        }
}