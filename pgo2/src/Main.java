import java.time.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String day= LocalDate.now().getDayOfWeek().name().toLowerCase();
        Scanner scanner= new Scanner(System.in);
        System.out.println("podaj miejsce zamieszkania");
        String place= scanner.next();
        System.out.println("podaj swój wiek");
        int age= scanner.nextInt();
        System.out.println("podaj dzień tygodnia");


        double discount=0;
        double wynik=40;
        double agediscount=0;
        double placediscount=0;
        double  daydiscount=0;

        if(age<10){
            wynik=0;
            discount=100;
        } else if (age>=10 && age<=18) {
            agediscount=50;
        }
        if(place.equals("Warsaw")){
            placediscount=10;
        }
        if(day.equals("thursday")){
            daydiscount=100;
            wynik=0;
        }
        discount= agediscount+placediscount+daydiscount;
        wynik=wynik-(wynik*discount*0.01);


        System.out.println("data:"+" "+ place + ", " +age+ " yeares old, "+ day + " price: " +wynik+" PLN");
        System.out.println("Discount" + discount +"%");


    }
}