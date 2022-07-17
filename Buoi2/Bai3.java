package Buoi2;

import java.util.Scanner;

public class Bai3 {
    public static void main (String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n=scanner.nextInt();
        long tonguoc=1+n;
        for (int i=2;i<n;i++)
        {
            if (n%i==0) tonguoc+=i;
        }
        System.out.println("Tong cac uoc cua n la: "+tonguoc);
    }
}
