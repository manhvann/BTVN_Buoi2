package Buoi3;
import java.util.Scanner;
public class Bai1 {
    public static float TBC(int n,int  [] a)
    {
        float t=0;
        int dem=0;
        for (int i=0;i<n;i++)
        {
            if(i%2==0||a[i]%2==1)
            {
                t+=a[i];
                dem++;
            }
        }
        return t/dem;
    }
    public static void NN(int n, int a[]) {
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) min = a[i];
        }
        System.out.print("Vi tri cac so nho nhat trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (a[i] == min) System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int KTSCP(int k)
    {
        if (k<=1) return 0;
        if ((int)Math.sqrt(k)*(int)Math.sqrt(k)==k) return 1;
        return 0;
    }
    public static void SCP(int n,int a[])
    {
        int kt=0;
        for (int i=0;i<n;i++)
        {
           if (KTSCP(a[i])==1) System.out.print(a[i]+" ");
           kt=1;
        }
        if (kt==0) System.out.println("Mang ko co so chinh phuong");
        else System.out.println();
    }
    public static boolean ktnt(int k)
    {
        for(int i=2;i<=Math.sqrt(k);i++)
        {
            if (k%i==0) return false;
        }
        return k>1;
    }
    public static void nto(int n,int a[]) {
        int kt=0;
        for (int i = 0; i < n; i++) {
            kt=1;
            if (ktnt(a[i])) System.out.print(a[i] + " ");
        }
        if (kt==1) System.out.println();
    }
    public static void main(String[] args)
    {
        int n = 0;
        int [] a=new int[1000];
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n=nhap.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.print("Nhap a["+i+"]= ");
            a[i]=nhap.nextInt();
        }
        System.out.println("TBC cac so le o vi tri chan la: "+TBC(n,a));
        NN(n,a);
        SCP(n,a);
        nto(n,a);
        int tg;
        for (int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    tg=a[i];
                    a[i]=a[j];
                    a[j]=tg;
                }
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}
