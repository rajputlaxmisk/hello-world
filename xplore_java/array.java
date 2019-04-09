package xplore_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class array 
{
public static void main (String arg[])
{
ArrayList<Integer> arr=new ArrayList<Integer>();
int a[]=new int[5];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
arr.add(10);
arr.add(52);
arr.add(5);
arr.add(0);
arr.add(1);
Collections.sort(arr);
for(Integer i:arr)
{
System.out.println(i);	
}
}
}
