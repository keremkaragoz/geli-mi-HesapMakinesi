import java.util.Scanner;

public class hesapMakinesi {
    static int toplam(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayi: ");
        int n1 = inp.nextInt();
        System.out.print("Ikinci Sayi: ");
        int n2 = inp.nextInt();
        int result= n1+n2;
        System.out.println("Toplam : " +result);
        return result;
    }
    static int cıkarma(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayi: ");
        int n1 = inp.nextInt();
        System.out.print("Ikinci Sayi: ");
        int n2 = inp.nextInt();
        int result= n1-n2;
        System.out.println("Cıkarma : " +result);
        return result;
    }
    static int carpma(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayi: ");
        int n1 = inp.nextInt();
        System.out.print("Ikinci Sayi: ");
        int n2 = inp.nextInt();
        int result= n1*n2;
        System.out.println("Çarpma : " +result);
        return result;
    }
    static int bolme(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayi: ");
        int n1 = inp.nextInt();
        System.out.print("Ikinci Sayi: ");
        int n2 = inp.nextInt();
        if (n2==0){
            System.out.println("Bolen 0 olamaz.");
            return 0;
        }
        int result = n1 / n2;
        System.out.println("Bolum : "+result);
        return result;
    }
    static int usluSayi(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Us alinacak Sayi: ");
        int n1 = inp.nextInt();
        System.out.print("Us Sayisi: ");
        int n2 = inp.nextInt();
        int result = 1;
        for (int i =1 ; i<= n2;i++){
            result*=n1;
        }
        System.out.println("Uslu Sayi: " + result);
        return result;
    }
    static int fakt(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi: ");
        int n1 = inp.nextInt();
        int result = 1;
        for (int i=1 ; i<=n1 ;i++){
            result*=i;
        }
        System.out.println("Fakt : "+result);
        return result;
    }
    static int modAlma(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayi: ");
        int n1 = inp.nextInt();
        System.out.print("Ikinci Sayi: ");
        int n2 = inp.nextInt();
        int result = n1%n2;
        System.out.println("Mod Islemi : "+result);
        return result;
    }
    static void alanVeCevre(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayi: ");
        int n1 = inp.nextInt();
        System.out.print("Ikinci Sayi: ");
        int n2 = inp.nextInt();
        int cevre = 2*(n1+n2);
        int alan = n1*n2;
        System.out.println("Cevre : " +cevre);
        System.out.println("Alan: "+ alan);

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select ;
        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- UslU Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";
        System.out.println(menu);
        while (true){
            System.out.print("Bir islem seciniz: ");
            select = inp.nextInt();
            if (select==0){
                System.out.println("Cikis Yapildi");
                break;
            }

            switch (select){
                case 1:
                    toplam();
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usluSayi();
                    break;
                case 6:
                    fakt();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    alanVeCevre();
                    break;
            }
        }



    }

}



