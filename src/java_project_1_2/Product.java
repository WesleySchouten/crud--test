
package java_project_1_2;


public class Product {
    private int id;
    private String name;
    private float price;
    private String addDate;
   
    
    public Product(int pid, String pname, float pprice){
       this.id = pid;
       this.name = pname;
       this.price = pprice;
       
       
    }

   

 
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public float getPrice(){
        return price;
    }
    
    
   
    
}
