import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);
        int day, month;
        System.out.print("kaçıncı ayda doğdunuz?: ");
        month = mert.nextInt();
        System.out.println(month + ".ayın hangi gününde doğdunuz?: ");
        day = mert.nextInt();
        if (month<=12){
            switch (month) {
                case 1:
                    if (day <= 31 && 1 >= day ) {
                        if (day < 22) System.out.println("oğlak burcusun");
                        else System.out.println("kova burcusun");
                    }
                    break;
                case 2:
                    if (day <= 28 && 1 >= day) {
                        if (day <= 19) System.out.println("kova burcusun");
                        else System.out.println("balık burcusun");
                    }
                    break;
                case 3:
                    if (day >= 1 && day <= 31) {
                        if (day <= 20) System.out.println("balık burcusun");
                        else System.out.println("koç burcusun");
                    }
                    break;
                case 4:
                    if (day >= 1 && day <= 30) {
                        if (day <= 20) System.out.println("koç burcusun");
                        else System.out.println("boğaburcusun");
                    }
                    break;
                case 5:
                    if (day >= 1 && day <= 31) {
                        if (day <= 21) System.out.println("boğa burcusun");
                        else System.out.println("ikizler burcusun");
                    }
                    break;
                case 6:
                    if (day >= 1 && day <= 30) {
                        if (day <= 22) System.out.println("ikizler burcusun");
                        else System.out.println("yengeç burcusun");
                    }
                    break;
                case 7:
                    if (day >= 1 && day <= 31) {
                        if (day <= 22) System.out.println("yengeç burcusun");
                        else System.out.println("aslan burcusun");
                    }
                    break;
                case 8:
                    if (day >= 1 && day <= 31) {
                        if (day <= 22) System.out.println("aslan burcusun");
                        else System.out.println("başak burcusun");
                    }
                    break;
                case 9:
                    if (day >= 1 && day <= 30) {
                        if (day <= 22) System.out.println("başak burcusun");
                        else System.out.println("terazi burcusun ");
                    }
                    break;
                case 10:
                    if (day >= 1 && day <= 31) {
                        if (day <= 22) System.out.println("terazi burcusun");
                        else System.out.println("akrep burcusun");
                    }
                    break;
                case 11:
                    if (day >= 1 && day <= 30) {
                        if (day <= 21) System.out.println("akrep burcusun");
                        else System.out.println("yay burcusun");
                    }
                    break;
                case 12:
                    if (day >= 1 && day <= 31) {
                        if (day <= 20) System.out.println("koç burcusun");
                        else System.out.println("boğaburcusun");
                    }
                    break;
                default:
                    System.out.println("hatalı giriş yaptınız bilgilerinizi kontrol edip tekrar deneyin");
            }
        }else System.out.println("hatalı giriş yaptınız bilgilerinizi  kontrol edip tekrar deneyin");


    }
}
