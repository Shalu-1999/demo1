class A{
public void funA1(){
System.out.println("funA1 called from class A");
}
public void funA2(){
System.out.println("funA2 called from class A");
}
}
class B
{
public static void main(String args[]){
A obj=new A();
obj.funA1();
obj.funA2();
}
}