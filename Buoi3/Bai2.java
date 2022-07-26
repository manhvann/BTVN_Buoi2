package Buoi3;

import java.util.Scanner;
public class Bai2 {
    public static String str(String s,int k)
    {
        return s.substring(0,k)+s.substring(k+1);
    }
    public static void main(String[] args)
    {
        Scanner nhap=new Scanner(System.in);
        String s ;
        System.out.print("Nhap chuoi: ");
        s=nhap.nextLine();
        s.trim();
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i) ==' '&& s.charAt(i+1)==' ') {s=str(s,i);i=i-1;}
            if (!(s.charAt(i)>=65 && s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122) && s.charAt(i)!=' ')
            {
                s=str(s,i);
                i--;
            }
        }
        s=s.toLowerCase();
        char [] mangKiTu= s.toCharArray();
        if (mangKiTu[0]>=97&&mangKiTu[0]<=122) mangKiTu[0]-=32;
        for (int i=1;i<s.length();i++)
        {
            if (mangKiTu[i]>=97&& mangKiTu[i]<=122&&mangKiTu[i-1]==' ') mangKiTu[i]-=32;
        }
        s=String.valueOf(mangKiTu);
        System.out.println(s);
        }
    }
