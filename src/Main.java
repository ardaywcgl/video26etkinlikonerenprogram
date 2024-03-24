import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz:");
        int sicaklik  = scan.nextInt();

        if (sicaklik > 30) {
            System.out.println("Hava sıcaklığına bakılırsa yüzmenizi öneriyorum");
        }else if (sicaklik <= 30 && sicaklik >= 5 ){
            System.out.println("HAva durumuna bakılırsa sinemaya gitmenizi öneriyorum");
        }else {
            System.out.println("Bu havada kayak yapmanızı öneriyorum");
        ;
        }

    }
}