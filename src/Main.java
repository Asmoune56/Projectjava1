import java.util.Scanner;

public class Main {
    public static double Addition(double Nomber1, double Nomber2) {

        return Nomber1 + Nomber2;
    }

    public static double Soustraction(double Nomber1, double Nomber2) {
        return Nomber1 - Nomber2;
    }

    public static double Multiplication(double Nomber1, double Nomber2) {
        return Nomber1 * Nomber2;
    }

    public static double Division(double Nomber1, double Nomber2) {
        return Nomber1 / Nomber2;
    }

    public static double Puissance(double Nomber1, double Nomber2) {
        return Math.pow(Nomber1, Nomber2);
    }

    public static double Racine(double Nomber1) {
        return Math.sqrt(Nomber1);
    }

    public static double Factorielle(double Nomber1) {
        if (Nomber1 < 0) {
            throw new IllegalArgumentException("La factorielle d'un nombre négatif n'est pas définie !");
        }
        int resultat = 1;
        for (int i = 1; i <= (int) Nomber1; i++) {
            resultat *= i;
        }
        return resultat;
    }

    public static void main(String[] args) {
        double Nomber1 = 0, Nomber2 = 0;
        int chose;
        Scanner add = new Scanner(System.in);
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
            System.out.print("Choisir une operation parmi menu : ");


            while(true){
                try {
                    chose = add.nextInt();
                    break;
                } catch (Exception e) {
                    add.nextLine();
                    System.err.println("invalid inpout");

                }

            }

            if (chose >= 1 && chose <= 5) {
                System.out.print("Entrer le 1er nombre : ");

                while(true){
                    try {
                        Nomber1 = add.nextDouble();
                        break;
                    } catch (Exception e) {
                        add.nextLine();
                        System.err.println("invalid chose");

                    }

                }

                System.out.print("Entrer le 2eme nombre : ");

                while(true){
                    try {
                        Nomber2 = add.nextDouble();
                        break;
                    } catch (Exception e) {
                        add.nextLine();
                        System.err.println("invalid chose !!!");

                    }

                }


            } else if (chose == 6 || chose == 7) {
                System.out.print("Entrer un nombre : ");


                while(true){
                    try {
                        Nomber1 = add.nextDouble();
                        break;
                    } catch (Exception e) {
                        add.nextLine();
                        System.err.println("invalid chose !!!");

                    }

                }

            } else if (chose == 8) {
                System.out.println("Merci d'avoir utilisé la calculatrice. À bientôt !");
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
                    System.out.println("Multiplication est : " + Multiplication(Nomber1, Nomber2));
                    break;
                case 4:
                    if (Nomber2 == 0) {
                        System.out.println("ERREUR : Division par zéro !");
                    } else {
                        System.out.println("Division est : " + Division(Nomber1, Nomber2));
                    }
                    break;
                case 5:
                    System.out.println("Puissance est : " + Puissance(Nomber1, Nomber2));
                    break;
                case 6:
                    if (Nomber1 < 0) {
                        System.out.println("ERREUR : Racine carrée d'un nombre négatif non définie !");
                    } else {
                        System.out.println("Racine carrée est : " + Racine(Nomber1));
                    }
                    break;
                case 7:
                    if (Nomber1 < 0 || Nomber1 != (int) Nomber1) {
                        System.out.println("ERREUR : La factorielle est définie uniquement pour les entiers positifs !");
                    } else {
                        System.out.println("Factorielle est : " + Factorielle(Nomber1));
                    }
                    break;
                default:
                    System.out.println("Le numéro que vous avez saisi n'existe pas dans la liste.");
            }
        }
        add.close();
    }
}