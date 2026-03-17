package hospital;
 //Patient class
public  class Patient {
 //Private variables (data hiding)  
 private int PatientId;
 private String name;
 private int age;
 private String disease;
 
 //Setter Methods
  public void  setId(int id) {
        this.PatientId = id;
  }
  public void setAge(int age){
      if(age > 0 && age < 120)
        this.age = age;
      else
        System.out.println("Invalid Age!"); 
  }
  public void setName(String n){
      this.name = n;
  }
  public void setDis(String dis){
      this.disease = dis;
  }
    
 //Getter Methods
  public int getId(){
      return PatientId;
    }
  public int getAge(){
      return age;
    }
  public String getName(){
      return name;
    }
  public String getDis(){
      return disease;
    }
}

//Main class
public class Hospital {

    public static void main(String[] args) {
        
        //Creating object of Patient class
        Patient p1 = new Patient();
        //Setting values using setter methods (Encapsulatiion)
           p1.setName("Joe");
           p1.setId(101);
           p1.setAge(12);
           p1.setDis("Asthma");
            
          System.out.println("---Patient Details---"); 
        {
        //Displaying patient information using getter mathods     
        System.out.println("\nID : " + p1.getId());
        System.out.println("Name : " + p1.getName());
        System.out.println("Age : " + p1.getAge());
        System.out.println("Disease : " + p1.getDis());
    
        }
    }
}
