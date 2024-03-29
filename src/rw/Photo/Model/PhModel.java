package rw.Photo.Model;


public class PhModel {
    private  int cameraid;
    private  String firstName;
    private String lastName;
    private String email;
    private String password;


    public PhModel(int cameraid, String firstName, String lastName, String email, String password){
        this.cameraid = cameraid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email  = email;
        this.password = password;

    }
public int getCameraid(){
        return cameraid;
}
public  void  setCameraid(){
}
public String getFirstName(){
        return firstName;
    }
public void setFirstName(){
        this.firstName = firstName;
}
public String getLastName(){
        return lastName;

}
public void setLastName(){
        this.lastName = lastName;

}
public String getEmail(){
        return email;

    }


    public void setEmail(){
        this.email = email;
    }

    public String getPassword(){
        return password;

    }
    public  void setPassword(){
        this.password = password;

    }
    }

