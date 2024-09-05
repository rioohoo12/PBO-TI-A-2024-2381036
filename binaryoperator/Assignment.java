package binaryoperator;

public class Assignment {
    public static void main(String[] args) {
        // 1. Operator assignment dasar
        int angka = 10;
        String nama = "Alice";

        System.out.println("Nilai angka : " + angka);
        System.out.println("Nilai nama : " + nama);

        // 2. Operator assignment airtmatika
        int x = 5;
        x += 3; //x = x + 3
        System.out.println("Nilai x setelah +=3: " + x);

        int y = 10;
        y -= 2;
        System.out.println("Nilai x setelah -= 2: " y);

        int z = 4;
        z *= 4;
        System.out.println("Nilai z setelah *= 5: "+ z);

        int a = 20;
        a /= 4;
        System.out.println("Nilai a setelah /=4 : " + a);

        int b = 13;
        a %=5;
        System.out.println("Nilai b setelah %= 5: " + b);
    }
}
