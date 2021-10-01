class Student 
{
String name, roll;
int marks;
Address addr;

void getData(String name, String roll, int marks, Address addr)
{
this.name=name;
this.roll=roll;
this.marks=marks;
this.addr=addr;
}

void putData()
{
System.out.println("Roll No:"+roll+"\tName:"+name+"\tMarks:"+marks);
addr.printAddress();
}
}

class HasArelationship
{
public static void main(String args[])
{
Student sob=new Student();
Address aob=new Address("345", "45", "Gurgaon", "122004");
sob.getData("Amit", "101", 78, aob);
sob.putData();
}
}
