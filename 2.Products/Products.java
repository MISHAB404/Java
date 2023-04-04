import java.util.Scanner;

class Product
{
    int Pcode, Price;
    String Pname;
    Product(int Pcode, String Pname, int Price)
    {
        this.Pcode = Pcode;
	this.Price = Price;
        this.Pname = Pname;
    }
} 

class Products 
{
   public static void main(String[] args)
   {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the product code : ");
        int Pcode = sc.nextInt();
	System.out.print("Enter the product Name : ");
        String Pname = sc.next();
	System.out.print("Enter the product Price : ");
        int Price = sc.nextInt();

        Product[] ps = new Product[3];
	ps[0] = new Product(Pcode,Pname,Price);
	ps[1] = new Product(101,"Apple",56);
	ps[2] = new Product(102,"Banana",45);
	
	int minprice = ps[0].Price;
	System.out.println("--------------------------------------------");
	System.out.println("Product code | Product Name | Product Price ");
 	System.out.println("--------------------------------------------");

	for(Product p : ps)
	{
           System.out.println(p.Pcode + "\t           " + p.Pname + "\t      " + p.Price);
	   if(minprice > p.Price) 
           {
              minprice = p.Price;
           }
        }

	System.out.println(" ");
	System.out.println("The Minimum Cost Product is : ");
 	System.out.println("--------------------------------------------");
	
	for(Product p : ps)
	{
           if(minprice == p.Price)
	   {
 	      System.out.println("Product Code  : " + p.Pcode);
	      System.out.println("Product Name  : " + p.Pname);
	      System.out.println("Product Price : " + p.Price);
           }
        }
   }
}
