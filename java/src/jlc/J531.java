package jlc;

public class J531 {

	public static void main(String[] args) {
	Customer c1=new Customer();
	c1.show();
	Customer c2=new Customer();
	c2.id=11;
	c2.name="manoj";
	c2.phone=123456;
	c2.show();
	

	}

}
class Customer{
int id;
String name;
long phone;
void show(){
System.out.println(id);
System.out.println(name);
System.out.println(phone);
	
}
}
