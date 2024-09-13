import java.util.*
class aditya{
float r,pi=3,142f;
static void area(float r){
System.out.println("The Area Of Circle Is = "+pi*r*r);
}
static void circumference(float r){
System.out.println("The Circumference Of Circle Is = "+2*pi*r);
}
public static void main(String args[]){
aditya a=new aditya();
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Radius Of The Circle : ");
r=nextInt();
a.area(r);
a.circumference(r);
}
}
