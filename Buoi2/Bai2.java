package Buoi2;
import java.util.Scanner;
public class Bai2 {
    public static void main (String[] args)
    {
        int a,b,c,can=0,deu=0,vuong=0,tm=0;
        Scanner scanner =new Scanner(System.in);
        System.out.printf("Nhap ba so nguyen: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if (a+b>c && a+c>b &&b+c>a)
        {
            tm=1;
            if (a==b||b==c||a==c) can=1;
            if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) vuong=1;
            if (a==b&&b==c) deu=1;
        }
        else System.out.println("Ba so vua nhap ko tao thanh mot tam giac");
        if (deu==1) System.out.println("Ba so vua nhap tao thanh mot tam giac deu");
        else if(vuong==1&&can==1) System.out.println("Ba so vua nhap tao thanh mot tam giac vuong can");
        else if(vuong==1) System.out.println("Ba so vua nhap tao thanh mot tam giac vuong");
        else if (can==1) System.out.println("Ba so vua nhap tao thanh mot tam giac can");
        else if (tm==1) System.out.println("Ba so vua nhap tao thanh tam giac thuong");
    }
}
