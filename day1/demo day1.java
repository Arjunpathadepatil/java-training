import java.util.Scanner;



class demo{

public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.print("input a degree in fahreinheit:");
double fahrenheit=input.nextDouble();
double celsius= ((5*(fahrenheit-32.0))/9.0);


System.out.println(fahrenheit+"degree fahenheit is equal to"+celsius+"in celcius");
}
}