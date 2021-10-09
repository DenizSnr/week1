package week1;

import java.util.Scanner;

public class week1 {

    public static void main(String[] args){


        double salary = 0;

        System.out.println("Please enter weekly base salary");    
        Scanner scanner = new Scanner(System.in);
        double maas = scanner.nextDouble();
        if (maas < 1000){
            System.out.println("Please enter a valid weekly base salary");
        }
        else{
            double saatlik = maas / 40;
            System.out.println("Please enter working hours in weekdays");
            int hics = scanner.nextInt();
            System.out.println("Please enter working hours in weekends");
            int hscs = scanner.nextInt();

            //calculate total working hours
            int totalWorkingHours = hics + hscs ;

            if(totalWorkingHours <= 40 ){
                salary = maas - ((40 - totalWorkingHours) * saatlik);
            }
            else{
                if(hics < 40 ){
                    salary = maas + ((totalWorkingHours - 40) * saatlik * 2);
                }
                else{
                    if(hscs < 10){
                        salary = maas + ((hics - 40) * saatlik * 1.5) + (hscs * saatlik * 2) ;
                    }
                    else{
                        salary = maas + ((hics - 40) * saatlik * 1.5) + (hscs * saatlik * 2) + 500 ;
                        System.out.println("Congratulations, you earned 500$ bonus !!");
                    }
                }
            }
        }

        if(salary != 0) {
            System.out.println("The salary is:" + salary);
        }
        scanner.close();

    }
}

