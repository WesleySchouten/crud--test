
package java_project_1_2;


public class Product {
    private int id;
    private String firstName;
    private String lastName;
    private String woonPlaats;
    private String Addres;
    private int telefoonNummer;
   
   
    
    public Product(int pid, String pfirstName, String plastName, String pwoonPlaats, String pAddres, int ptelefoonNummer){
       this.id = pid;
       this.firstName = pfirstName;
       this.lastName = plastName;
       this.woonPlaats = pwoonPlaats;
       this.Addres = pAddres;
       this.telefoonNummer = ptelefoonNummer;
       
       
    }
    public int getId(){
        return id;
    }
    
    public String getfirstName(){
        return firstName;
    }
     public String getlastName(){
        return lastName;
    }
      public String getwoonPlaats(){
        return woonPlaats;
    }
    
    
    public String getaddres(){
        return Addres;
    }
    public int gettelefoonNummer(){
        return telefoonNummer;
    }
    
   
    
}
