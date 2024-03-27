import java.util.Scanner;

public class task_2 {

    private static final String[] sD = {"", "එක", "දෙක", "තුන", "හතර", "පහ", "හය", "හත", "අට", "නවය"};
    private static final String[] ty = {"", "දහය", "විසි", "තිස්", "හතළිස්", "පනස්", "හැට", "හැත්තෑ", "අසූ", "අනූ"};
    private static final String h = "සිය";
    private static final String th = "දහස්";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        String numberStr = scan.nextLine();

        String[] parts = numberStr.split("\\.");
        int integerPart = Integer.parseInt(parts[0]);
        int decimalPart = Integer.parseInt(parts[1]);

        formatIntegerPart(integerPart);
        formatDecimalPart(decimalPart);

        scan.close();
    }

    public static void formatIntegerPart(int integerPart) {
        if (integerPart < 1 || integerPart > 9999) {
            System.out.println("Invalid Number");
            return;
        }

        int a = integerPart % 10;
        int b = (integerPart / 10) % 10;
        int c = (integerPart / 100) % 10;
        int d = (integerPart / 1000) % 10;

        System.out.print("රුපියල් ");

        if (integerPart < 20) {
            System.out.print(sD[integerPart]);
        } else if (integerPart < 100) {
            System.out.print(ty[b] + (a != 0 ? " " + sD[a] : ""));
        } else if (integerPart < 1000) {
            System.out.print(sD[c] + h + (b != 0 || a != 0 ? " " : "") + (b != 0 ? ty[b] : "") + (b != 0 && a != 0 ? " " : "") + (a != 0 ? sD[a] : ""));
        } else {
            System.out.print(sD[d] + th + (c != 0 || b != 0 || a != 0 ? " " : "") + (c != 0 ? sD[c] + h + " " : "") + (b != 0 ? ty[b] : "") + (b != 0 && a != 0 ? " " : "") + (a != 0 ? sD[a] : ""));
        }
    }

    public static void formatDecimalPart(int decimalPart) {
        if (decimalPart != 0) {
            System.out.print("යි සත ");
            if (decimalPart < 5) {
                System.out.print(sD[decimalPart]);
            } else {
                int e = decimalPart % 10;
                int f = decimalPart / 10;
                System.out.print(ty[f] + (e != 0 ? sD[e] : "") + "ක් පමණයි.");
            }
        } else {
            System.out.print("යි පමණයි");
        }
    }
}
