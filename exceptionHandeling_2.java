import java.util.*;
import java.io.*;
public class PL_Exp4{
public static void printArray(int A[]){
for(int i=0;i<A.length;i++){
System.out.print(i+" ");
}
System.out.println();
for(int i=0;i<A.length;i++){
System.out.print(A[i]+" ");
}
System.out.println();
}
public static void main(String arg[])throws Exception{
int A[]={11,22,33};
BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
try{
System.out.println("User Defined Exception : ");
System.out.println("Enter your age : ");
int age=Integer.parseInt(rd.readLine());
System.out.println("Your age is "+age);
if(age>=18){
System.out.println("You are eligible for Driving");
}else{
throw new Exception("You are not eligible to Drive");
}
System.out.println("Divide by Zero exeption : ");
System.out.println("Enter Two Numbers : ");
int a=Integer.parseInt(rd.readLine());
int b=Integer.parseInt(rd.readLine());
System.out.println("Division="+(a/b));
printArray(A);
System.out.println("Array Index out of bound exception : ");
System.out.println("Enter index of array to access element : ");
int ind=Integer.parseInt(rd.readLine());
System.out.println("Element at index "+ind+" is "+A[ind]);
System.out.println("NUll pointer exception : ");
String temp=null;
System.out.println(temp.length());
}
catch(Exception e){ 
System.out.println("Exception Message : "+e.getMessage());
}
}
}
