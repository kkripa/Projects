package Classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int UserID;
    private String First_Name;
    private String Last_Name;
    private String Email_Address;
    private String Address_1_Field;
    private String Address_2_Field;
    private String City;
    private String State;
    private int Post_Code;
    private String Country;
    private String Password;

    public User()
    {
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getEmail_Address() {
        return Email_Address;
    }

    public void setEmail_Address(String Email_Address) {
        this.Email_Address = Email_Address;
    }

    public String getAddress_1_Field() {
        return Address_1_Field;
    }

    public void setAddress_1_Field(String Address_1_Field) {
        this.Address_1_Field = Address_1_Field;
    }

    public String getAddress_2_Field() {
        return Address_2_Field;
    }

    public void setAddress_2_Field(String Address_2_Field) {
        this.Address_2_Field = Address_2_Field;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getPost_Code() {
        return Post_Code;
    }

    public void setPost_Code(int Post_Code) {
        this.Post_Code = Post_Code;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
            
}
