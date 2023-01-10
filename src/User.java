import java.sql.Date;

public class User{
    private String name;
    private String email;
    String course;
    int yearOfEntry;
    int admissionPeriod;     

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    } 
    

}
