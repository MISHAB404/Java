import java.util.Scanner;
class Cpu 
{
  int price = 35000;


class Processor
{
  int num_of_cores = 4;
  String manufacturer = "intel Corp";	
   
   void display()
   {
     System.out.println("Number of cores : "+ num_of_cores+"Cores");
     System.out.println("Manufacturer : "+ manufacturer);
   }
}
 void display()
 {
   Processor p = new Processor();
   p.display();
   System.out.println("Price : " + price +"/-");
 }


static class Ram
{
  int memory = 8;
  String manufacturer = "Corsair";

   void display()
   {
     System.out.println("Memory Capacity : "+ memory +"gb");
     System.out.println("Manufacturer : "+ manufacturer);
   }
}
}
class Cpus
{
  public static void main(String[] args)
  {
    Cpu c1 = new Cpu();
    c1.display();
    Cpu.Ram r1 = new Cpu.Ram();
    r1.display(); 
  }
}
