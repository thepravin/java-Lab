import java.util.*;
public class EX4_PL{ 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the 1st Number: "); 
int a = sc.nextInt(); 
System.out.print("Enter the 2nd Number: "); 
int b = sc.nextInt(); 
// Array out of bound index 
int arr[] = {1,2,3,4,5,6}; 
try { 
// String s = null; 
// System.out.println(s.length()); 
int c = a/b; 
System.out.print("Divide: "+c); 
// Array out of bound index 
System.out.println(); 
System.out.println("Array Element:"); 
for(int i=0;i<5;i++){ 
System.out.print(arr[i]+"\t"); 
} 
System.out.println(); 
System.out.println("Enter the element to be accessed: "); 
int index = sc.nextInt(); 
System.out.println(arr[index]); 
//input mismatch exception 
System.out.println("Enter value of a to get its square value:"); 
Integer d = sc.nextInt(); // we give any float value as input 
System.out.println((d*d)); 
System.out.println("Input Format Exception:"); 
int n = Integer.parseInt ("Test") ; 
System.out.println(n); 
//NullPointerException 
String str = null; 
System.out.println("String is Null: "); 
System.out.println(+str.length()); 
} catch(Exception e) { 
System.out.println(e); 
} 
} 
}
