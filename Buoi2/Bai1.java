package Buoi2;

import java.util.Scanner;

public class Bai1 {

        public static void main(String[] args) {
            int ngay, thang;
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Nhap ngay sinh: ");
            ngay = scanner.nextInt();
            System.out.printf("Nhap thang sinh: ");
            thang = scanner.nextInt();
            if (ngay >= 20 && ngay <= 31 && thang == 1 || ngay >= 1 && ngay <= 18 && thang == 2)
                System.out.println("Cung bao binh");
            if (ngay >= 19 && ngay <= 28 && thang == 2 || ngay >= 1 && ngay <= 20 && thang == 3)
                System.out.println("Cung song ngu");
            if (ngay >= 21 && ngay <= 31 && thang == 3 || ngay >= 1 && ngay <= 20 && thang == 4)
                System.out.println("Cung bach duong");
            if (ngay >= 21 && ngay <= 30 && thang == 4 || ngay >= 1 && ngay <= 20 && thang == 5)
                System.out.println("Cung kim nguu");
            if (ngay >= 21 && ngay <= 31 && thang == 5 || ngay >= 1 && ngay <= 21 && thang == 6)
                System.out.println("Cung song tu");
            if (ngay >= 22 && ngay <= 30 && thang == 6 || ngay >= 1 && ngay <= 22 && thang == 7)
                System.out.println("Cung su giai");
            if (ngay >= 23 && ngay <= 31 && thang == 7 || ngay >= 1 && ngay <= 22 && thang == 8)
                System.out.println("Cung su tu");
            if (ngay >= 23 && ngay <= 31 && thang == 8 || ngay >= 1 && ngay <= 22 && thang == 9)
                System.out.println("Cung xu nu");
            if (ngay >= 23 && ngay <= 30 && thang == 9 || ngay >= 1 && ngay <= 23 && thang == 10)
                System.out.println("Cung thien binh");
            if (ngay >= 24 && ngay <= 31 && thang == 10 || ngay >= 1 && ngay <= 22 && thang == 11)
                System.out.println("Cung bo cap");
            if (ngay >= 23 && ngay <= 30 && thang == 11 || ngay >= 1 && ngay <= 21 && thang == 12)
                System.out.println("Cung nhan ma");
            if (ngay >= 22 && ngay <= 31 && thang == 12 || ngay >= 1 && ngay <= 19 && thang == 1)
                System.out.println("Cung ma ket");
        }

}
