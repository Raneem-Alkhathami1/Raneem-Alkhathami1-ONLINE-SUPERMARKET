import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Customer {

    
    
    String name;
    int number;
    String email;
  
    private String nameOfCustomer;
    private int phoneNumber;
    private String emailCustomer;

    public Customer() {
        this.nameOfCustomer="";
        this.phoneNumber=0;
        this.emailCustomer="";
        
    }

    public Customer(String nameOfCustomer, int phoneNumber, String emailCustomer) {
        this.nameOfCustomer = nameOfCustomer;
        this.phoneNumber = phoneNumber;
        this.emailCustomer = emailCustomer;
    }

    Customer(Customer customer0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }
    
    public String toString(){
        String data;
        data="Customer name : "+this.nameOfCustomer+"\nCustomer phone number : "+this.phoneNumber+
                "\nCustomer email : "+this.emailCustomer;
        return data;
    }
    public void WritingInFile() throws IOException{
        FileWriter myFile= new FileWriter("Customer information.txt",true);
        PrintWriter write= new PrintWriter(myFile);
        
        write.print(this.nameOfCustomer+"\t");
        write.print(this.phoneNumber+"\t");
        write.print(this.emailCustomer+"\t");
        
        write.close(); 
    }
    
    public void displayInformation() throws FileNotFoundException{
        
        System.out.println("Customer name\t phone number\t Customer email");
        File file = new File("Customer information.txt");
        Scanner readIn = new Scanner(file);
        
        while(readIn.hasNext()){
            String line =readIn.nextLine();
            System.out.println(line);
        }
        readIn.close();
    }
}

