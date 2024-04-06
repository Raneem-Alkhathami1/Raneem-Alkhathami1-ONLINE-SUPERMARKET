 package project; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
   

public class SuperMarket {


    
    public static void main(String[] args) throws IOException 
    {
        //Program logo and Program name
       System.out.println("----------You Choose----------" 
                           +"\t\t\t----------We Shope---------- "
                          +"\t\t\t\t\t----------We Deliver---------- ");
       System.out.println();
      System.out.println("\t\t-----<Supermarket shopping is not a tedious task anymore Welcome to \"One Click\" Supermarket>-----");
          Scanner input = new Scanner (System.in);
       
       
       
       //Customer class part
        
        Scanner readIn = new Scanner (System.in);
        
        ArrayList<Customer> customers = new ArrayList<>();
        Customer cr= new Customer();
        Invoices text=new Invoices();
        Product p =new Product();
        
       
        int choice = 0;
        
        do {
            System.out.println("\n----------------------------");
            System.out.println("1- Enter (1) to add new Customer");
            System.out.println("2- Enter (2) to add products");
            System.out.println("3- Enter (3) to see the Invoice");
            System.out.println("4- Enter (4) to exit");
            System.out.println(">>>> Enter your choice :");
            
            String name = null;
                int number = 0;
                String email = null;
            
            
            choice=readIn.nextInt();
            if (choice==1){
                
                readIn.nextLine();
                System.out.println("Enter Customer name : ");
                 name = readIn.nextLine();
                System.out.println("Enter Customer number : ");
                number = readIn.nextInt();
                readIn.nextLine();
                System.out.println("Enter Customer email : ");
                email = readIn.nextLine();
                cr = new Customer(name,number,email);
                
                cr.WritingInFile();
            }
        
        


        
        
        
       
      //Product and invoice class part
       if (choice==2){
      
      ArrayList<Product> list = new ArrayList<>();
      Product p1 = new Product("Apple","Fruits and Vegetables section",340,15.5);
      Product p2 = new Product("Saudi coffee","Roaster section",451,35.25);
      Product p3 = new Product("Chocolate","Sweets section",562,40);
      Product p4 = new Product("Spanish Nuts Pie","Bakery section",673,70);
      Product p5 = new Product("Rasberry jam","Canned section",784,28);
      Product p6 = new Product("carrot","Fruits and Vegetables section",341,20);
      Product p7 = new Product("Nuts","Roaster section",452,25);
      Product p8 = new Product("Candies","Sweets section",563,45);
      Product p9 = new Product("French bakery","Bakery section",674,60);
      Product p10 = new Product("Mushrooms","Canned section",785,35);
      Product p11 = new Product("watermelon","Fruits and Vegetables section",342,10);
      Product p12 = new Product("Roasted coffee","Roaster section",453,80);
      Product p13 = new Product("Biscuit","Sweets section",564,30);
      Product p14 = new Product("Corn bread","Bakery section",675,39);
      Product p15 = new Product("White honey","Canned section",786,58.75);
      
      System.out.println();
      list.add(p1);
      list.add(p2);
      list.add(p3);
      list.add(p4);
      list.add(p5);
      list.add(p6);
      list.add(p7);
      list.add(p8);
      list.add(p9);
      list.add(p10);
      list.add(p11);
      list.add(p12);
      list.add(p13);
      list.add(p14);
      list.add(p15);
       
       int select = 0;
      
        
        do{
            System.out.println("To display the list of all products, please select the number -1-");
            System.out.println("To search for a product and its availability, please choose the number -2-");
            System.out.println("To select specific products, please choose the number -3-");
            System.out.println("To complete the order and purchase please choose the number -4-");
            System.out.println("To exit please choose the number -5-");
            System.out.println(">>>>> Enter your choice:");
            select = input.nextInt();
            switch(select){
                case 1:
                    System.out.println("-----Products List-----\n"+list.toString());
                    break;
                case 2:               System.out.println("Dear customer, enter the name of the product you want to search for, and upon completion, enter the word Done");

        String ProductName = input.next();

        while (!"Done".equals(ProductName)) {
            String pe = Product.Search(list, ProductName);

            

            System.out.println("Dear customer, enter the name of the product you want to search for, and upon completion, enter the word done");
            ProductName = input.next();

        }
                  break;
                case 3:
                    System.out.println("Dear customer, enter the ID of the product you want to choose, and when finished, enter the number 0");

        int ProductID = input.nextInt();

        while (ProductID != 0) {
            p = Product.SelectProducts(list, ProductID);

            

            System.out.println("Dear customer, enter the ID of the product you want to choose, and when finished, enter the number 0");
            ProductID = input.nextInt();

        }
                  break;
                case 4:
                 //Product p = new Product();
                 Invoices bill = new Invoices(cr,p);
                 System.out.print(bill);
                    break;
               
                    
       


            }
        
            System.out.println("\n----------------------------");
        
        }while (select!=5);
        
       }
       if (choice==3){
                
          Invoices bill = new Invoices(cr,p);
                 System.out.print(bill);
                    
          
        }
        
        }while(choice!=4);
    System.out.println("\nThank you for shopping from the \"one click\" supermarket");
    }
}


                                        
                                    