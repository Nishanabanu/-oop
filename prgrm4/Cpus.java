
class Cpu{
int price=50000;
	class Processor{
	int noOfCores=4;
	String manufacturer="Intel corp";
	void display(){
	System.out.println("PROCESSOR");
	System.out.println("----------");
	System.out.println("Number of cores:"+noOfCores);
	System.out.println("Manufacturer:"+manufacturer);
	}
	}
void display(){
Processor p=new Processor();
p.display();
System.out.println("\nCPU");
System.out.println("------");
System.out.println("Price:"+price);
}
static class Ram{
int memory=8;
String manufacturer="Corsair";
void display(){
System.out.println("\nRAM");
System.out.println("--------");
System.out.println("Memory:"+memory);
System.out.println("Manufacturer:"+manufacturer);
}
}
}
class Cpus{
public static void main(String[]args){
Cpu c1=new Cpu();
c1.display();
Cpu.Ram r1=new Cpu.Ram();
r1.display();
}
}
