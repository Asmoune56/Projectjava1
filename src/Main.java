
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
    public static double Racine(double Nomber1){
        return Math.sqrt(Nomber1);
    }
    public static double Factorielle(double Nomber1){
        return Math.cos(Nomber1);
    }
    public static void main(String[] args) {
        double Nomber1 = 0 , Nomber2 = 0;
        int chose ;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("-------MENUE-------");
            System.out.println("1-Addition");
            System.out.println("2-Soustraction");
            System.out.println("3-Multiplication");
            System.out.println("4-Division");
            System.out.println("5-Puissance");
            System.out.println("6-Racine carrée");
            System.out.println("7-Factorielle");
            System.out.println("8-Quitter");

            System.out.print("choisir une operation parmi menu  : ");
            chose = input.nextInt();
            if (chose >= 1 && chose <= 5){
            System.out.print("Entre 1ere Nbr : ");
            Nomber1 = input.nextDouble();
            System.out.print("Entre 2eme Nbr : ");
            Nomber2 = input.nextDouble();}
            else if (chose == 6){
                System.out.print("Entrer un nombre : ");
                Nomber1 = input.nextDouble();
            }
            else if (chose == 7){
                System.out.print("Entrer un nombre : ");
             Nomber1 = input.nextDouble();
            }
            else if (chose == 8){
                System.out.print("Merci d'avoir utilisé la calculatrice. À bientôt !  ");
                break;
            }
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
                        System.out.println("ERREUR !!!");
                    } else {
                        System.out.println("Division est : " + Division(Nomber1, Nomber2));
                    }
                    break;
                case 5:
                    System.out.println("Puissance est : " + Puissance(Nomber1, Nomber2));
                    break;
                case 6:
                    System.out.println("Racine carrée est : " + Racine(Nomber1));
                    break;
                case 7:
                        System.out.println("Factorielle est : " + Factorielle(Nomber1));
                        break;
                default:
                    System.out.println("invalid chose");
            }
        }

    }
}