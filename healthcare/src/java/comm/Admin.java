package comm;
// Generated Jul 20, 2019 3:30:31 PM by Hibernate Tools 4.3.1



/**
 * Admin generated by hbm2java
 */
public class Admin  implements java.io.Serializable {


     private String id;
     private String name;
     private String password;
     private String contact;
     private String dob;

    public Admin() {
    }

    public Admin(String id, String name, String password, String contact, String dob) {
       this.id = id;
       this.name = name;
       this.password = password;
       this.contact = contact;
       this.dob = dob;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getDob() {
        return this.dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }




}


