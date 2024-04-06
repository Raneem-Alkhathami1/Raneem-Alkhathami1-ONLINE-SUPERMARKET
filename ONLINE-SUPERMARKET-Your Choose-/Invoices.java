package project;
import java.util.ArrayList;

public class Invoices {


		    private static int ArrayList;
		    double total=0;
		     Customer customer;
		     Product product;
		    //Product product;
		    //Customer Customer1;
		    
		    public Invoices (String bill0,Product product0,int total0,Customer customer0){
		    
		    this.product = new Product(product0);
		    this.total=total;
		    this.customer= new Customer(customer0);
		    }
		    public Invoices(){
		        
		        this.product=null;
		        this.total=0;
		        this.customer=null;
		    }
		    
		    public Invoices(Customer c,Product p ){
		        customer = c;
		        product = p;
		    }

		   

		    public Product getProduct() {
		        return new Product (product);
		    }

		    public void setProduct(Product product) {
		        this.product = new Product (product);
		    }
		    /*public int gettotal() {
		        return total;
		    }*/
		    public void setint(int total) {
		        this.total = total;
		    }
		    
		    public Customer getCustomer() {
		        return new Customer (customer);
		    }

		    public void setCustomer(Customer customer) {
		        this.customer = new Customer (customer);
		    }
		    
		    public String toString(){
		        String text="Invoices information :\n"
		                    +"Customer information :"+ customer
		                    +"\nThe products :\n"+  product 
		                    +"\nThe total price :" + total ;
		        return text;
		       
		        
		    }

		   public void creatOrder(ArrayList<Product> list1, ArrayList<Product> list2) {
		  
		  
		  for (int i = 0; i < list1.size(); i++) {

		    int currentProductID1 = list1.get(i).getproductsID();

		    for (int j = 0; j < list2.size(); j++) {


		      int currentProductID2 = list2.get(j).getproductsID();

		      if (currentProductID1 == currentProductID2) 
		      {
		        total =total+list2.get(i).getproductsPrice();
		//list1.get(i).getproductsPrice();

		        break ;
		      }
		    }

		  }
		  System.out.println("total is: " + total);


		   }
		     
		        

		    
		
	}


