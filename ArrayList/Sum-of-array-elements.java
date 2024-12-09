package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list =new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int x=scanner.nextInt();
            list.add(x);
        }
        System.out.println(list);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
