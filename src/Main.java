import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cena = 14.99;                                       // Zadanie nr2 Spinek Dominik
        int pin = 1234;
        int blikKod = 1234;

        System.out.println("Do zapłaty jest " + cena + "PLN");
        System.out.println("Proszę wybrać sposób płatności \n1.Gotówka \n2.Karta \n3.Blik ");
        int sposobPlatnosci = scanner.nextInt();

        switch (sposobPlatnosci) {
            case 1 -> {
                System.out.println("Podaj Kwotę: ");
                double kw1 = scanner.nextDouble();
                if (cena - kw1 <= 0) {
                    System.out.println("Twoja reszta to " + (kw1 - cena) + "PLN");
                    System.out.println("Drukuję paragon \nTransakcja zakończona sukcesem :)");
                } else {
                    System.out.println("Koniec procesu, zbyt mało gotówki \n:(");
                }
            }
            case 2, 3 -> {
                System.out.println("Czy terminal jest włączony?(y/n)");
                String a1 = scanner.next();
                if (a1.equals("y") || a1.equals("Y")) {
                    System.out.println("Czy jest podpięty internet i czy sprawnie działa?(y/n)");
                    String a2 = scanner.next();
                    if (a2.equals("y") || a2.equals("Y")) {
                        if (sposobPlatnosci == 2){
                            System.out.println("Czy odczytanie karty poszło poprawnie?(y/n)");
                            String a3 = scanner.next();
                            if (a3.equals("y") || a3.equals("Y")){
                                System.out.println("Proszę podać PIN: ");
                                int podajPin = scanner.nextInt();
                                if (pin == podajPin){
                                    System.out.println("Czy na koncie jest wystarczająca ilość środków?(y/n)");
                                    String a4 = scanner.next();
                                    if (a4.equals("y") || a4.equals("Y")){
                                        System.out.println("Czy pobranie środków nastąpiło poprawnie?(y/n)");
                                        String a5 = scanner.next();
                                        if (a5.equals("y") || a5.equals("Y")){
                                            System.out.println("Czy drukować potwierdzenie?(y/n)");
                                            String a6 = scanner.next();
                                            if (a6.equals("Y") || a6.equals("y")){
                                                System.out.println("Drukuję paragon i potwierdzenie \nTransakcja przebiegła pomyślnie");
                                            }else{
                                                System.out.println("Drukuję paragon \nTransakcja przebiegła pomyślnie");
                                            }
                                        }else{
                                            System.out.println("Koniec procesu. Błąd systemowy");
                                        }
                                    }else{
                                        System.out.println("Koniec procesu. Zbyt mało pieniędzy");
                                    }
                                }else{
                                    System.out.println("Koniec procesu. Błędny PIN");
                                }
                            }else{
                                System.out.println("Błąd karty, koniec procesu :(");
                            }

                        } else {
                            System.out.println("Wpisz Kod Blik:");
                            int wpiszBlik = scanner.nextInt();
                            if (wpiszBlik == blikKod){
                                System.out.println("Czy na koncie jest wystarczająco śroków?(y/n)");
                                String b1 = scanner.next();
                                if (b1.equals("y") || b1.equals("Y")){
                                    System.out.println("Czy transakcja została potwierdzona na telefonie?(y/n)");
                                    String b2 = scanner.next();
                                    if (b2.equals("Y") || b2.equals("y")){
                                        System.out.println("Czy pobranie środków odbyło się poprawnie?(y/n)");
                                        String b3 = scanner.next();
                                        if (b3.equals("y") || b3.equals("Y")){
                                            System.out.println("Drukować potwierdzenie(y/n)");
                                            String b4 = scanner.next();
                                            if (b4.equals("y") || b4.equals("Y")){
                                                System.out.println("Drukuję paragon i potwierdzenie");
                                                System.out.println("Traksakcja Udana ");
                                            }else{
                                                System.out.println("Drukuję Paragon");
                                                System.out.println("Transakcja Udana");
                                            }
                                        }else{
                                            System.out.println("Koniec procesu, błąd");
                                        }
                                    }else{
                                        System.out.println("Koniec procesu tranksakcja odrzucona");
                                    }
                                }else{
                                    System.out.println("Koniec procesu, zbyt mało pieniędzy");
                                }
                            }else{
                                System.out.println("Koniec procesu. Zły kod Blik");
                            }
                        }
                    } else {
                        System.out.println("Sprawdź połaczenie internetowe");
                    }
                } else {
                    System.out.println("Nie można dokonać płatności przez wyłączony terminal");
                }
            }
            default -> System.out.println("Miałeś wybrać 1,2 albo 3");
        }
    }
}