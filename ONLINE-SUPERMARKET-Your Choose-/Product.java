package project;

import java.util.ArrayList;



public class Product 
{

    
    

    
    
   private  String productsName;
   private  String productsType;
   private  int productsID;
   private  double productsPrice;
    private Object list;

    
    
    public Product()
    {
        productsName= null;
        productsType= null;
        productsID = 0;
        productsPrice = 0.0;
    }
    
    public Product(String productsName,String productsType,int productsID,double productsPrice )
    {
        this.productsName = productsName;
        this.productsType = productsType;
        this.productsID = productsID;
        this.productsPrice = productsPrice;
    }

    Product(Product product0) {
        
    }

    
    
    
    
    public void setproductsName(String productsName)
    {
        this.productsName = productsName;
    }
    
   public void setproductsType(String productsType)
    {
        this.productsType = productsType;
    }
   
    
   public void setproductsID(int productsID)
    {
        this.productsID = productsID;
    } 
   
  public void setproductsPrice(int productsPrice)
    {
        this.productsPrice = productsPrice;
    }  
  
  
  public String getproductsName()
  {
      return this.productsName;
  }
  
   public String getproductsType()
    {
        return this.productsType;
    }
  
public int getproductsID()
  {
      return this.productsID;
  }

public double getproductsPrice()
  {
      return this.productsPrice;
  }


public String toString()

{
  String str = "\nProducts name : " + productsName + 
          "\nProducts type: " + productsType + 
          "\nProducts ID: " + productsID  +
                  "\n Products price: "+productsPrice+"SR";
   return str;
}
public static String Search(ArrayList<Product> list,String productsName)
{
  for(int i =0; i<list.size();i++) 
  {
    String currentProductName = list.get(i).getproductsName();  
    
    if(productsName.equals(currentProductName))
    {
      System.out.println("This product is available");
      System.out.println("informations related to this product:\n" + list.get(i));
                return currentProductName;
                   
    }
  }
  
   System.out.println("Sorry,this product is not available"); 
   return null;
}
 
public static Product SelectProducts(ArrayList<Product> list, int productsID) {

        for (int i = 0; i < list.size(); i++) {

            Product currentProduct = list.get(i);
            int currentProductID = currentProduct.getproductsID();

            if (productsID == currentProductID) {
                System.out.println("informations related to this product ID:\n" + list.get(i));
                return currentProduct;
            }
        }
        System.out.println("Sorry but this product ID is wrong");
        return null;

    }


}