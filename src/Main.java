import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static double Addition(double Nomber1, double Nomber2){
        return Nomber1 + Nomber2;
    }
    public static double Soustraction(double Nomber1 ,double Nomber2){
        return Nomber1 - Nomber2;
    }
    public static double Multiplication(double Nomber1, double Nomber2){
        return Nomber1 * Nomber2;
    }
    public static double Division(double Nomber1 , double Nomber2){
        return Nomber1 / Nomber2;
    }
    public static double Puissance(double Nomber1 , double Nomber2){
        return Math.pow(Nomber1, Nomber2);
    }

    public static void main(String[] args) {
        double Nomber1 , Nomber2;
        int chose ;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("-------MENUE-------");
            System.out.println("1-Addition");
            System.out.println("2-Soustraction");
            System.out.println("3-Multiplication");
            System.out.println("4-Division");
            System.out.print("choisir une opÃ©ration parmi menu  : ");
            chose = input.nextInt();
            System.out.print("Entre 1ere Nbr : ");
            Nomber1 = input.nextDouble();
            System.out.print("Entre 2eme Nbr : ");
            Nomber2 = input.nextDouble();
            switch (chose) {
                case 1:
                    System.out.println("Addition est : " + Addition(Nomber1, Nomber2));
                    break;
                case 2:
                    System.out.println("Soustraction est : " + Soustraction(Nomber1, Nomber2));
                    break;
                case 3:
                    System.out.println("Multiplication est :" + Multiplication(Nomber1, Nomber2));
                    break;
                case 4:
                    if (Nomber2 == 0) {
                        System.out.println("ERREUR!!! :))))");
                    } else {
                        System.out.println("Division est : " + Division(Nomber1, Nomber2));
                    }
                    break;
                default:
                    System.out.println("BYE");
            }
        }

    }
}